package startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {2, 5, 7, 3, 1, 4, 6};
        int len = intArr.length;
        System.out.print("Массив до модификации: ");
        printArr(intArr);
        System.out.println();
        for (int i = 0; i < len; i++) {
            int tmp = intArr[i];
            intArr[i] = intArr[--len];
            intArr[len] = tmp;
        }
        System.out.print("Массив после модификации: ");
        printArr(intArr);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        len = intArr.length;
        for (int i = 0; i < len; i++) {
            intArr[i] = i;
        }
        int result = 1;
        for (int i = 1; i < len - 1; i++) {
            result *= intArr[i];
            String printResult = i != len - 2 ? " * " : " = " + result;
            System.out.print(intArr[i] + printResult);
        }
        System.out.println("\n" + intArr[0] + " " + intArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        len = doubleArr.length;
        for (int i = 0; i < len; i++) {
            doubleArr[i] = Math.random();
        }
        System.out.println("Массив до модификации");
        printFormattedArr(doubleArr);
        int zeroes = 0;
        double middleCellNumber = doubleArr[len / 2];
        for (int i = 0; i < len; i++) {
            if (doubleArr[i] > middleCellNumber) {
                doubleArr[i] = 0;
                zeroes++;
            }
        }
        System.out.println("\nМассив после модификации");
        printFormattedArr(doubleArr);
        System.out.println("\nКоличество обнуленных ячеек: " + zeroes);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        len = alphabet.length;
        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for (int i = len - 1; i >= 0; i--) {
            for (int j = len - 1; j >= i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        len = intArr.length;
        for (int i = 0; i < len; i++) {
            int randomNum;
            do {
                randomNum = (60 + (int) (Math.random() * 40));
            } while (contains(intArr, randomNum));
            intArr[i] = randomNum;
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    int tmp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.print(intArr[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n6. Копирование не пустых строк");
        String[] srcArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        len = srcArr.length;
        int lenCounter = 0;
        for (String str : srcArr ) {
            if (!str.isBlank()) {
                lenCounter++;
            }
        }
        String[] destArr = new String[lenCounter];
        int srcElem = 0;
        int destElem = 0;
        int strCounter = 0;
        for (int i = 0; i < len; i++) {
            if (srcArr[i].isBlank()) {
                if (strCounter != 0) {
                    srcElem = i - strCounter;
                    System.arraycopy(srcArr, srcElem, destArr, destElem, strCounter);
                    destElem += strCounter;
                    strCounter = 0;
                }
            } else {
                strCounter++;
            }
        }
        printStringArr(srcArr);
        printStringArr(destArr);
    }

    private static void printArr(int[] arr) {
        for (int digit : arr) {
            System.out.print(digit + " ");
        }
    }

    private static void printFormattedArr(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%8.3f", arr[i]);
            if ((i + 1) % 8 == 0) {
                System.out.println();
            }
        }
    }

    private static boolean contains(int[] arr, int num) {
        for (int digit : arr) {
            if (digit == num) {
                return true;
            }
        }
        return false;
    }

    private static void printStringArr(String[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            System.out.print("'" + arr[i] + "', ");
        }
        System.out.println("'" + arr[len - 1] + "'");
    }
}
