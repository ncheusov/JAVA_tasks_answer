package startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] numbersArr = {2, 5, 7, 3, 1, 4, 6};
        int arrLength = numbersArr.length;
        System.out.print("Массив до модификации: ");
        for (int number : numbersArr) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = 0; i < arrLength / 2; i++) {
            int tmp = numbersArr[i];
            numbersArr[i] = numbersArr[arrLength - 1 - i];
            numbersArr[arrLength - 1 - i] = tmp;
        }
        System.out.print("Массив после модификации: ");
        for (int number : numbersArr) {
            System.out.print(number + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        numbersArr = new int[10];
        arrLength = numbersArr.length;
        int result = 1;
        for (int i = 0; i < arrLength; i++) {
            numbersArr[i] += i;
        }
        for (int i = numbersArr[1]; i < numbersArr[9]; i++) {
            result *= numbersArr[i];
            System.out.print(numbersArr[i]);
            String printResult = i != 8 ? " * " : " = " + result;
            System.out.print(printResult);
        }
        System.out.println("\n" + numbersArr[0] + " " + numbersArr[9]);
    }
}
