package org.example.Model.Animals;

import java.util.List;

public class Pets extends Animals{
    private String name;
    private String BirthDate;
    private List<String> Commands;
    private AnimalsType Type;

    public Pets(String name, String birthDate, List<String> commands, AnimalsType type) {
        super(name, birthDate,commands,type);
        this.name = name;
        this.BirthDate = birthDate;
        this.Commands = commands;
        this.Type = type;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public List<String> getCommands() {
        return Commands;
    }





}
