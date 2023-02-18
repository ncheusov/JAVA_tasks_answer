import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {

    public static void main(String[] args) {
        GuessNumber game = new GuessNumber();
        Scanner scan = new Scanner(System.in);
        Random randInt = new Random();
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                game.start();
            }
            int computerNumber = randInt.nextInt(6) + 1;
            game.setComputerNumber(computerNumber);
            System.out.println("Хотите продолжить игру? [yes/no]");
            answer = scan.nextLine();
        }
        scan.close();
    }
}