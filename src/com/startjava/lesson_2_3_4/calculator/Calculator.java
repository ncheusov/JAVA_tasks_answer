package startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String mathExpression) {
        String[] elements = mathExpression.split(" ");
        int num1 = Integer.parseInt(elements[0]);
        int num2 = Integer.parseInt(elements[2]);
        validate(num1, num2);
        return switch (elements[1]) {
            case "+" -> Math.addExact(num1, num2);
            case "-" -> Math.subtractExact(num1, num2);
            case "*" -> Math.multiplyExact(num1, num2);
            case "/" -> Math.floorDiv(num1, num2);
            case "%" -> Math.floorMod(num1, num2);
            case "^" -> Math.pow(num1, num2);
            default  -> {
                System.out.println("Некорректный математический оператор");
                yield 0;
            }
        };
    }

    private static void validate(int num1, int num2) {
        if (((num1 <= 0) || (num2 <= 0)) || ((num1 % 1 != 0) || (num2 % 1 != 0))) {
            throw new RuntimeException("Вводимые числа должны быть целыми и положительными");
        }
    }
}
