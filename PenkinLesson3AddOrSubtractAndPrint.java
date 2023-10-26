package ru.java.penkin.lesson3dz;

public class PenkinLesson3AddOrSubtractAndPrint {
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
        addOrSubtractAndPrint(10, 50, false);
    }
}
