package startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private static final int[] NUMBERS = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNumber(int number, int elem) {
        NUMBERS[elem] = number;
    }

    public int[] getNumbers() {
        int size = 0;
        for (int digit : NUMBERS) {
            if (digit != 0) {
                size++;
            }
        }
        return Arrays.copyOf(NUMBERS, size);
    }
}
