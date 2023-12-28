package org.example.Model.Animals;

import java.util.List;

public class Donkey extends PackAnimals{
    public Donkey(String name, String BirthDate, List<String> Commands) {
        super(name, BirthDate, Commands, AnimalsType.Donkey);
    }
}
