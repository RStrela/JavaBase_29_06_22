package com.hillel.strela.homeworks.homeworks3;

public class Main {

    public static void main(String[] args) {


//        int a = 10;
//
//        a += 5;
//        System.out.println(a);
//        a -= 5;
//        System.out.println(a);
//
//        System.out.println(Math.E);
//
//        int round = Math.round(11.6f);
//        long round2 = Math.round(11.6);
//
//        System.out.println(round);
//        System.out.println(round2);
//
//        double pow = Math.pow(5, 3 ); // возведение в степень
//        System.out.println(pow);
//
//        double sqrt = Math.sqrt(16);
//        System.out.println(sqrt);

//        int randomNumber1 = (int) Math.random() * 11;
//        int randomNumber2 = (int) (Math.random() * 11);
//        System.out.println((int) (Math.random() * 11));
//        System.out.println((int) (Math.random() * 11));

//        int a = 2;
//        int b = -3;
//        int c = 16;
//
//        double result = Math.abs(a - b) / (a + b) * 3 - Math.sqrt(c);
//        System.out.println(result);

        int salary1 = 500;
        int salary2 = 1500;
        int salary3 = 3500;

        int  salary1for10years = salary1 * 120;
        int  salary2for10years = salary2 * 120;
        int  salary3for10years = salary3 * 120;

        System.out.println(salary1for10years);
        System.out.println(salary2for10years);
        System.out.println(salary3for10years);

        double salary1for10yearsWitoutTax = salary1for10years * 0.95;
        double salary2for10yearsWitoutTax = salary2for10years * 0.95;
        double salary3for10yearsWitoutTax = salary3for10years * 0.95;

        System.out.println(salary1for10yearsWitoutTax);
        System.out.println(salary2for10yearsWitoutTax);
        System.out.println(salary3for10yearsWitoutTax);

        double avg = (salary1for10yearsWitoutTax + salary2for10yearsWitoutTax + salary3for10yearsWitoutTax) / 3;
        System.out.println("avg = " + avg);


        double ball1 = 1;
        double ball2 = 0.5;
        double ball3 = 0.2;
        final double DESTINY_FACTOR = 0.7;

        double volumeBall1 = (double) 4 / 3 * Math.PI * Math.pow(ball1, 3);
        double volumeBall2 = (double) 4 / 3 * Math.PI * Math.pow(ball2, 3);
        double volumeBall3 = (double) 4 / 3 * Math.PI * Math.pow(ball3, 3);

        System.out.println(volumeBall1);
        System.out.println(volumeBall2);
        System.out.println(volumeBall3);

        double sumWeightBalls = (volumeBall1 + volumeBall2 + volumeBall3) * DESTINY_FACTOR;
        System.out.println(sumWeightBalls);







    }
}
