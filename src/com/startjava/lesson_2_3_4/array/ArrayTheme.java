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
        for (int i = 0; i < len; i++) {
            int middleIndex = len / 2;
            if (doubleArr[i] > doubleArr[middleIndex]) {
                doubleArr[i] = 0;
                if (doubleArr[i] == 0) {
                    zeroes++;
                }
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
        int randomNum = 0;
        for (int i = 0; i < len; i++) {
            while (contains(intArr, randomNum)) {
                randomNum = (60 + (int) (Math.random() * 40));
            }
            intArr[i] = randomNum;
        }
        for (int i = 0; i < len - 1; i++) {
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
        String[] stringsArr1 = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        len = stringsArr1.length;
        int count = 0;
        for (int i = 0; i <= len - 1; i++) {
            if (stringsArr1[i].isBlank()) {
                count++;
            }
        }
        String[] stringsArr2 = new String[len - count];
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (!stringsArr1[i].isBlank()) {
                System.arraycopy(stringsArr1, i, stringsArr2, j++, 1);
            }
        }
        for (String str : stringsArr1) {
            if (str.isBlank()) {
                System.out.print(str);
            } else {
                System.out.print(str + " ");
            }
        }
        System.out.println();
        for (String str : stringsArr2) {
            System.out.print(str + " ");
        }
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
}
