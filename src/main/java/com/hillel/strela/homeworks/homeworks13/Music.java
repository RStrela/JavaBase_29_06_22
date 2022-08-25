package com.hillel.strela.homeworks.homeworks13;

public abstract class Music {
        String groupName;
        public Music(String groupName) {
                this.groupName = groupName;
        }

        abstract void playMusic();
}
