package com.hillel.strela.homeworks.homeworks7;

public class Gogo {
    public class Main {
        public static void main(String[] args) {
            int[] array = new int[10];
            int min = array.length,
                    max = 0,
                    sum = 0,
                    even = 0,
                    odd = 0;
            System.out.print("Массив: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) Math.round(Math.random() * 20);
                if (array[i] < min)
                    min = array[i];
                if (array[i] > max)
                    max = array[i];
                sum += array[i];
                if (array[i] % 2 == 0 && array[i] != 0)
                    even++;
                else if (array[i] % 2 != 0 && array[i] != 0)
                    odd++;
                System.out.print(array[i] + " ");
            }
            double av = (double) sum / array.length;
            System.out.println();
            System.out.println("Минимальное значение массива: " + min);
            System.out.println("Максимальное значение массива: " + max);
            System.out.println("Сумма всех элементов массива: " + sum);
            System.out.println("Среднее значение элементов массива: " + av);
            System.out.println("Количество четных элементов массива: " + even);
            System.out.println("Количество нечетных элементов массива: " + odd);
        }
    }
}
