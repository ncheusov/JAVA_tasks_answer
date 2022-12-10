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
        int sumDiscount = (penPrice + bookPrice) * discount / 100;
        int totalDiscountPrice = penPrice + bookPrice - sumDiscount;
        System.out.println("Сумма скидки: " + sumDiscount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой: " + totalDiscountPrice + " руб.");

        System.out.println("\n3. Вывод слова JAVA.");
        System.out.println("   J     a    v     v   a");
        System.out.println("   J    a  a   v   v   a  a");
        System.out.println("J  J   aaaaaa   V V   aaaaaa");
        System.out.println(" JJ   a      a   V   a      a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов.");
        byte maxNumOfByte = 127;
        short maxNumOfShort = 32767;
        int maxNumOfInt = 2147483647;
        long maxNumOfLong = 9223372036854775807L; 
        // Инкременты
        int incByte = maxNumOfByte + 1;
        int incShort = maxNumOfShort + 1;
        int incInt= maxNumOfInt + 1;
        long incLong = maxNumOfLong + 1;
        // Декременты
        int decByte = maxNumOfByte - 1;
        int decShort = maxNumOfShort - 1;
        int decInt = maxNumOfInt - 1;
        long decLong = maxNumOfLong - 1;
        System.out.println("Переменная maxNumOfByte: ");
        System.out.println("    первоначальное значение: " + maxNumOfByte);
        System.out.println("    значение после инкремента: " + incByte);
        System.out.println("    значение после декремента: " + decByte);
        System.out.println("Переменная maxNumOfShort: ");
        System.out.println("    первоначальное значение: " + maxNumOfShort);
        System.out.println("    значение после инкремента: " + incShort);
        System.out.println("    значение после декремента: " + decShort);
        System.out.println("Переменная maxNumOfInt: ");
        System.out.println("    первоначальное значение: " + maxNumOfInt);
        System.out.println("    значение после инкремента: " + incInt);
        System.out.println("    значение после декремента: " + decInt);
        System.out.println("Переменная maxNumOfLong: ");
        System.out.println("    первоначальное значение: " + maxNumOfLong);
        System.out.println("    значение после инкремента: " + incLong);
        System.out.println("    значение после декремента: " + decLong);

        System.out.println("\n5. Перестановка значений переменных.");
        int digit1 = 2;
        int digit2 = 5;
        int tmp = digit1;
        int afterTmpDigit1 = digit2;
        int afterTmpDigit2 = tmp;
        System.out.println("Метод с помощью третьей переменной");
        System.out.println(
            "    исходное значение переменной digit1: " + digit1 + 
            ", исходное значение переменной digit2: " + digit2
        );
        System.out.println(
            "    новое значение переменной digit1: " + afterTmpDigit1 + 
            ", и digit2: " + afterTmpDigit2
        );
        int afterArithmeticDigit1 = digit1 + digit2;
        int afterArithmeticDigit2 = afterArithmeticDigit1 - digit2;
        afterArithmeticDigit1 -= afterArithmeticDigit2;
        System.out.println("Метод с помощью арифметических действий");
        System.out.println(
            "    исходное значение переменной digit1: " + digit1 + 
            ", исходное значение переменной digit2: " + digit2
        );
        System.out.println(
            "    новое значение переменной digit1: " + afterArithmeticDigit1 + 
            ", и digit2: " + afterArithmeticDigit2
        );

        System.out.println("\n6. Вывод символов и их кодов.");
        char percent = '%';
        char ampersand = '&';
        char dog = '@';
        char arrow = '^';
        char lodash = '_';
        System.out.println(percent + " = 35");
        System.out.println(ampersand + " = 38");
        System.out.println(dog + " = 64");
        System.out.println(arrow + " = 94");
        System.out.println(lodash + " = 95");

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка.");
        char slash = '/';
        char backslash = 92;
        char lodash2 = '_';
        char leftBracket = '(';
        char rightBracket = ')';
        System.out.println(
            "     " + slash + backslash + "\n    " + slash + "  " + backslash + "\n   " +
            slash + lodash2 + leftBracket + " " + rightBracket + backslash + "\n  " + slash +
            "      " + backslash + "\n " + slash + lodash2 + lodash2 + lodash2 + lodash2 + slash + 
            backslash + lodash2 + lodash2 + backslash
        );

        System.out.println("\n8. Вывод количества сотен, десятков и едениц числа");
        int num = 123;
        int hundred = num - 23;
        int tenths = num - 103;
        int uihiouh = num - 120;

        System.out.println("\n9. Вывод времени.");
        int input = 86399;
        int hours = input / 3600;
        int secondsRes = input % 3600;
        int minutes = secondsRes / 60;
        int seconds = secondsRes % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);

    }
}