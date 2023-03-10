package startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {2, 5, 7, 3, 1, 4, 6};
        int arrLength = intArr.length;
        int tmp;
        System.out.print("Массив до модификации: ");
        for (int digit : intArr) {
            System.out.print(digit + " ");
        }
        System.out.println();
        for (int i = 0; i < arrLength / 2; i++) {
            tmp = intArr[i];
            intArr[i] = intArr[arrLength - 1 - i];
            intArr[arrLength - 1 - i] = tmp;
        }
        System.out.print("Массив после модификации: ");
        for (int digit : intArr) {
            System.out.print(digit + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        arrLength = intArr.length;
        int result = 1;
        for (int i = 0; i < arrLength; i++) {
            intArr[i] += i;
        }
        for (int i = intArr[1]; i < intArr[9]; i++) {
            result *= intArr[i];
            System.out.print(intArr[i]);
            String printResult = i != 8 ? " * " : " = " + result;
            System.out.print(printResult);
        }
        System.out.println("\n" + intArr[0] + " " + intArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        double[] modifiedArr = new double[15];
        arrLength = doubleArr.length;
        int zeroes = 0;
        for (int i = 0; i < arrLength; i++) {
            doubleArr[i] = Math.random();
            modifiedArr[i] = doubleArr[i];
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
            String formattedNum = String.format("%.3f", doubleArr[i]);
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

        System.out.println("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        arrLength = intArr.length;
        boolean isSorted = false;
        for (int i = 1; i < arrLength; i++) {
            intArr[i] = (60 + (int) (Math.random() * 40));
        }
        for (int i = 0; i < arrLength; i++) {
            for (int j = i + 1; j < arrLength; j++) {
                while (intArr[i] == intArr[j]) {
                    intArr[j] = (60 + (int) (Math.random() * 40));
                }
            }
        }
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrLength - 1; i++) {
                if (intArr[i] > intArr[i + 1]) {
                    isSorted = false;
                    tmp = intArr[i];
                    intArr[i] = intArr[i + 1];
                    intArr[i + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arrLength; i++) {
            System.out.print(intArr[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
