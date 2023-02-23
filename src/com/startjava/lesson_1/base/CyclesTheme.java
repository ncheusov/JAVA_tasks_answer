package com.startjava.lesson_1.base;

public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int evenNum = 0;
        int oddNum = 0;
        do {
            if (counter % 2 == 0) {
                evenNum += counter;
            } else {
                oddNum += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("Сумма четных чисел " + evenNum);
        System.out.println("Сумма нечетных чисел " + oddNum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int a = 10, b = -1, c = 5;
        int max = a, min = b;
        if (a > max) {
            max = a;
        }
        if (c > max) {
            max = c;
        }
        if (b < min) {
            min = b;
        }
        if (c < min) {
            c = min;
        }
        for (int i = --max; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            System.out.print(digit);
            num /= 10;
        }
        System.out.println("\n" + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int quanity = 0;
        for (int i = 1; i < 30; i += 2) {
            quanity++;
            if (i < 24) {
                System.out.printf("%4d", i);
            } else if (i >= 24) {
                System.out.printf("%4d", 0);
            }
            if (quanity == 5 || quanity == 10) {
                System.out.println();
            }
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        int num2 = 2242592;
        int countOnes = 0;
        int copyOfNum = num2;
        String evenOrOdd = "";
        while (num2 > 0) {
            int digit = num2 % 10;
            if (digit == 2) {
                countOnes++;
            }
            num2 /= 10;
        }
        if (countOnes % 2 == 0) {
            evenOrOdd = " четное";
        } else {
            evenOrOdd = " нечетное";
        }
        System.out.println("Число " + copyOfNum + " содержит" + evenOrOdd + " количество двоек");

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

        // второй треугольник
        System.out.println();
        numLines = 1;
        numSymbolsPerLine = 5;
        do {
            if(numSymbolsPerLine < 3) {
                numLines = numSymbolsPerLine;
            } else {
                numLines = 6 - numSymbolsPerLine;
            }
            do {
                System.out.print("$");
            } while (--numLines > 0);
            System.out.println();
            numSymbolsPerLine--;
        } while (numSymbolsPerLine > 0);

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
        int copyOfPalindrome = palindrome;
        int rev = 0;
        while (palindrome != 0) {
            rev = rev * 10 + palindrome % 10;
            palindrome /= 10;
        }
        if (rev == copyOfPalindrome) {
            System.out.println("Число " + copyOfPalindrome + " является палиндромом");
        } else {
            System.out.println("Число " + copyOfPalindrome + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        int happyNum = 555456;
        int leftSideOfHappyNum = happyNum / 1000;
        int rightSideOfHappyNum = happyNum % 1000;
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
            System.out.println("Число " + happyNum + " является счастливым");
        } else {
            System.out.println("Число " + happyNum + " не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.print("   |  2  3  4  5  6  7  8  9\n");
        System.out.println("---|-------------------------");
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%3d",i * j);
                if (j == 1 ) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }
}