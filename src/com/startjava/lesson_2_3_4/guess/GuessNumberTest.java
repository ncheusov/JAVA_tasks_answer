package startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Имя первого игрока: ");
        final Player PLAYER1 = new Player(scan.next());

        System.out.println("Имя второго игрока: ");
        final Player PLAYER2 = new Player(scan.next());

        GuessNumber game = new GuessNumber(PLAYER1, PLAYER2);
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.println("\nХотите продолжить игру? [yes/no]");
            scan.nextLine();
            answer = scan.nextLine();
        }
        scan.close();
    }
}
