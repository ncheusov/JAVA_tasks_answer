package startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private static final int UPPER_BOUNDARY = 100;
    private static final int LOWER_BOUNDARY = 1;
    private static final int ROUND = 3;
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();
    private final Player[] players;
    private int hiddenNumber;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void start() {
        castLots();
        int roundCounter = 1;
        while (roundCounter <= ROUND) {
            hiddenNumber = random.nextInt(UPPER_BOUNDARY) + LOWER_BOUNDARY;
            do {
                if (isGuessed()) {
                    break;
                }
            } while (true);
            System.out.println("Раунд " + roundCounter + " завершен.");
            roundCounter++;
            for (Player player : players) {
                printPlayerAttempts(player);
                player.clearAttempts();
            }
        }
        pickWinner();
    }

    private void castLots() {
        int length = players.length;
        for (int i = length - 1; i > 0; i--) {
            int randomIndex = random.nextInt(i);
            Player tmp = players[randomIndex];
            players[randomIndex] = players[i];
            players[i] = tmp;
        }
        System.out.println("\nПорядок угадывания:");
        for (int i = 0; i < length; i++) {
            System.out.println((i + 1) + "-й: " + players[i].getName());
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
        if (!player.addNumber(scanner.nextInt())) {
            System.out.println("Угадываемое число должно быть в полуинтервале (0, 100], повтори попытку.");
            inputNumber(player);
        }
    }

    private boolean compareNumbers(Player player) {
        int lastEnteredNumber = player.getLastNumber();
        if (lastEnteredNumber == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число "
                    + hiddenNumber + " с " + player.getAttempt() + " попытки");
            player.addScore();
            return false;
        }
        String lessOrMore = (lastEnteredNumber < hiddenNumber) ? " меньше" : " больше";
        System.out.println("Число " + lastEnteredNumber + lessOrMore + ", чем загадал компьютер");
        return true;
    }

    private void printPlayerAttempts(Player player) {
        int[] attempts = player.getNumbers();
        for (int number : attempts) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private void pickWinner() {
        Player winner = players[0];
        for (int i = 0; i < players.length - 1; i++) {
            if (players[i].getScore() > players[i + 1].getScore()) {
                winner = players[i];
            }
        }
        System.out.println("Победил " + winner.getName());
    }
}
