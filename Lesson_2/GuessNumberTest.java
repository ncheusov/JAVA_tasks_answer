import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        GuessNumber game = new GuessNumber();
        Scanner scan = new Scanner(System.in);
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.println("Хотите продолжить игру? [yes/no");
            answer = scan.nextLine();
        }
        scan.close();
    }
}