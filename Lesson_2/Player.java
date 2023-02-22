public class Player {

    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        if (number <= 0 || number > 100) {
            System.out.println("Число должно быть в полуинтервале (0, 100]");
        } else {
            this.number = number;
        }
    }

    public int getNumber() {
        return number;
    }
}