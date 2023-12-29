package org.example;


import org.example.Model.AnimalRegistry.AnimalRegistry;
import org.example.Model.Animals.Animals;
import org.example.Presenter.Presenter;
import org.example.View.View;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Animals> animals = new ArrayList<>();
        AnimalRegistry model = new AnimalRegistry(animals);
        View view = new View();
        Presenter presenter = new Presenter(view, model);

        presenter.start();
    }
}