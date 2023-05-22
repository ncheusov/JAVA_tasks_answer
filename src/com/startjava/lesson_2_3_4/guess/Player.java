package startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    static final int START_RANGE = 100;
    static final int MAX_ATTEMPT = 10;
    private static final int END_RANGE = 1;
    private final int[] numbers = new int[MAX_ATTEMPT];
    private final String name;
    private int attempt;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public boolean addNumber(int number) {
        if (number > END_RANGE && number <= START_RANGE) {
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

    public String getName() {
        return name;
    }

    public int getAttempt() {
        return attempt;
    }

    public void clearAttempts() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }

    public void upScore() {
        score++;
    }

    public int getScore() {
        return score;
    }
}
