// finalhw means final homework
package com.startjava.lesson_1.finalhw;

public class GuessNumberGame {

    public static void main(String[] args) {
        int computerNumber = 11;
        int playerNumber = 50;
        for (int i = 1; i <= 1000; i++) {
            if (playerNumber < computerNumber) {
                // в диапазоне от 0
                if (playerNumber < 1) {
                    playerNumber += 21;
                } else {
                    System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                    playerNumber += 24;
                }
            } else if (playerNumber > computerNumber) {
                // до 100
                if (playerNumber > 100) {
                    playerNumber -= 26;
                } else {
                    System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                    playerNumber -= 31;
                }
            } else if (playerNumber == computerNumber) {
                System.out.println("Число - " + computerNumber + ". \nВы победили!");
                break;
            }
        }
    }
}