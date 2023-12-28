package org.example.Model.Animals;

import java.util.List;

public class Camel extends PackAnimals{
    public Camel(String name, String BirthDate, List<String> Commands) {
        super(name, BirthDate, Commands, AnimalsType.Camel);
    }
}
