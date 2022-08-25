package com.hillel.strela.homeworks.homeworks13;

public class Main {
    public static void main(String[] args) {

        Music[] music = new Music[] {new PopMusic("Evanescence"), new RockMusic("Vagner"), new ClassicMusic("DuaLipa")};
        for (Music music1 : music) {
            music1.playMusic();
        }

    }
}
