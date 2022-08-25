package com.hillel.strela.homeworks.homeworks9;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = getNumber(scanner);
        int m = getNumber(scanner);

        int[][] array1 = new int[n][m];
        int[][] array2 = new int[m][n];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 21);
            }
        }

        System.out.println("Первый массив");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array2[j][i] = array1[i][j];
            }
        }

        System.out.println("Второй массив");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int getNumber(Scanner scanner) {
        while (true) {
            System.out.println("Ведите число от 1 до 9 ");
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

