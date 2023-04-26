package startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    private static final int PLAYERS_AMOUNT = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player[] players = inputName(scanner, new Player[PLAYERS_AMOUNT]);
        GuessNumber game = new GuessNumber(players);
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.println("\nХотите продолжить игру? [yes/no]");
            answer = scanner.next();
        }
        scanner.close();
    }

    private static Player[] inputName(Scanner scanner, Player... players) {
        for (int i = 1; i <= PLAYERS_AMOUNT; i++) {
            System.out.print("Имя " + i + "-го игрока: ");
            players[i - 1] = new Player(scanner.next());
        }
        return players;
    }
}
