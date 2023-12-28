package org.example.Model.Animals;

import java.util.List;

public class Cat extends Pets{
    public Cat(String name, String birthDate, List<String> commands) {
        super(name, birthDate, commands, AnimalsType.Cat);
    }
}
