package startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private final Player[] players;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void start() {
        Random random = new Random();
        int hiddenNumber = random.nextInt(100) + 1;
        do {
            if (isGuessed(hiddenNumber)) {
                break;
            }
        } while (true);
        for (Player player : players) {
            printPlayerAttempts(player);
            player.clearAttempts();
        }
    }

    private boolean isGuessed(int hiddenNumber) {
        for (Player player : players) {
            inputNumber(player);
            if (!compareNumbers(player, hiddenNumber)) {
                return true;
            }
        }
        return false;
    }

    private void inputNumber(Player player) {
        try {
            System.out.print(player.getName() + ", угадай число: ");
            Scanner scan = new Scanner(System.in);
            player.addNumber(scan.nextInt());
        } catch (RuntimeException ex) {
            inputNumber(player);
        }
    }

    private boolean compareNumbers(Player player, int hiddenNumber) {
        if (player.getLastNumber() == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число "
                    + hiddenNumber + " с " + player.getAttempt() + " попытки");
            return false;
        }
        String lessOrGreater = (player.getLastNumber() < hiddenNumber) ? " меньше" : " больше";
        System.out.println("Число " + player.getLastNumber() + lessOrGreater + ", чем загадал компьютер");
        return true;
    }

    private void printPlayerAttempts(Player player) {
        int[] playerNumbers = player.getNumbers();
        for (int digit : playerNumbers) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }
}
