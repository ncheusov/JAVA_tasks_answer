package startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNumber(int number, int elem) {
        numbers[elem] = number;
    }

    public int[] getNumbers() {
        int size = 0;
        for (int digit : numbers) {
            if (digit != 0) {
                size++;
            }
        }
        return Arrays.copyOf(numbers, size);
    }

    public void clear() {
        Arrays.fill(numbers, 0);
    }
}
