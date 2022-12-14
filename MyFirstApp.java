public class MyFirstApp {

    public static void main(String[] args) {
        int sum = 2 + 2;
        boolean isEvenNumber = sum % 2 == 0;
        if(isEvenNumber == true) {
            System.out.println("Число " + sum + " является четным");
        } else {
            System.out.println("Число " + sum + " является нечетным"); 
        }
    }
}