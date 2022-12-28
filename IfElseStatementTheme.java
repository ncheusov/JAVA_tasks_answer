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
        char symbol = '\u005A';
        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Большая буква " + symbol);
        } else if (symbol >= 'a' && symbol <= 'a') {
            System.out.println("Маленькая буква " + symbol);
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("Число " + symbol);
        } else {
            System.out.println("Не буква и не число");
        }
        
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 310000, accruedInterest = 0, totalSum = 0;
        if (deposit <= 100000) {
            accruedInterest = (deposit * 5 * 365 / 365) / 100;
        } else if (deposit >= 100000 && deposit <= 300000) {
            accruedInterest = (deposit * 7 * 365 / 365) / 100;;
        } else if (deposit > 300000) {
            accruedInterest = (deposit * 10 * 365 / 365) / 100;
        }
        totalSum = deposit + accruedInterest;
        System.out.println("Сумма вклада: " + deposit);
        System.out.println("Начисленный %: " + accruedInterest);
        System.out.println("Итоговая сумма с %: " + totalSum);

        System.out.println("\n7. Определение оценки по предметам");
        int history = 59, programming = 91;
        int historyGrade = 0, progrGrade = 0, sumGrades = 0;
        if (history <= 60) {
            historyGrade = 2;
        } else if (programming <= 60) {
            progrGrade = 2;
        } else if (history > 60) {
            historyGrade = 3;
        } else if (programming > 60) {
            progrGrade = 3;
        } else if (history > 73) {
            historyGrade = 4;
        } else if (programming > 73) {
            progrGrade = 4;
        } else if (history > 91) {
            historyGrade = 5;
        } else if (programming > 91) {
            progrGrade = 5;
        }
        sumGrades = (historyGrade + progrGrade) / 2;
        int sumPercent = (history + programming ) / 2;
        System.out.println("Оценка " + historyGrade + " по Истории\n" +
                "Оценка " + progrGrade + " по Программированию\n" +
                "Средний балл по предметам - " + sumGrades + "\n" +
                "Средний процент по предметам - " + sumPercent + " %");

        System.out.println("\n8. Расчет прибыли за год");
        int rent = 5000, sales = 13000, costPrice = 9000;
        int profit = (sales - costPrice + rent) * 12;
        if (profit > 0) {
            System.out.println("Прибыль за год: +" + profit);
        } else {
            System.out.println("Прибыль за год: " + profit);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int sumInUSD = 567;
    }
} 