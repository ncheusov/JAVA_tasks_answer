package startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    private static final int PLAYERS_AMOUNT = 3;
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Player[] players = new Player[PLAYERS_AMOUNT];
        inputName(players);
        GuessNumber game = new GuessNumber(players);
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.println("\nХотите продолжить игру? [yes/no]");
            answer = SCANNER.next();
        }
        SCANNER.close();
    }

    private static void inputName(Player[] players) {
        for (int i = 1; i <= PLAYERS_AMOUNT; i++) {
            System.out.print("Имя " + i + "-го игрока: ");
            players[i - 1] = new Player(SCANNER.next());
        }
    }
}
