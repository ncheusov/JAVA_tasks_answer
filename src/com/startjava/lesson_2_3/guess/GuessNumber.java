package startjava.lesson_2_3.guess;

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
        while (true) {
            System.out.print(player1.getName() + ", угадай число: ");
            player1.setNumber(scan.nextInt());
            if (player1.getNumber() == hiddenNum) {
                System.out.println(player1.getName() + " победил");
                break;
            }
            if (player1.getNumber() < hiddenNum) {
                System.out.println("Число " + player1.getNumber() + " меньше того, что загадал компьютер");
            } else if (player1.getNumber() > hiddenNum) {
                System.out.println("Число " + player1.getNumber() + " больше того, что загадал компьютер");
            }

            System.out.print(player2.getName() + ", угадай число: ");
            player2.setNumber(scan.nextInt());
            if (player2.getNumber() == hiddenNum) {
                System.out.println(player2.getName() + " победил");
                break;
            }
            if (player2.getNumber() < hiddenNum) {
                System.out.println("Число " + player2.getNumber() + " меньше того, что загадал компьютер");
            } else if (player2.getNumber() > hiddenNum) {
                System.out.println("Число " + player2.getNumber() + " больше того, что загадал компьютер");
            }
        }
    }
}
