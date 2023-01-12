public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int digit = -10;
        int evenNum = 0;
        int notEvenNum = 0;
        do {
            if (digit % 2 == 0) {
                evenNum += digit;
            } else {
                notEvenNum += digit;
            }
            digit++;
        } while (digit <= 21);
        System.out.println("Сумма четных чисел " + evenNum);
        System.out.println("Сумма нечетных чисел " + notEvenNum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int a = -1, b = 5, c = 10;
        int max = 0, min = 0;
        if (a < b && a < c) {
            min = a;
        }
        if (b > a && b < c) {
            max = b;
        }
        if (c > b && c > a) {
            max = c;
        }
        for (int i = max; i >= min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int d = 0, sum = 0;
        while (num > 0) {
            d = num % 10;
            sum += d;
            System.out.print(d);
            num /= 10;
        }
        System.out.println("\n" + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        // не получается
        for (int i = 1; i < 25; i += 2) {
            for (int j = 1; j < 5; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("\n5. Проверка количества двоек на четность/нечетность");
        int number = 3242592;
        int countOnes = 0;
        int copyOfNumber = number;
        String evenOrOdd = "";
        while (number > 0) {
            int onesOfNumber = number % 10;
            if (onesOfNumber == 2) {
                countOnes++;
            }
            if (countOnes % 2 == 0) {
                evenOrOdd = " четное";
            } else {
                evenOrOdd = " нечетное";
            }
            number /= 10;
        }
        System.out.println("Число " + copyOfNumber + " содержит" + evenOrOdd + " количество двоек");

        System.out.println("\n6. Отображение фигур в консоли");
        // прямоугольник
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();
        // треугольный прямоугольник
        int numSymbolsPerLine = 0;
        int numLines = 0;
        while (numSymbolsPerLine < 5) {
            numLines = numSymbolsPerLine;
            while (numLines < 5) {
                numLines++;
                System.out.print("#");
            }
            numSymbolsPerLine++;
            System.out.println();
        }

        System.out.println();
        // второй треугольник
        // не получается 

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("  Dec Char ");
        for (int i = 32; i <= 127; i++) {
            if ((i > 32) && (i <= 47) && (i % 2 == 1)) {
                System.out.printf("%4d%5c%n", i, i);
            } else if ((i > 96) && (i <= 122) && (i % 2 == 0)) {
                System.out.printf("%4d%5c%n", i, i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int palindrome = 1234321;
        int i = 0;
        while (palindrome != 0) {
            i = i * 10 + palindrome % 10;
            palindrome /= 10;
        }
        
        System.out.println("\n9. Определение, является ли число счастливым");
        int happyNumber = 555456;
        int leftSideOfHappyNum = happyNumber / 1000;
        int rightSideOfHappyNum = happyNumber % 1000;
        int sumOfLeftSide = 0;
        int sumOfRightSide = 0;
        int onesOfLeftSide = 0;
        int onesOfRightSide = 0;
        while (leftSideOfHappyNum != 0) {
            onesOfLeftSide = leftSideOfHappyNum % 10;
            sumOfLeftSide += onesOfLeftSide;
            leftSideOfHappyNum /= 10;
        }
        while (rightSideOfHappyNum != 0) {
            onesOfRightSide = rightSideOfHappyNum % 10;
            sumOfRightSide += onesOfRightSide;
            rightSideOfHappyNum /= 10;
        }
        System.out.println("Сумма цифр левой стороны = " + sumOfLeftSide 
                + "\nСумма цифр правой стороны = " + sumOfRightSide);
        if (sumOfRightSide == sumOfLeftSide) {
            System.out.println("Число " + happyNumber + " является счастливым");
        } else {
            System.out.println("Число " + happyNumber + " не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        // не получилась

    }
}