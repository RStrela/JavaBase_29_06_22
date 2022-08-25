package com.hillel.strela.homeworks.homeworks13;

public class PopMusic extends Music {
    public PopMusic(String groupName) {
        super(groupName);
    }


    @Override
    void playMusic() {
        System.out.println("Играет попса << > >> " + groupName);
    }
}
