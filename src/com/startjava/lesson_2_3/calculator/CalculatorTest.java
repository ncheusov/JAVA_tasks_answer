package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                System.out.print("Введите первое число: ");
                myCalculator.setNum1(scan.nextInt());

                System.out.print("Введите знак математической операции: ");
                scan.nextLine();
                myCalculator.setSign(scan.nextLine().charAt(0));

                System.out.print("Введите второе число: ");
                myCalculator.setNum2(scan.nextInt());
                myCalculator.calculate();
            }
            System.out.println("Хотите продолжить вычисления? [yes/no] ");
            scan.nextLine();
            answer = scan.nextLine();
        }
    }
}