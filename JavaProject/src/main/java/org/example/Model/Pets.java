package org.example.Model;


import java.util.List;

public class Pets extends Animals{
    private PetsType Type;

    public Pets(String Name, String BirthDate, List<String> Commands, PetsType Type) {
        super(Name, BirthDate, Commands);
        this.Type = Type;
    }

}
