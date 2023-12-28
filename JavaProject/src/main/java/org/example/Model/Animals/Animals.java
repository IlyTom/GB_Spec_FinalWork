package org.example.Model.Animals;

import java.util.List;

public class Animals {
    private String name;
    private String BirthDate;
    private List<String> Commands;
    private AnimalsType Type;

    public Animals(String name, String birthDate, List<String> commands, AnimalsType type) {
        this.name = name;
        this.BirthDate = birthDate;
        this.Commands = commands;
        this.Type = type;
    }

    public String getName() {
        return name;
    }
    public AnimalsType getType() {
        return Type;
    }
    public String getBirthDate() {
        return BirthDate;
    }

    public List<String> getCommands() {
        return Commands;
    }
}
