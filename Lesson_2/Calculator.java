import java.util.Scanner;

public class Calculator {
    Scanner in = new Scanner(System.in);

    private int numA;
    private int numB;
    private int result = 1;
    private char sign;

    public void calc() {
        System.out.print("Введите первое число: ");
        numA = in.nextInt();
        System.out.print("\nВведите знак математической операции: ");
        sign = in.nextLine().charAt(0);
        System.out.print("\nВведите второе число: ");
        numB = in.nextInt();
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