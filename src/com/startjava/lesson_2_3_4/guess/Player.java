package startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private int attempt;
    private int[] numbers;

    public Player(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getAttempt() {
        return attempt;
    }

    public void addNumber(int number) {
        numbers = new int[10];
        if (attempt != 10) {
            numbers[attempt] = number;
            attempt++;
        }
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
