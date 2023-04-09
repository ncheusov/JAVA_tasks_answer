package startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                String mathExpression = scan.nextLine();
                try {
                    printResult(Calculator.calculate(mathExpression));
                } catch (RuntimeException ex) {
                    continue;
                }
            }
            System.out.println("\nХотите продолжить вычисления? [yes/no] ");
            answer = scan.nextLine();
        }
    }

    private static void printResult(double result) {
        System.out.printf((result % 1 != 0) ? "%3.f" : "%.0f", result);
    }
}
