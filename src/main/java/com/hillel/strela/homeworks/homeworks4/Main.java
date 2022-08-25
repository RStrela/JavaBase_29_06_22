package com.hillel.strela.homeworks.homeworks4;

public class Main {
    public static void main(String[] args) {
////        String str1 = getStrHello();
////        System.out.println(str1);
        printGreating();

//        double d1 = 1.222;
//        System.out.println(1.222);
//        System.out.println(d1);
//        System.out.println(demo1());


        int a = 10;
        int b = 15;
        int sum = getSum(a, b);
        System.out.println(a);
        System.out.println(sum);


    }

        static int getSum(int a, int b){
        a = 30;
        int result = a + b;
        return result;
        }


    static void printGreating() {
        System.out.println("Hello");
    }
//
//    static String getStrHello() {
//        String hello = "Hello";
//        return "Hello";
//
//    }
//    static double demo1() {
//        return 1.222;

    }


