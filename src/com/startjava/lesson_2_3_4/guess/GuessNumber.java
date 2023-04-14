package startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int hiddenNum = random.nextInt(100) + 1;
        int player1Attempt = 1;
        int player2Attempt = 1;
        int i = 0;
        while (true) {
            guess(player1.getName());
            player1.addNumber(scan.nextInt(), i);
            if (isEqual(player1.getNumbers()[i], hiddenNum, player1Attempt, player1.getName())) {
                break;
            }
            isNotEqual(player1.getNumbers()[i], hiddenNum, player1Attempt);
            endedOfAttempts(player1Attempt, player1.getName());
            player1Attempt++;

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

    private void isNotEqual(int num, int hiddenNum, int attempt) {
        if (num < hiddenNum && attempt != 10) {
            System.out.println("Число " + num + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Число " + num + " больше того, что загадал компьютер");
        }
    }

    private void endedOfAttempts(int attempt, String name) {
        if (attempt == 10) {
            System.out.println("У " + name + " закончились попытки");
        }
    }

    private void guess(String name) {
        System.out.print(name + ", угадай число: ");
    }

    private void printPlayerAttempts(int[] attempts, int[] attempts2) {
        for (int digit : attempts) {
            System.out.print(digit + " ");
        }
        System.out.println();
        for (int digit : attempts2) {
            System.out.println(digit + " ");
        }
    }
}
