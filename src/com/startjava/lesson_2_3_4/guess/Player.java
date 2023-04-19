package startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private int attempt;
    private final int[] numbers = new int[10];

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
        if (number > 0 && number <= 100) {
            if (attempt < 10) {
                numbers[attempt] = number;
                attempt++;
            } else {
                System.out.println("У " + name + " закончились попытки");
            }
        } else {
            System.out.println("Вводимое число должно быть в полуинтервале (0, 100]");
            throw new RuntimeException();
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
