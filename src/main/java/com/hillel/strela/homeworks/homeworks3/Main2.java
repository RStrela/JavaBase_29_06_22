package com.hillel.strela.homeworks.homeworks3;


public class Main2 {
    public static void main(String[] args) {


        int warriorLiAttack = 13;
        int bowWarriorLiAttack = 24;
        int HorseWarriorLiAttack = 46;

        int amountLi = 860;

        System.out.println("Сума атаки Ли = " + ((warriorLiAttack * amountLi) + (bowWarriorLiAttack * amountLi) + (HorseWarriorLiAttack * amountLi)));

        int warriorMinAttack = 9;
        int bowWarriorMinAttack = 35;
        int HorseWarriorMinAttack = 12;

        double amountMin = amountLi * 1.5;

        System.out.println("Сума атаки Минь = " + (int) ((warriorMinAttack * amountMin) + (bowWarriorMinAttack * amountMin) + (HorseWarriorMinAttack * amountMin)));

    }
}
