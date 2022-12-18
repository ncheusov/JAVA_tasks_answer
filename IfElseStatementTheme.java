public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перепишите псевдокод на язык Java");
        int age = 19;
        float height = 1.82f;
        char firstLetterOfName = "John".charAt(0);
        if (age > 20) {
            System.out.println("Здравствуйте.");
        } else {
            System.out.println("Привет!");
        }
        boolean isMaleGender = true;
        if (!isMaleGender) {
            System.out.println("Вы не подходите по определенным признакам");
        } else {
            System.out.println("Должно быть вы мужчина");
        }
        if (height < 1.80) {
            System.out.println("Ваш рост меньше одного метра восьмидесяти см.");
        } else {
            System.out.println("Вы довольно высоки!");
        }
        if (firstLetterOfName == 'J') {
            System.out.println("Вас зовут Джон");
        } else if(firstLetterOfName == 'I') {
            System.out.println("Вас зовут Иван");
        } else {
            System.out.println("Должно быть ваше имя мне неизвестно");
        }

        System.out.println("\n2. Поиск max и min числа");
        int numberOne = 502, numberTwo = -129;
        if (numberOne > 0 && numberTwo < 0) {
            System.out.println(numberOne + " максимальное число");
            System.out.println(numberTwo + " минимальное число");
        }
        if (numberOne == numberTwo) {
            System.out.println(numberOne + " и " + numberTwo + " равны");
        } else {
            System.out.println(numberOne + " и " + numberTwo + " не равны");
        }

        System.out.println("\n3. Проверка числа");
        int randomNum = 567;
        if (randomNum != 0) {
            if (randomNum % 2 == 0) {
                System.out.println("Число " + randomNum + " является четным");
            } else {
                System.out.println("Число " + randomNum + " является нечетным");
            }
            if (randomNum < 0) {
                System.out.println("Число " + randomNum + " является отрицательным");
            } else {
                System.out.println("Число " + randomNum + " является положительным");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num = 123;
        int num1 = 123;
        System.out.println("Исходные числа: " + num + " и " + num1);
        if ((num / 100 == num1 / 100) && (num / 10 % 10 == num1 / 10 % 10) && (num % 10 == num1 % 10)) {
            if (num / 100 == num1 / 100) {
                System.out.println("Одинаковые числа в первом разряде: "
                    + num / 100 + " и " + num1 / 100);
            }
            if (num / 10 % 10 == num1 / 10 % 10) {
                System.out.println("Одинаковые числа во втором разряде: "
                    + num / 10 % 10 + " и " + num1 / 10 % 10);
            }
            if (num % 10 == num1 % 10) {
                System.out.println("Одинаковые числа в третьем разряде: "
                    + num / 10 % 10 + " и " + num1 / 10 % 10);
            }
        } else {
            System.out.println("Числа не равны!");
        }
        
        System.out.println("\n5. Определение символа по его коду");
        char sym = '\u0057';
        if (sym == 'a' || sym == 'b' || sym == 'c' || sym == 'd' || sym == 'e' || sym == 'f' || sym == 'g' ||
            sym == 'n' || sym == 'i' || sym == 'j' || sym == 'k' || sym == 'l' || sym == 'm' || sym == 'n' || 
            sym == 'o' || sym == 'p' || sym == 'q' || sym == 'r' || sym == 's' || sym == 't' || sym == 'u' || 
            sym == 'v' || sym == 'w' || sym == 'x' || sym == 'y' || sym == 'z') {
            System.out.println("Большая буква " + sym);
        } else if (sym == 'A' || sym == 'B' || sym == 'C' || sym == 'D' || sym == 'E' || sym == 'F' || sym == 'G' ||
            sym == 'H' || sym == 'I' || sym == 'J' || sym == 'K' || sym == 'L' || sym == 'M' || sym == 'N' || 
            sym == 'O' || sym == 'P' || sym == 'Q' || sym == 'R' || sym == 'S' || sym == 'T' || sym == 'U' || 
            sym == 'V' || sym == 'W' || sym == 'X' || sym == 'Y' || sym == 'Z') {
            System.out.println("Большая буква " + sym);
        } else if (sym == '0' || sym == '1' || sym == '2' || sym == '3' || sym == '4' || sym == '5' || sym == '6' || 
            sym == '7' || sym == '8' || sym == '9') {
            System.out.println("Число " + sym);
        } else {
            System.out.println("Не буква и не число");
        }
        
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 340000, accruedInterest = 0, totalSum = 0;
        if (deposit <= 100_000) {
            accruedInterest = (deposit * 5 * 365 / 365) / 100;
            totalSum = deposit + accruedInterest;
        }
        if (deposit >= 100000 && deposit <= 300000) {
            accruedInterest = (deposit * 7 * 365 / 365) / 100;
            totalSum = deposit + accruedInterest;
        }
        if (deposit > 300000) {
            accruedInterest = (deposit * 7 * 365 / 365) / 100;
            totalSum = deposit + accruedInterest;
        }
        System.out.println("Сумма вклада: " + deposit);
        System.out.println("Начисленный %: " + accruedInterest);
        System.out.println("Итоговая сумма с %: " + totalSum);


        System.out.println("\n7. Определение оценки по предметам");
        int history = 59, programming = 91;
        int historyGrade = 0, progrGrade = 0, sumGrades = 0;
        if (history <= 60) {
            historyGrade = 2;
        }
        if (programming <= 60) {
            progrGrade = 2;
        }
        if (history > 60) {
            historyGrade = 3;
        }
        if (programming > 60) {
            progrGrade = 3;
        }
        if (history > 73) {
            historyGrade = 4;
        }
        if (programming > 73) {
            progrGrade = 4;
        }
        if (history > 91) {
            historyGrade = 5;
        }
        if (programming > 91) {
            progrGrade = 5;
        }
        sumGrades = (historyGrade + progrGrade) / 2;
        int sumPercent = (history + programming )/ 2;
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
            System.out.println("Прибыль за год: -" + profit);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int sumInUSD = 567;
    }
} 