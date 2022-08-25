package com.hillel.strela.homeworks.homeworks8;


import java.util.Arrays;

public class HomeW {
    public static void main(String[] args) {
        int[] first = new int[9];
        for (int i = 0; i < first.length; i++) {
            first[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(first);

        System.out.println("Числа казино " + Arrays.toString(first));
        int[] second = new int[9];
        for (int i = 0; i < second.length; i++) {
            second[i] = (int) (Math.random() * 10);

        }
        Arrays.sort(second);

        System.out.println("Числа игрока " + Arrays.toString(second));

        int count = 0;
        for (int i = 0; i < 9; i++) {
            if (first[i]==second[i])count++;
        }
        System.out.println("Совпадений: " + count);
    }
}
