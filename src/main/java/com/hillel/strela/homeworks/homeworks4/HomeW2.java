package com.hillel.strela.homeworks.homeworks4;

public class HomeW2 {
    public static void main(String[] args) {
        String a = "Will Smith";
        String b = "New York";
        long c = 2936729462846l;

        String a1 = "Jackie Chan";
        String b1 = "Shanghai";
        long c1 = 12312412412l;

        String a2 = "Sherlock Holmes";
        String b2 = "London";
        long c2 = 37742123513l;


        System.out.println(personInfo( a , b , c ));
        System.out.println(personInfo( a1 , b1 , c1 ));
        System.out.println(personInfo( a2 , b2 , c2 ));


    }
    static String personInfo(String a, String b, long c) {
        return "Позвонить гражданину: " + a + " из города: " + b + " можно по номеру: " + c;
    }
}
