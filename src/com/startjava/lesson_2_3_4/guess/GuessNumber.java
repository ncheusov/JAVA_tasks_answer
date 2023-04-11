package startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private final Player PLAYER1;
    private final Player PLAYER2;

    public GuessNumber(Player PLAYER1, Player PLAYER2) {
        this.PLAYER1 = PLAYER1;
        this.PLAYER2 = PLAYER2;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int hiddenNum = random.nextInt(100) + 1;
        int player1Attempt = 1;
        int player2Attempt = 1;
        int i = 0;
        int[] player1Nums = new int[10];
        int[] player2Nums = new int[10];
        while (true) {
            System.out.print(PLAYER1.getName() + ", угадай число: ");
            player1Nums[i] += scan.nextInt();
            PLAYER1.setNumber(player1Nums);
            if (PLAYER1.getNumbers()[i] == hiddenNum && player1Attempt != 3) {
                System.out.println("Игрок " + PLAYER1.getName() + " угадал число "
                        + PLAYER1.getNumbers()[i] + " с " + player1Attempt + " попытки");
                break;
            }
            if (PLAYER1.getNumbers()[i] < hiddenNum && player1Attempt != 3) {
                System.out.println("Число " + PLAYER1.getNumbers()[i] + " меньше того, что загадал компьютер");
            } else if (PLAYER1.getNumbers()[i] > hiddenNum && player1Attempt != 3) {
                System.out.println("Число " + PLAYER1.getNumbers()[i] + " больше того, что загадал компьютер");
            } else {
                System.out.println("У " + PLAYER1.getName() + " закончились попытки");
                continue;
            }
            player1Attempt++;

            System.out.print(PLAYER2.getName() + ", угадай число: ");
            player2Nums[i] += scan.nextInt();
            PLAYER2.setNumber(player2Nums);
            if (PLAYER2.getNumbers()[i] == hiddenNum && player2Attempt != 3) {
                System.out.println("Игрок " + PLAYER2.getName() + " угадал число "
                        + PLAYER2.getNumbers()[i] + " с " + player2Attempt + " попытки");
                break;
            }
            if (PLAYER2.getNumbers()[i] < hiddenNum && player2Attempt != 3) {
                System.out.println("Число " + PLAYER2.getNumbers()[i] + " меньше того, что загадал компьютер");
            } else if (PLAYER2.getNumbers()[i] > hiddenNum && player2Attempt != 3) {
                System.out.println("Число " + PLAYER2.getNumbers()[i] + " больше того, что загадал компьютер");
            } else {
                System.out.println("У " + PLAYER2.getName() + " закончились попытки");
                continue;
            }
            player2Attempt++;
            i++;
        }
        printAllNumbersWithoutZero(PLAYER1.getNumbers());
        System.out.println();
        printAllNumbersWithoutZero(PLAYER2.getNumbers());
    }

//    private int[] clear(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//
//            }
//        }
//    }

    private void printAllNumbersWithoutZero(int[] numbers) {
        for (int digit : numbers) {
            System.out.print(digit + " ");
        }
    }
}
