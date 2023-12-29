package org.example.View;

public class ViewText {
    public enum AnimalType{
        Dog, Cat, Hamster, Horse, Camel, Donkey
    }

    static String mainMenu = "1. Добавить питомца. \n" +
            "2. Добавить команду(ы) питомцу\n" +
            "3. Отобразить всех питомцев.";

    static String selectMenuItem = "Выберите пункт меню: ";

    static String successfulAddCommand = "Команда(ы) успешно добавлены питомцу.";
    static String failedAddCommand = "Команда(ы) не добавлены питомцу.";

}
