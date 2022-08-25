package com.hillel.strela.homeworks.homeworks14;

public class IPhone implements Smartphones, IOS {
    @Override
    public void call() {
        System.out.println("Звонок для IPhone ");
    }

    @Override
    public void sms() {
        System.out.println("Смс для IPhone ");
    }

    @Override
    public void internet() {
        System.out.println("Интернет для IPhone ");
    }

    @Override
    public void getIOS() {
        System.out.println("Это IOS");
    }
}
