package com.hillel.strela.homeworks.homeworks12;

public class Main {
    public static void main(String args[]) {
        new Account("Джон", 23, 8, 1996, "Jon227@gmail.com", "+380637015757", "Колесников", 75, 95, 13054).printAccountInfo();
        new Account("Роза", 12, 2, 1993, "roze@email.com", "+380631950320", "Душная", 45, 82, 9521).printAccountInfo();

        Account roma = new Account("Рома ", 18, 12, 2004, "Romathebest@gmail.com", "+380631488228", "Постебайло", 75, 99, 920);
        roma.printAccountInfo();
        roma.setSurname("Прокопенко");
        roma.setWeight(62);
        roma.setPressure(120);
        roma.setStepsByDay(22223);
        roma.printAccountInfo();

    }
}
