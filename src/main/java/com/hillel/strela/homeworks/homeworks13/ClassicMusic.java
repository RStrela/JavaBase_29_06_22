package com.hillel.strela.homeworks.homeworks13;

public class ClassicMusic extends Music{
    public ClassicMusic(String groupName) {
        super(groupName);
    }
    @Override
    void playMusic() {
        System.out.println("Играет класика << > >> " + groupName);
    }
}
