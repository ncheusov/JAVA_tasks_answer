import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        myCalculator.start();
        Scanner scan = new Scanner(System.in);
        System.out.print("Хотите продолжить вычисления? [yes/no]");
        String answer = scan.nextLine();
        while (true) {
            if (answer.equals("yes")) {
                myCalculator.start();
                System.out.print("Хотите продолжить вычисления? [yes/no]");
                answer = scan.nextLine();
            } else if (answer.equals("no")) {
                scan.close();
                break;
            } else {
                System.out.println("Некорректное значение");
                answer = scan.nextLine();
            }
        }
    }
}