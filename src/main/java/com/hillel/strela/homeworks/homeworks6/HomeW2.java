package com.hillel.strela.homeworks.homeworks6;

public class HomeW2 {
    public static void main(String[] args) {
        task2();
    }

    static void task2() {
        int countShuttle = 1;
        int numberShuttle = 1;

        while (countShuttle <= 100) {
            if (check(numberShuttle)) {
                System.out.println("Номер шатла: " + numberShuttle + " - порядковый номер: " + countShuttle);
                countShuttle++;
            }
            numberShuttle++;
        }
    }

    static boolean check(int number) {
        if (number == 4 || number == 9 || number % 10 == 4 || number % 10 == 9 || (number % 100) / 10 == 4 || (number % 100) / 10 == 9) {
            return false;
        } else {
            return true;
        }
    }
}









