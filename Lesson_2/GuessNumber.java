import java.util.Scanner;

public class GuessNumber {

    private int computerNumber = (int) Math.round(Math.random() * 100);
    Scanner scan = new Scanner(System.in);

    public void start() {
        System.out.println("Имя первого игрока: ");
        Player player1 = new Player(scan.next());
        System.out.println("Имя второго игрока: ");
        Player player2 = new Player(scan.next());

        System.out.print(player1.getName() + ", угадай число: ");
        player1.setNumber(scan.nextInt());

        while (true) {
            if (player1.getNumber() < computerNumber) {
                System.out.println("Число " + player1.getNumber() + " меньше того, что загадал компьютер");
                System.out.print(player2.getName() + ", угадай число: ");
                player2.setNumber(scan.nextInt());
            } else if (player1.getNumber() > computerNumber) {
                System.out.println("Число " + player1.getNumber() + " больше того, что загадал компьютер");
                System.out.print(player2.getName() + ", угадай число: ");
                player2.setNumber(scan.nextInt());
            } else if (player1.getNumber() == computerNumber) {
                System.out.println(player1.getName() + " победил");
                break;
            }

            if (player2.getNumber() < computerNumber) {
                System.out.println("Число " + player2.getNumber() + " меньше того, что загадал компьютер");
                System.out.print(player1.getName() + ", угадай число: ");
                player1.setNumber(scan.nextInt());
            } else if (player2.getNumber() > computerNumber) {
                System.out.println("Число " + player2.getNumber() + " больше того, что загадал компьютер");
                System.out.print(player1.getName() + ", угадай число: ");
                player1.setNumber(scan.nextInt());
            } else if (player2.getNumber() == computerNumber) {
                System.out.println(player2.getName() + " победил");
                break;
            }
        }
    }
}