import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Введите первое число: ");
            myCalculator.setNum1(scan.nextInt());

            System.out.print("Введите знак математической операции: ");
            scan.nextLine();
            myCalculator.setSign(scan.nextLine().charAt(0));

            System.out.print("Введите второе число: ");
            myCalculator.setNum2(scan.nextInt());
            myCalculator.calculate();

            System.out.println("Хотите продолжить вычисления? [yes/no]");
            scan.nextLine();
            String answer = scan.nextLine();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Пожалуйста, введите yes или no: ");
                answer = scan.nextLine();
                if (answer.equals("yes")) {
                    continue;
                } else if (answer.equals("no")) {
                    break;
                }
            }
            if (answer.equals("no")) {
                break;
            }
        }
    }
}