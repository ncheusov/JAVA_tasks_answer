public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перепишите псевдокод на язык Java");
        int age = 19;
        float height = 1.82f;
        char capitalLetter = "John".charAt(0);
        if (age > 20) {
            System.out.println("Здравствуйте.");
        } else {
            System.out.println("Привет!");
        }
        boolean maleGender = true;
        if (!maleGender) {
            System.out.println("Вы не подходите по определенным признакам");
        } else {
            System.out.println("Должно быть вы мужчина");
        }
        if (height < 1.80) {
            System.out.println("Ваш рост меньше одного метра восьмидесяти см.");
        } else {
            System.out.println("Вы довольно высоки!");
        }
        if (capitalLetter == 'J') {
            System.out.println("Вас зовут Джон");
        } else if(capitalLetter == 'I') {
            System.out.println("Вас зовут Иван");
        } else {
            System.out.println("Должно быть ваше имя мне неизвестно");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 502, num2 = -129;
        if (num1 > 0 && num2 < 0) {
            System.out.println(num1 + " максимальное число");
            System.out.println(num2 + " минимальное число");
        } else if (num1 == num2) {
            System.out.println(num1 + " и " + num2 + " равны");
        } else {
            System.out.println(num2 + " максимальное число");
            System.out.println(num1 + " минимальное число");
        }

        System.out.println("\n3. Проверка числа");
        int randomNum = 567;
        if (randomNum != 0) {
            if (randomNum % 2 == 0) {
                System.out.println(randomNum + " является четным");
            } else {
                System.out.println("Число нечетное");
            }
            if (randomNum < 0) {
                System.out.println("Число " + randomNum + " отрицательное");
            } else {
                System.out.println(randomNum + " является положительным");
            }
        } else {
            System.out.println("Число равно 0");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int number = 123;
        int number1 = 153;
        boolean isHundredsEqual = number / 100 == number1 / 100;
        boolean isTensEqual = number / 10 % 10 == number1 / 10 % 10;
        boolean isOnesEqual = number % 10 == number1 % 10;
        System.out.println("Исходные числа: " + number + " и " + number1);
        if (isHundredsEqual) {
            System.out.println("Одинаковые числа в первом разряде: "
                    + number / 100 + " и " + number1 / 100);
        } else {
            System.out.println("Числа в первом разряде не равны");
        }
        if (isTensEqual) {
            System.out.println("Одинаковые числа во втором разряде: "
                    + number / 10 % 10 + " и " + number1 / 10 % 10);
        } else {
            System.out.println("Числа во втором разряде не равны");
        }
        if (isOnesEqual) {
            System.out.println("Одинаковые числа в третьем разряде: "
                    + number % 10 + " и " + number1 % 10);
        } else {
            System.out.println("Числа в третьем разряде не равны");
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol >= 'A' && symbol <= 'W') {
            System.out.println("Большая буква " + symbol);
        } else if (symbol >= 'a' && symbol <= 'a') {
            System.out.println("Маленькая буква " + symbol);
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("Число " + symbol);
        } else {
            System.out.println("Не буква и не число");
        }
        
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 310000, accruedInterest = 10;
        if (deposit <= 100000) {
            accruedInterest = 5; 
        } else if (deposit >= 100000 && deposit <= 300000) {
            accruedInterest = 7;
        }
        int amountOfInterest = deposit / 100 * accruedInterest;
        int totalSum = deposit + amountOfInterest;
        System.out.println("Сумма вклада: " + deposit);
        System.out.println("Начисленный %: " + amountOfInterest);
        System.out.println("Итоговая сумма с %: " + totalSum);

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59, progPercent = 91;
        int historyGrade = 2, progGrade = 2;
        if (historyPercent <= 60) {
            historyGrade = 2;
        } else if (historyPercent > 60) {
            historyGrade = 3;
        } else if (historyPercent > 73) {
            historyGrade = 4;
        } else if (historyPercent > 91) {
            historyGrade = 5;
        }
        if (progPercent <= 60) {
            progGrade = 2;
        } else if (progPercent > 60) {
            progGrade = 3;
        } else if (progPercent > 73) {
            progGrade = 4;
        } else if (progPercent > 91) {
            progGrade = 5;
        }
        int averageGrades = (historyGrade + progGrade) / 2;
        int averagePercent = (historyPercent + progPercent) / 2;
        System.out.println("Оценка " + historyGrade + " по Истории\n" +
                "Оценка " + progGrade + " по Программированию\n" +
                "Средний балл по предметам - " + averageGrades + "\n" +
                "Средний процент по предметам - " + averagePercent + "%");

        System.out.println("\n8. Расчет прибыли за год");
        int rent = 5000, averageMonthlySales = 13000, costPrice = 9000;
        int profit = (averageMonthlySales - costPrice + rent) * 12;
        if (profit > 0) {
            System.out.println("Прибыль за год: +" + profit);
        } else {
            System.out.println("Прибыль за год: " + profit);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int sum = 567;
        int hundredsInStock = 10;
        int tensInStock = 5;
        int onesInStock = 50;
        int needHundreds = sum / 100 % 10;
        int needTens = sum / 10 % 10;
        int needOnes = sum % 10;
        if (needHundreds > hundredsInStock) {
            needTens = (needTens - tensInStock) * 10 + needTens;
            needHundreds = hundredsInStock;
        }
        if (needTens > tensInStock) {
            needOnes = (needTens - tensInStock) * 10 + needOnes;
            needTens = tensInStock;
        }
        if (needOnes > onesInStock) {
            System.out.println("Сумму " + sum + " выдать невозможно");
        } else {
            System.out.println("К выдаче:\n" + needHundreds + " сотен\n" + needTens + " десяток\n"
                + needOnes + " еденичек\nИтого: " + (needHundreds * 100 + needTens * 10 + needOnes));
        }
    }
}