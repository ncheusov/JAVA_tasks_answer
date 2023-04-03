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
                    Calculator.calculate(mathExpression);
                } catch (RuntimeException ex) {
                    System.out.print("Введите корректные значения: ");
                    mathExpression = scan.nextLine();
                }

                printResult(Calculator.calculate(mathExpression));
            }
            System.out.println("\nХотите продолжить вычисления? [yes/no] ");
            answer = scan.nextLine();
        }
    }

    private static void printResult(double result) {
        System.out.printf((result % 1 != 0) ? "%3.f" : "%.0f", result);
    }
}
