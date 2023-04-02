package startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                printResult(calculator.calculate(scan.nextLine()));
            }
            System.out.println("\nХотите продолжить вычисления? [yes/no] ");
            answer = scan.nextLine();
        }
    }

    private static void printResult(double result) {
        if (result % 1 != 0) {
            System.out.printf("%.3f", result);
        } else {
            System.out.printf("%.0f", result);
        }
    }
}
