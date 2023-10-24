package ru.java.penkin.lesson3dz;

public class penkin_lesson3_dz_selectColor {
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
    public static void main(String[] args) {
        selectColor();
    }
}