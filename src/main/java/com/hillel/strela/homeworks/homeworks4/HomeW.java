package com.hillel.strela.homeworks.homeworks4;

import javax.swing.*;

public class HomeW {
    public static void main(String[] args) {

        String type1 = "Jet";
        String name1 = "F52";

        String type2 = "Boeing ";
        String name2 = "747 ";
        int secondClassPassengers2 = 300;

        String type3 = "Boeing ";
        String name3 = "747 ";
        int firstClassPassengers3 = 25;
        int secondClassPassengers3 = 300;




        System.out.println(buildAirplane(type1, name1 ));
        System.out.println(buildAirplane(type2, name2, secondClassPassengers2 ));
        System.out.println(buildAirplane(type3, name3, secondClassPassengers3, firstClassPassengers3));
    }

    static  String buildAirplane(String type1, String name1) {
        return "Имя: " + type1 +  " Тип: " +  name1;
    }
    static  String buildAirplane(String type2, String name2, int secondClassPassengers2) {
        return "Имя: " + type2 + "Тип: " + name2 + "Количество мест 2-го класса: " + secondClassPassengers2;
    }
    static  String buildAirplane(String type3, String name3, int secondClassPassengers3, int firstClassPassengers3) {
        return "Имя: " + type3 + "Тип: " + name3 + "Количество мест 2-го класса: " + secondClassPassengers3 + " Количество мест 1-го класса: " + firstClassPassengers3;

    }
}
