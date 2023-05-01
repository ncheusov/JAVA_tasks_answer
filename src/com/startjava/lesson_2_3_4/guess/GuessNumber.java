package startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private static final int ROUNDS = 3;
    private final Player[] players;
    private int hiddenNumber;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void start() {
        Random random = new Random();
        castLots(random);
        int currentRound = 1;
        while (currentRound <= ROUNDS) {
            hiddenNumber = random.nextInt(Player.getStartRange()) + Player.getEndRange();
           while (!isGuessed()) {
               continue;
           }
            System.out.println("Раунд " + currentRound + " завершен.");
            currentRound++;
            for (Player player : players) {
                printPlayerAttempts(player);
                player.clearAttempts();
            }
        }
        defineWinner();
    }

    private void castLots(Random random) {
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
        Scanner scanner = new Scanner(System.in);
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
            player.upScore();
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

    private void defineWinner() {
        int maxScore = players[0].getScore();
        int winnerIndex = 0;
        for (int i = 1; i < players.length; i++) {
            if (players[i].getScore() > maxScore) {
                maxScore = players[i].getScore();
                winnerIndex = i;
            }
        }
        boolean isDraw = false;
        for (int i = 0; i < players.length; i++) {
            if (i != winnerIndex && players[i].getScore() == maxScore) {
                isDraw = true;
                break;
            }
        }
        if (isDraw) {
            System.out.println("Ничья!");
        } else {
            System.out.println("Победил " + players[winnerIndex].getName());
        }
    }
}
