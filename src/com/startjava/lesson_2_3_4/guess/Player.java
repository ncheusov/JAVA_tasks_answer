package startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String NAME;
    private int[] numbers;

    public Player(String name) {
        this.NAME = name;
    }

    public String getName() {
        return NAME;
    }

    public void setNumber(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        int size = 0;
        for (int digit : numbers) {
            if (digit != 0) {
                size++;
            }
        }
        return java.util.Arrays.copyOf(numbers, size);
    }
}
