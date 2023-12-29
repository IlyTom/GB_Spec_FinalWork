package org.example.Model.Animals;

import com.google.gson.annotations.Expose;

import java.util.List;

public class Animals {
    @Expose
    private String name;
    @Expose
    private String BirthDate;

    @Expose
    private List<String> Commands;
    @Expose
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
