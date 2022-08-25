package com.hillel.strela.homeworks.homeworks7;

import java.util.Arrays;
import java.util.Random;

public class HomeW {
    public static void main(String[] args) {
        int[] array1 = new int[25];
        int sum1 = 0;
        int sum2 = 0;
        int middle1 = 0;
        int middle2 = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = randomNum(18, 40);
            sum1 += array1[i];
            middle1 = sum1 / array1.length;
        }
        System.out.println("Возраст первой команды: " + Arrays.toString(array1));
        System.out.println("Средний возраст первой команды: " + middle1);

        int[] array2 = new int[25];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = randomNum(18, 40);
            sum2 += array2[i];
            middle2 = sum2 / array2.length;
        }
        System.out.println("Возраст второй команды: " + Arrays.toString(array2));
        System.out.println("Средний возраст второй команды: " + middle2);
    }

    static int randomNum(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
                  
}

