package org.example.Model.Animals;

import java.util.List;

public class Horse extends PackAnimals{
    public Horse(String name, String birthDate, List<String> commands) {
        super(name, birthDate, commands, AnimalsType.Horse);
    }
}
