package startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] numbers = new int[10];
//    private int size = 0;

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
        return Arrays.copyOf(numbers, size());
    }

    public void clear() {
        Arrays.fill(numbers, size());
    }

    private int size() {
        int size = 0;
        for (int digit : numbers) {
            if (digit != 0) {
                size++;
            }
        }
        return size;
    }
}
