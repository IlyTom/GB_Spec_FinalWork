package org.example.Model.Animals;

import java.util.List;

public class Dog extends Pets{

    public Dog(String name, String birthDate, List<String> commands) {
        super(name, birthDate, commands, AnimalsType.Dog);
    }


}
