public class Player {

    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int playerNumber) {
        if (playerNumber > 100 || playerNumber < 0) {
            System.out.print("Число должно быть в диапазоне от 0 до 100");
        } else {
            number = playerNumber;
        }
    }

    public int getNumber() {
        return number;
    }
}