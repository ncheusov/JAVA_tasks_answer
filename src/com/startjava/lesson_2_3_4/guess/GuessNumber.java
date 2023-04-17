package startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Random random = new Random();
        int hiddenNumber = random.nextInt(100) + 1;
        do {
            if (equal(hiddenNumber)) {
                break;
            }
        } while (true);
        for (Player player : new Player[] {player1, player2}) {
            printPlayerAttempt(player);
            player.clearAttempts();
        }
    }

    private boolean equal(int hiddenNumber) {
        for (Player player : new Player[] {player1, player2}) {
            inputNumber(player);
            if (!isEqual(player, hiddenNumber)) {
                return true;
            }
        }
        return false;
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + ", угадай число: ");
        Scanner scan = new Scanner(System.in);
        player.addNumber(scan.nextInt());
    }

    private boolean isEqual(Player player, int hiddenNumber) {
        if (player.getLastNumber() == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число "
                    + hiddenNumber + " с " + player.getAttempt() + " попытки");
            return false;
        }
        if (player.getLastNumber() < hiddenNumber) {
            System.out.println("Число " + player.getLastNumber() + " меньше, чем загадал компьютер");
        } else {
            System.out.println("Число " + player.getLastNumber() + " больше, чем загадал компьютер");
        }
        if (player.getAttempt() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return true;
    }

    private void printPlayerAttempt(Player player) {
        int length = player.getNumbers().length;
        int[] intArray = player.getNumbers();
        for (int i = 0; i < length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
    }
}
