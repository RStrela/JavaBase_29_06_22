package com.hillel.strela.homeworks.homeworks15;

public enum DrinksMachine {
        COFFEE("Кофе"),
        TEA("Чай"),
        LEMONADE("Лимонад"),
        MOJITO("Мохито"),
        WATER("Вода"),
        COLA("Кола");

        private String title;

        DrinksMachine(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
}

