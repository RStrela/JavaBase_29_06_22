package com.hillel.strela.homeworks.homeworks6;

public class Main2 {
    private static boolean isLikeJapanNums(int num) {
        int tmp = num % 10;
        do {
            if(tmp == 4 || tmp == 9)
                return false;
            num /= 10;
            tmp = num % 10;
        }while (num > 0);
        return true;
    }

    public static void main(String[] args) {
        int num = 1;
        int num1 = 1;
        for (int i = 1; i < 101 ; i++) {
        }
        while (num <= 100) {
            if (isLikeJapanNums(num1)) {
                for (int i = 0; i < 101 ; i++) {

                }
                num++;
            }
            num1++;
        }

    }



}
