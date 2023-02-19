import java.util.Scanner;

public class GuessNumber {

    private int computerNumber = (int) Math.round(Math.random() * 100);
    private Scanner scan = new Scanner(System.in);

    public void start(Player player1, Player player2) {
        while (true) {
            System.out.print(player1.getName() + ", угадай число: ");
            player1.setNumber(scan.nextInt());
            if (player1.getNumber() < computerNumber) {
                System.out.println("Число " + player1.getNumber() + " меньше того, что загадал компьютер");
            } else if (player1.getNumber() > computerNumber) {
                System.out.println("Число " + player1.getNumber() + " больше того, что загадал компьютер");
            } else if (player1.getNumber() == computerNumber) {
                System.out.println(player1.getName() + " победил");
                computerNumber = (int) Math.round(Math.random() * 100);
                break;
            }

            System.out.print(player2.getName() + ", угадай число: ");
            player2.setNumber(scan.nextInt());
            if (player2.getNumber() < computerNumber) {
                System.out.println("Число " + player2.getNumber() + " меньше того, что загадал компьютер");
            } else if (player2.getNumber() > computerNumber) {
                System.out.println("Число " + player2.getNumber() + " больше того, что загадал компьютер");
            } else if (player2.getNumber() == computerNumber) {
                System.out.println(player2.getName() + " победил");
                computerNumber = (int) Math.round(Math.random() * 100);
                break;
            }
        }
    }
}