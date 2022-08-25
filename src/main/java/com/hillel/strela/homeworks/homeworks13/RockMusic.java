package com.hillel.strela.homeworks.homeworks13;

public class RockMusic extends Music {

    public RockMusic(String groupName) {
        super(groupName);
    }
    @Override
    void playMusic() {
       System.out.println("Играет рок << > >> " + groupName);
    }
}
