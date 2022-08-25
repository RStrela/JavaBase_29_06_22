package com.hillel.strela.homeworks.homeworks10;

public class HomeW {
    public static void main(String[] args) {
        Burger burger = new Burger("Булочка", 1, "Сыр", "Салат");
        Burger burger1 = new Burger("Булочка", 1, "Сыр", "Салат", "Майонез" );
        Burger burger2 = new Burger("Булочка", 1, 1,"Сыр", "Салат", "Майонез");
        System.out.println(burger);
        System.out.println(burger1);
        System.out.println(burger2);
    }
}