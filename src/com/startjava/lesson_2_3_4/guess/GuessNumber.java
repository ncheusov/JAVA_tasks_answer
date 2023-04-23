package startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static final int UPPER_BOUNDARY = 100;
    private final Player[] players;
    private int hiddenNumber;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void start() {
        hiddenNumber = RANDOM.nextInt(UPPER_BOUNDARY) + 1;
        do {
            if (isGuessed()) {
                break;
            }
        } while (true);
        for (Player player : players) {
            printPlayerAttempts(player);
            player.clearAttempts();
        }
    }

    private boolean isGuessed() {
        for (Player player : players) {
            inputNumber(player);
            if (!compareNumbers(player)) {
                return true;
            }
        }
        return false;
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + ", угадай число: ");
        if (!player.addNumber(SCANNER.nextInt())) {
            System.out.println("Угадываемое число должно быть в полуинтервале (0, 100], повторите попытку.");
            inputNumber(player);
        }
    }

    private boolean compareNumbers(Player player) {
        int lastEnteredNumber = player.getLastNumber();
        if (lastEnteredNumber == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число "
                    + hiddenNumber + " с " + player.getAttempt() + " попытки");
            return false;
        }
        String lessOrMore = (lastEnteredNumber < hiddenNumber) ? " меньше" : " больше";
        System.out.println("Число " + player.getLastNumber() + lessOrMore + ", чем загадал компьютер");
        return true;
    }

    private void printPlayerAttempts(Player player) {
        int[] attempts = player.getNumbers();
        for (int number : attempts) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
