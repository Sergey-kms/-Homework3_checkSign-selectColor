package ru.java.penkin.lesson3dz;

public class penkin_lesson3_dz_checkSign {
    public static void checkSign() {
        int a = 2;
        int b = 5;
        int c = -10;
        int result = a + b + c;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void main(String[] args) {
        checkSign();
    }
}