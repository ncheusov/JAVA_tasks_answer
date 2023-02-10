import java.util.Scanner;

public class Calculator {
    Scanner scan = new Scanner(System.in);
    private int numA;
    private int numB;
    private int result;
    private char sign;

    public void start() {
        System.out.print("Введите первое число: ");
        numA = scan.nextInt();
        // Здесь на следующей строчке возникает ошибка
        // решается при добавлении еще одного scan.nextLine();
        scan.nextLine();
        System.out.print("Введите знак математической операции: ");
        sign = scan.nextLine().charAt(0);
        System.out.print("Ведите второе число: ");
        numB = scan.nextInt();
        switch (sign) {
            case '+':
                result = numA + numB;
                break;
            case '-':
                result = numA - numB;
                break;
            case '*':
                result = numA * numB;
                break;
            case '/':
                result = numA / numB;
                break;
            case '%':
                result = numA % numB;
                break;
            case '^':
                for (int i = 1; i <= numB; i++) {
                    result *= numA;
                }
                break;
        }
        System.out.println("Результат: " + numA + " " + sign + " " + numB + " = " + result);
    }
}