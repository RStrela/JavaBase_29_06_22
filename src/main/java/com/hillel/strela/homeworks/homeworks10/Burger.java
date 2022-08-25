package com.hillel.strela.homeworks.homeworks10;

public class Burger {
    String bun;
    int firstMeat;
    int secondMeat;
    String cheese;
    String greens;
    String mayonnaise;

    public Burger(String bun, int firstMeat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.firstMeat = firstMeat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
    }

    public Burger(String bun, int firstMeat, String cheese, String greens) {
        this.bun = bun;
        this.firstMeat = firstMeat;
        this.cheese = cheese;
        this.greens = greens;
    }

    public Burger(String bun, int firstMeat, int secondMeat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.firstMeat = firstMeat;
        this.secondMeat = secondMeat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", firstMeat=" + firstMeat +
                ", secondMeat=" + secondMeat +
                ", cheese='" + cheese + '\'' +
                ", greens='" + greens + '\'' +
                ", mayonnaise='" + mayonnaise + '\'' +
                '}';
    }
}


