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

        System.out.println("\n3. Удаление элементов массива");
        double[] doublesArr = new double[15];
        double[] modifiedArr = new double[15];
        arrLength = doublesArr.length;
        int zeroes = 0;
        for (int i = 0; i < arrLength; i++) {
            doublesArr[i] = Math.random();
            modifiedArr[i] = doublesArr[i];
            int middleIndex = arrLength / 2;
            if (modifiedArr[i] > modifiedArr[middleIndex]) {
                modifiedArr[i] = 0;
                if (modifiedArr[i] == 0) {
                    zeroes += 1;
                }
            }
        }
        System.out.println("Массив до модификации");
        for (int i = 0; i < arrLength; i++) {
            String formattedNum = String.format("%.3f", doublesArr[i]);
            if (i != 7) {
                System.out.print(formattedNum + " ");
            } else {
                System.out.println();
            }
        }
        System.out.println("\nМассив после модификации");
        for (int i = 0; i < arrLength; i++) {
            String formattedNum = String.format("%.3f", modifiedArr[i]);
            if (i != 7) {
                System.out.print(formattedNum + " ");
            } else {
                System.out.println();
            }
        }
        System.out.println("\nКоличество обнуленных ячеек: " + zeroes);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        arrLength = alphabet.length;
        for (int i = 0; i < arrLength; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for (int i = arrLength - 1; i >= 0; i--) {
            for (int j = arrLength - 1; j >= i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }


    }
}
