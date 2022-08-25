package com.hillel.strela.homeworks.homeworks8;

public class Main2 {
    public static void main(String[] args) {

    }


    public class SomePhone {

        private int year;
        private String company;
        public SomePhone(int year, String company) {
            this.year = year;
            this.company = company;
        }
        private void openConnection(){
        }
        public void call() {
            openConnection();
            System.out.println("Вызываю номер");
        }

        public void ring() {
            System.out.println("Дзынь-дзынь");
        }

    }
        }
