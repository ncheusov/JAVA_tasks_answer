import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        myCalculator.setNumA(scan.nextInt());
        // Здесь на следующей строчке возникает ошибка
        // решается при добавлении еще одного scan.nextLine();
        scan.nextLine();
        System.out.print("Введите знак математической операции: ");
        myCalculator.setSign(scan.nextLine().charAt(0));
        System.out.print("Ведите второе число: ");
        myCalculator.setNumB(scan.nextInt());
        myCalculator.start();
        
        System.out.println("Хотите продолжить вычисления? [yes/no]");
        String answer = scan.nextLine();
        if (answer.equals("yes")) {
            myCalculator.start();
        }
        scan.close();
    }
}