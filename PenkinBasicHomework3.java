package ru.java.penkin.lesson3dz;

import java.util.Scanner;

public class PenkinBasicHomework3 {
    public static void greetings () {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }
    public static void checkSign (int a, int b, int c) {
        int result = a + b + c;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void selectColor() {
        int data = 15;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data < 20 && data > 10) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 67;
        int b = 50;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static void addOrSubtractAndPrint (int initValue, int delta, boolean increment) {
        if (increment == true) {
            int result = initValue + delta;
            System.out.println(result);
        } else {
            int result = initValue - delta;
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        System.out.print("Введите номер метода от 1 до 5");
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        if (int h = 1) {
        greetings();
        } else if (h = 2) {
            checkSign();
        } else if (h = 3) {
            selectColor();
        } else if (h = 4) {
            compareNumbers();
        } else if (h = 5) {
            addOrSubtractAndPrint();
        }
    }
}

