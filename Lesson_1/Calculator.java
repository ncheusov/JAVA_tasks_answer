public class Calculator {

    public static void main(String[] args) {
        int numA = 25;
        int numB = 2;
        int add = numA + numB;
        int substract = numA - numB;
        int multiply = numA * numB;
        int division = numA / numB;
        int modulus = numA % numB;
        int pow = '^';
        int currentOperation = numA + numB;
        int result;
        if (currentOperation == add) {
            result = numA + numB;
            System.out.println(numA + " + " + numB + " = " + result);
        } else if (currentOperation == substract) {
            result = numA - numB;
            System.out.println(numA + " - " + numB + " = " + result);
        } else if (currentOperation == multiply) {
            result = numA * numB;
            System.out.println(numA + " * " + numB + " = " + result);
        } else if (currentOperation == division) {
            result = numA / numB;
            System.out.println(numA + " / " + numB + " = " + result);
        } else if (currentOperation == modulus) {
            result = numA % numB;
            System.out.println(numA + " % " + numB + " = " + result);
        } else if (currentOperation == pow) {
            int result2 = 1;
            for (int i = 1; i <= numB; i++) {
                result2 *= numA;
            }
            result = result2;
            System.out.println(numA + " ^ " + numB + " = " + result);
        }
    }
}