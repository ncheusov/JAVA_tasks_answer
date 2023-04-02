package startjava.lesson_2_3_4.calculator;

public class Calculator {

    public double calculate(String mathExpression) {
        String[] expression = mathExpression.split(" ");
        int num1 = Integer.parseInt(expression[0]);
        String sign = expression[1];
        int num2 = Integer.parseInt(expression[2]);
        double result = 0;
        switch (sign) {
            case "+":
                return Math.addExact(num1, num2);
            case "-":
                return Math.subtractExact(num1, num2);
            case "*":
                return Math.multiplyExact(num1, num2);
            case "/":
                return Math.floorDiv(num1, num2);
            case "%":
                return Math.floorMod(num1, num2);
            case "^":
                return Math.pow(num1, num2);
        }
        return result;
    }
}
