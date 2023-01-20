public class GuessTheNumberGame {

    public static void main(String[] args) {
        int computerNumber = 11;
        int playerNumber = 50;
        for (int i = 1; i <= 1000; i++) {
            if (playerNumber == computerNumber) {
                System.out.println("Вы победили!");
                break;
            } else if (playerNumber <= computerNumber) {
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                playerNumber++;
            } else if (playerNumber >= computerNumber) {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                playerNumber--;
            }
        }
    }
}