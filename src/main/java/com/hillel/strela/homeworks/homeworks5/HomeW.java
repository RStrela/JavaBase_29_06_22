package com.hillel.strela.homeworks.homeworks5;

import java.util.Scanner;

public class HomeW {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите имя 1-ой команды: ");
        String team1 = scanner.next();

        System.out.println("Введите число убийств для 1-го игракока " + "команды " + team1);
        int number1T1 = scanner.nextInt();
        System.out.println("Введите число убийств для 2-го игракока " + "команды " + team1);
        int number2T1 = scanner.nextInt();
        System.out.println("Введите число убийств для 3-го игракока " + "команды " + team1);
        int number3T1 = scanner.nextInt();
        System.out.println("Введите число убийств для 4-го игракока " + "команды " + team1);
        int number4T1 = scanner.nextInt();
        System.out.println("Введите число убийств для 5-го игракока " + "команды " + team1);
        int number5T1 = scanner.nextInt();

        System.out.println("Очки 1-го = " + number1T1);
        System.out.println("Очки 2-го = " + number2T1);
        System.out.println("Очки 3-го = " + number3T1);
        System.out.println("Очки 4-го = " + number4T1);
        System.out.println("Очки 5-го = " + number5T1);

        double sumTeam1 = (double) (number1T1 + number2T1 + number3T1 + number4T1 + number5T1) / (double) 5;


        System.out.println("ВВедите имя 2-ой команды: ");
        String team2 = scanner.next();

        System.out.println("Введите число убийств для 1-го игракока " + "команды " + team2);
        int number1T2 = scanner.nextInt();
        System.out.println("Введите число убийств для 2-го игракока " + "команды " + team2);
        int number2T2 = scanner.nextInt();
        System.out.println("Введите число убийств для 3-го игракока " + "команды " + team2);
        int number3T2 = scanner.nextInt();
        System.out.println("Введите число убийств для 4-го игракока " + "команды " + team2);
        int number4T2 = scanner.nextInt();
        System.out.println("Введите число убийств для 5-го игракока " + "команды " + team2);
        int number5T2 = scanner.nextInt();

        System.out.println("Очки 1-го = " + number1T2);
        System.out.println("Очки 2-го = " + number2T2);
        System.out.println("Очки 3-го = " + number3T2);
        System.out.println("Очки 4-го = " + number4T2);
        System.out.println("Очки 5-го = " + number5T2);

        double sumTeam2 = (number1T2 + number2T2 + number3T2 + number4T2 + number5T2) / (double) 5;

        System.out.println("Команда: " +  team1 + ", очков: " + sumTeam1);
        System.out.println("Команда: " +  team2 + ", очков: " + sumTeam2);

        if (sumTeam1 > sumTeam2) {
            System.out.println("Победила команда " + team1 + " со счетом " + sumTeam1);
        } else if (sumTeam1 < sumTeam2) {
            System.out.println("Победила команда " + team2 + " со счетом " + sumTeam2);
        } else {
            System.out.println( " Ничья ");
        }

    }
}

