import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessNumber game = new GuessNumber();
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                System.out.println("Имя первого игрока: ");
                Player player1 = new Player(scan.next());
                System.out.println("Имя второго игрока: ");
                Player player2 = new Player(scan.next());
                game.start(player1, player2);
            }
            System.out.println("Хотите продолжить игру? [yes/no]");
            scan.nextLine();
            answer = scan.nextLine();
        }
        scan.close();
    }
}