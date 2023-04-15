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
        int hiddenNum = random.nextInt(100) + 1;
        int player1Attempt = 1;
        int player2Attempt = 1;
        int i = 0;
        String name1 = player1.getName();
        String name2 = player2.getName();
        while (true) {
            player1.addNumber(inputNumber(name1), i);
            if (isEqual(player1.getNumbers()[i], hiddenNum, player1Attempt, name1)) {
                break;
            }
            if (isNotEqual(player1.getNumbers()[i], hiddenNum, player1Attempt)) {
                player1Attempt++;
            }
            player2.addNumber(inputNumber(name2), i);
            if (isEqual(player2.getNumbers()[i], hiddenNum, player2Attempt, name2)) {
                break;
            }
            if (isNotEqual(player2.getNumbers()[i], hiddenNum, player2Attempt)) {
                player2Attempt++;
            }
            endedOfAttempts(player1Attempt, player2Attempt, name1, name2);
            i++;
        }
        printPlayerAttempts(player1.getNumbers(), player2.getNumbers());
    }

    private boolean isEqual(int num, int hiddenNum, int attempt, String name) {
        if (num == hiddenNum && attempt != 10) {
            System.out.println("Игрок " + name + " угадал число "
                    + hiddenNum + " с " + attempt + " попытки");
            return true;
        }
        return false;
    }

    private boolean isNotEqual(int num, int hiddenNum, int attempt) {
        if (num < hiddenNum && attempt != 10) {
            System.out.println("Число " + num + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Число " + num + " больше того, что загадал компьютер");
        }
        return true;
    }

    private void endedOfAttempts(int player1Attempt, int player2Attempt, String name1, String name2) {
        if (player1Attempt == 10) {
            System.out.println("У " + name1 + " закончились попытки");
        } else if (player2Attempt == 10) {
            System.out.println("У " + name2 + " закончились попытки");
        }
    }

    private int inputNumber(String name) {
        System.out.print(name + ", угадай число: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    private void printPlayerAttempts(int[] attempts, int[] attempts2) {
        for (int digit : attempts) {
            System.out.print(digit + " ");
        }
        System.out.println();
        for (int digit : attempts2) {
            System.out.print(digit + " ");
        }
    }
}
