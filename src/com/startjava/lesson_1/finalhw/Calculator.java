// finalhw means final homework
package startjava.lesson_1.finalhw;

public class Calculator {

    public static void main(String[] args) {
        int numA = 25;
        int numB = 2;
        int result = 1;
        char sign = '^';

        if (sign == '+') {
            result = numA + numB;
        } else if (sign == '-') {
            result = numA - numB;
        } else if (sign == '*') {
            result = numA * numB;
        } else if (sign == '/') {
            result = numA / numB;
        } else if (sign == '%') {
            result = numA % numB;
        } else if (sign == '^') {
            for (int i = 1; i <= numB; i++) {
                result *= numA;
            }
        }
        System.out.println(numA + " " + sign + " " + numB + " = " + result);
    }
}
