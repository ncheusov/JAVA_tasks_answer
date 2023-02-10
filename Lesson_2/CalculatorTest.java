import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        myCalculator.start();
        Scanner scan = new Scanner(System.in);
        System.out.println("Хотите продолжить вычисления? [yes/no]");
        String answer = scan.nextLine();
        while (true) {
            if (answer.equals("yes")) {
                myCalculator.start();
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answer = scan.nextLine();
            } else {
                System.out.println("Некорректное значение! Вводите с клавиатуры только yes или no");
                answer = scan.nextLine();
            }
            if (answer.equals("no")) {
                scan.close();
                break;
            }
        }
    }
}