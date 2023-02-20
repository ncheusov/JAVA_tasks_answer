public class Player {

    private String name;
    private int number;

    public Player() {}

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        if (number > 100 || number < 1) {
            System.out.println("Число должно быть в полуинтервале от 0 до 100");
        } else {
            this.number = number;
        }
    }

    public int getNumber() {
        return number;
    }
}