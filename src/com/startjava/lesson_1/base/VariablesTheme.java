package com.startjava.lesson_1.base;

public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль.");
        byte coresAmount = 6;
        short ram = 16;
        int ssd = 512;
        long ramFrequency = 2667;
        float cpuFrequency = 2.6f;
        double manufactureDate = 11.2021;
        char randomChar = 'C';
        boolean isGood = true;
        System.out.println("Количество ядер процессора: " + coresAmount);
        System.out.println("Объем оперативной памяти: " + ram + " ГБ");
        System.out.println("Объем накопителя: " + ssd + " ГБ");
        System.out.println("Частота оперативной памяти " + ramFrequency + " МГц");
        System.out.println("Частота процессора: " + cpuFrequency + " ГГц");
        System.out.println("Месяц и год сборки компьютера: " + manufactureDate + " Г.");
        System.out.println("Просто какой-то символ: " + randomChar);
        System.out.println("Нравится ли мне мой компьютер? " + isGood);

        System.out.println("\n2. Расчет стоимости товара со скидкой.");
        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;
        int discountSum = (penPrice + bookPrice) * discount / 100;
        int discountPrice = penPrice + bookPrice - discountSum;
        System.out.println("Сумма скидки: " + discountSum + " руб.");
        System.out.println("Общая стоимость товаров со скидкой: " + discountPrice + " руб.");

        System.out.println("\n3. Вывод слова JAVA.");
        System.out.println("   J     a    v     v   a");
        System.out.println("   J    a  a   v   v   a  a");
        System.out.println("J  J   aaaaaa   V V   aaaaaa");
        System.out.println(" JJ   a      a   V   a      a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов.");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;
        System.out.println("Переменная maxByte: ");
        System.out.println("    первоначальное значение: " + maxByte);
        System.out.println("    значение после инкремента: " + ++maxByte);
        System.out.println("    значение после декремента: " + --maxByte);
        System.out.println("Переменная maxShort: ");
        System.out.println("    первоначальное значение: " + maxShort);
        System.out.println("    значение после инкремента: " + ++maxShort);
        System.out.println("    значение после декремента: " + --maxShort);
        System.out.println("Переменная maxInt: ");
        System.out.println("    первоначальное значение: " + maxInt);
        System.out.println("    значение после инкремента: " + ++maxInt);
        System.out.println("    значение после декремента: " + --maxInt);
        System.out.println("Переменная maxLong: ");
        System.out.println("    первоначальное значение: " + maxLong);
        System.out.println("    значение после инкремента: " + ++maxLong);
        System.out.println("    значение после декремента: " + --maxLong);

        System.out.println("\n5. Перестановка значений переменных.");
        int digit1 = 2;
        int digit2 = 5;
        System.out.println("Метод с помощью третьей переменной\n" +
            "    исходное значение переменной digit1: " + digit1 + 
            ", исходное значение переменной digit2: " + digit2);
        int tmp = digit1;
        digit1 = digit2;
        digit2 = tmp;
        System.out.println("    новое значение переменной digit1: " + digit1 + ", и digit2: " + digit2);
        System.out.println("Метод с помощью арифметических действий\n" +
            "    исходное значение переменной digit1: " + digit1 + 
            ", исходное значение переменной digit2: " + digit2);
        digit1 += digit2;
        digit2 = digit1 - digit2;
        digit1 -= digit2;
        System.out.println("    новое значение переменной digit1: " + digit1 + ", и digit2: " + digit2);
        System.out.println("Метод с помощью побитовой операции \n" +
            "    исходное значение переменной digit1: " + digit1 + 
            ", исходное значение переменной digit2: " + digit2);
        digit1 ^= digit2;
        digit2 ^= digit1;
        digit1 ^= digit2;
        System.out.println("    новое значение переменной digit1: " + digit1 + ", и digit2: " + digit2);

        System.out.println("6. Вывод символов и их кодов.");
        char hash = '#';
        char ampersand = '&';
        char at = '@';
        char circumflex = '^';
        char underscore = '_';
        System.out.println((int) hash  + " = " + hash);
        System.out.println((int) ampersand + " = " + ampersand);
        System.out.println((int) at + " = " + at);
        System.out.println((int) circumflex + " = " + circumflex);
        System.out.println((int) underscore + " = " + underscore);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка.");
        char slash = '/';
        char backslash = '\\';
        char underscore2 = '_';
        char leftBracket = '(';
        char rightBracket = ')';
        System.out.println("     " + slash + backslash + "\n    " + slash + "  " + backslash + "\n   " +
                slash + underscore + leftBracket + " " + rightBracket + backslash + "\n  " + slash +
                "      " + backslash + "\n " + slash + underscore + underscore + underscore + underscore + slash +
                backslash + underscore + underscore + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int ones = num % 10;
        int tens = num % 100;
        int hundreds = num / 100;
        System.out.println("Число " + num + " содержит:\n    " + 
                ones + " единицы\n    " + 
                tens + " десятка\n    " + 
                hundreds + " сотня");

        System.out.println("\n9. Вывод времени.");
        int secondsInput = 86399;
        int hours = secondsInput / 3600;
        int minutes = secondsInput % 3600 / 60;
        int seconds = minutes % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}