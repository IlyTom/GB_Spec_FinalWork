package org.example.Model.AnimalRegistry;

import org.example.Model.Animals.*;

import java.util.List;

public class AnimalRegistry {
    private List<Animals> animals;


    public AnimalRegistry(List<Animals> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animals animal){
        animals.add(animal);
    }

    public List<Animals> getAnimals() {
        return animals;
    }


}
