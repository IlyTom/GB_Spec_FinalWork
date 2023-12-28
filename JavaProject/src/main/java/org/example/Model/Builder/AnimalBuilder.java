package org.example.Model.Builder;

import org.example.Model.Animals.*;

import java.util.List;

public class AnimalBuilder {
    private String name;
    private String BirthDate;
    private List<String> Commands;
    private AnimalsType Type;

    public AnimalBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public AnimalBuilder setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
        return this;
    }

    public AnimalBuilder setCommands(List<String> Commands) {
        this.Commands = Commands;
        return this;
    }

    public AnimalBuilder setType(AnimalsType Type) {
        this.Type = Type;
        return this;
    }

    public Animals build() {
        if (Type == AnimalsType.Dog) {
            return new Dog(name, BirthDate, Commands);
        }
        else if (Type == AnimalsType.Cat){
            return new Cat(name, BirthDate, Commands);
        }
        else if (Type == AnimalsType.Hamster){
            return new Hamster(name, BirthDate, Commands);
        }
        else if (Type == AnimalsType.Horse){
            return new Horse(name, BirthDate, Commands);
        }
        else if (Type == AnimalsType.Camel){
            return new Camel(name, BirthDate, Commands);
        }
        else if (Type == AnimalsType.Donkey){
            return new Donkey(name, BirthDate, Commands);
        }
        return null;
    }
}
