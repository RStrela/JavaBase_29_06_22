package com.hillel.strela.homeworks.homeworks8;

public class Main {
    public static void main(String[] args) {
        int x[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int y[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        int m[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int n[] = {1, 2, 3, 4, 5, 6, 7, 8, 0, 9};

        System.out.println(compare(x, y));
        System.out.println(compare(m, n));
    }

    private static boolean compare(int a[], int b[]) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }

        return true;
    }
}
