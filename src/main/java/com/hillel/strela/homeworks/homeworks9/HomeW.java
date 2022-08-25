package com.hillel.strela.homeworks.homeworks9;

import java.util.Scanner;

public class HomeW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = getNumber(scanner);
        int m = getNumber(scanner);
        int[][] mass1 = new int[n][n];
        int[][] mass2 = new int[m][m];
        for (int i = 0; i < mass1.length; i++) {
            for (int j = 0; j < mass1[i].length; j++) {
                mass1[i][j] = (int) (Math.random() * 21);
            }
        }
        System.out.println("Первый масив");
        for (int i = 0; i < mass1.length; i++) {
            for (int j = 0; j < mass1[i].length; j++) {
                System.out.println(mass1[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < mass1.length; i++) {
            for (int j = 0; j < mass1[i].length; j++) {
                mass2[i][j] = mass1[i][j];
            }
        }
        System.out.println("Второй масив");
        for (int i = 0; i < mass2.length; i++) {
            for (int j = 0; j < mass2[i].length; j++) {
                System.out.println(mass2[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int getNumber (Scanner scanner){
        while (true) {
            System.out.println("Ведите число от 1 до 9: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number >= 1 && number <= 9) {
                    return number;
                }
            } else {
                scanner.next();
            }
        }
    }
}

