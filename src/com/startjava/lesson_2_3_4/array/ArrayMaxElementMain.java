package startjava.lesson_2_3_4.array;

import java.util.Scanner;

public class ArrayMaxElementMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int maxLength = scanner.nextInt();
        int[] numbers = new int[maxLength];

        System.out.print("Заполните массив целыми числами через пробел: ");
        for (int i = 0; i < maxLength; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[maxLength - 1];
        for (int i = maxLength - 1; i > 0; i--) {
            if (max > numbers[i - 1]) {
                max = numbers[i - 1];
            }
        }
        System.out.println(max + " – максимальное число");
    }
}
