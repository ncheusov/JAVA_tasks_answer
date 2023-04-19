package startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    static final Player[] PLAYERS = new Player[3];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= PLAYERS.length; i++) {
            System.out.print("Имя " + i + "-го игрока: ");
            PLAYERS[i - 1] = new Player(scan.next());
        }

        GuessNumber game = new GuessNumber(PLAYERS);
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.println("\nХотите продолжить игру? [yes/no]");
            answer = scan.next();
        }
        scan.close();
    }
}
