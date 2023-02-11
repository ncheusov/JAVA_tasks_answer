public class Calculator {

    private int numA;
    private int numB;
    private int result;
    private char sign;

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void start() {
        switch (sign) {
            case '+':
                result = numA + numB;
                break;
            case '-':
                result = numA - numB;
                break;
            case '*':
                result = numA * numB;
                break;
            case '/':
                result = numA / numB;
                break;
            case '%':
                result = numA % numB;
                break;
            case '^':
                for (int i = 1; i <= numB; i++) {
                    result *= numA;
                }
                break;
        }
        System.out.println("Результат: " + numA + " " + sign + " " + numB + " = " + result);
    }
}