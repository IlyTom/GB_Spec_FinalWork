package org.example.Model.Animals;

import java.util.List;

public class PackAnimals extends Animals{
    private String name;
    private String BirthDate;
    private List<String> Commands;
    private AnimalsType Type;

    public PackAnimals(String name, String BirthDate, List<String> Commands, AnimalsType Type) {
        super(name,BirthDate,Commands,Type);
        this.name = name;
        this.BirthDate = BirthDate;
        this.Commands = Commands;
        this.Type = Type;
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
