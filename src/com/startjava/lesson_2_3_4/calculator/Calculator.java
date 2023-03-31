package startjava.lesson_2_3_4.calculator;

public class Calculator {

    public double calculate(String[] mathExpression) {
        int num1 = Integer.parseInt(mathExpression[0]);
        String sign = mathExpression[1];
        int num2 = Integer.parseInt(mathExpression[2]);
        double result = 1d;
        switch (sign) {
            case "+":
                result = Math.addExact(num1, num2);
                break;
            case "-":
                result = Math.subtractExact(num1, num2);
                break;
            case "*":
                result = Math.multiplyExact(num1, num2);
                break;
            case "/":
                result = Math.floorDiv(num1, num2);
                break;
            case "%":
                result = Math.floorMod(num1, num2);
                break;
            case "^":
                result = Math.pow(num1, num2);
                break;
        }
        return result;
    }
}
