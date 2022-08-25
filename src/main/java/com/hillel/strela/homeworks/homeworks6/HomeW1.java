package com.hillel.strela.homeworks.homeworks6;

import java.util.Scanner;
import java.lang.Math;

public class HomeW1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Отгадайте мое число, у Вас 3 попытки  ");
        int UnknownNumber = (int) Math.floor(Math.random() * 11);
        int PlayerNum = scanner.nextInt();
        for (int i = 1; i < 3; i++) {
            if (UnknownNumber > PlayerNum) {
                System.out.println("Мое число больше");
                System.out.println("Попытка № " + i);
                PlayerNum = scanner.nextInt();
            } else if (UnknownNumber < PlayerNum) {
                System.out.println("Мое число меньше ");
                System.out.println("Попытка № " + i);
                PlayerNum = scanner.nextInt();
            } else  {
                System.out.println("Урааа, ты угадал это число!: " + UnknownNumber);


            }
        }
    }
}

