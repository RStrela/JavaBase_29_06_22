package com.hillel.strela.homeworks.homeworks14;

public class Main {
    public static void main(String[] args) {

        Androids androids = new Androids();
        androids.call();
        androids.sms();
        androids.internet();
        androids.getOperationSystem();

        IPhone iPhone = new IPhone();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.getIOS();
    }
}
