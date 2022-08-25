package com.hillel.strela.homeworks.homeworks2;

public class Main {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int c = 12;

        int volume = a * b * c;

        int length = (a + b + c ) * 4;

        System.out.println("Высота = " + a);
        System.out.println("Длина = " + b);
        System.out.println("Ширина = " + c);


        System.out.println("Объем параллелепипеда = " + volume);
        System.out.println("Длина сторон параллелепипеда = " + length);
    }
}
