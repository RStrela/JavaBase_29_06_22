package com.hillel.strela.homeworks.homeworks14;

public class Androids implements Smartphones, LinuxOS{
    @Override
    public void call() {
        System.out.println("Звонок для Андроид ");
    }

    @Override
    public void sms() {
        System.out.println("Смс для Андроид ");
    }

    @Override
    public void internet() {
        System.out.println("Интернет для Андроид ");
    }

    @Override
    public void getOperationSystem() {
        System.out.println("LinuxOS");
    }
}
