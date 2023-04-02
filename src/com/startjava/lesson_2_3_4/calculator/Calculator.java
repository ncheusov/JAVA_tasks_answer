package startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String mathExpression) {
        String[] expression = mathExpression.split(" ");
        int num1 = Integer.parseInt(expression[0]);
        String sign = expression[1];
        int num2 = Integer.parseInt(expression[2]);
        double result = switch (sign) {
            case "+" -> Math.addExact(num1, num2);
            case "-" -> Math.subtractExact(num1, num2);
            case "*" -> Math.multiplyExact(num1, num2);
            case "/" -> Math.floorDiv(num1, num2);
            case "%" -> Math.floorMod(num1, num2);
            case "^" -> Math.pow(num1, num2);
            default ->
                throw new RuntimeException("Некореткный знак");
        };
        return result;
    }
}
