package startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private static final int UPPER_BOUNDARY = 100;
    private static final int MAX_ATTEMPT = 10;
    private static final int LOWER_BOUNDARY = 0;
    private final int[] numbers = new int[10];
    private final String name;
    private int attempt;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempt() {
        return attempt;
    }

    public void addScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public boolean addNumber(int number) {
        if (number > LOWER_BOUNDARY && number <= UPPER_BOUNDARY) {
            if (attempt < MAX_ATTEMPT) {
                numbers[attempt] = number;
                attempt++;
                return true;
            }
            System.out.println("У " + name + " закончились попытки");
        }
        return false;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public int getLastNumber() {
        return numbers[attempt - 1];
    }

    public void clearAttempts() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
}
