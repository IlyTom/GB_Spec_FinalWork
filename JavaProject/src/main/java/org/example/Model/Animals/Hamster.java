package org.example.Model.Animals;

import java.util.List;

public class Hamster extends Pets{
    public Hamster(String name, String birthDate, List<String> commands) {
        super(name, birthDate, commands, AnimalsType.Hamster);
    }
}
