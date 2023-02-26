package startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Имя первого игрока: ");
        Player player1 = new Player(scan.next());
        System.out.println("Имя второго игрока: ");
        Player player2 = new Player(scan.next());
        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.println("Хотите продолжить игру? [yes/no]");
            scan.nextLine();
            answer = scan.nextLine();
        }
        scan.close();
    }
}
