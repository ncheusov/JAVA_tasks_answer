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
            String printResult = i != arrLength - 2 ? " * " : " = " + result;
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
            System.out.printf("%8.3f", modifiedArr[i]);
            if ((i + 1) % 8 == 0) {
                System.out.println();
            }
        }
        System.out.println("\nМассив после модификации");
        for (int i = 0; i < arrLength; i++) {
            System.out.printf("%8.3f", modifiedArr[i]);
            if ((i + 1) % 8 == 0) {
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
        for (int i = 0; i < arrLength - 1; i++) {
            for (int j = 0; j < arrLength - 1; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    tmp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arrLength; i++) {
            System.out.print(intArr[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n6. Копирование не пустых строк");
        String[] stringsArr1 = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        String[] stringsArr2 = new String[11];
        arrLength = stringsArr1.length;
        System.arraycopy(stringsArr1, 0, stringsArr2, 0, 11);
        System.out.println(Arrays.toString(stringsArr2));

    }
}
