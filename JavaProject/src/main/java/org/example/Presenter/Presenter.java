package org.example.Presenter;


import org.example.Model.AnimalRegistry.AnimalRegistry;
import org.example.Model.Animals.Animals;
import org.example.Model.Animals.AnimalsType;
import org.example.Model.Builder.AnimalBuilder;
import org.example.View.View;

import java.util.List;

public class Presenter {
    private View view;
    private AnimalRegistry model;
    private AnimalBuilder builderAnimal = new AnimalBuilder();


    public Presenter(View view, AnimalRegistry model) {
        this.view = view;
        this.model = model;
    }

    public void addAnimal() {
        String name = view.setName();
        String date = view.setBirthDate();
        List<String> commands = view.setCommands();
        String type = view.setType();
        if (type == "Dog"){
            model.addAnimal(builderAnimal.setName(name).setBirthDate(date).setCommands(commands).setType(AnimalsType.Dog).build());
        }
        else if (type == "Cat"){
            model.addAnimal(builderAnimal.setName(name).setBirthDate(date).setCommands(commands).setType(AnimalsType.Cat).build());
        }
        else if (type == "Hamster"){
            model.addAnimal(builderAnimal.setName(name).setBirthDate(date).setCommands(commands).setType(AnimalsType.Hamster).build());
        }
        else if (type == "Horse"){
            model.addAnimal(builderAnimal.setName(name).setBirthDate(date).setCommands(commands).setType(AnimalsType.Horse).build());
        }
        else if (type == "Camel"){
            model.addAnimal(builderAnimal.setName(name).setBirthDate(date).setCommands(commands).setType(AnimalsType.Camel).build());
        }
        else if (type == "Donkey"){
            model.addAnimal(builderAnimal.setName(name).setBirthDate(date).setCommands(commands).setType(AnimalsType.Donkey).build());
        }
    }

    public void createTable(){
        String[] columnNames = {"id","Name","BirthDate","Type","Commands"};
        List<Animals> data = model.getAnimals();

        Object[][] tableData = new Object[data.size()][5];
        for (int i =0;i<data.size();i++){
            Animals animal = data.get(i);
            tableData[i][0] = data.indexOf(animal);
            tableData[i][1] = animal.getName();
            tableData[i][2] = animal.getBirthDate();
            tableData[i][3] = animal.getType();
            tableData[i][4] = animal.getCommands();
        }


        view.showTable(tableData, columnNames);
    }

    public void start(){
        while(true){
            view.showMenu();
            int menuItem = view.selectMenuItem();
            switch (menuItem){
                case 1:
                    addAnimal();
                    break;
                case 2:
                    createTable();
                    addCommand();
                    break;
                case 3:
                    createTable();
                    break;
                case 4:
                    //toJson();
                    break;
                default:
                    break;
            }
        }
    }

    public void addCommand(){
        int indexAnimal = view.selectAnimalId(model.getAnimals().size());
        List<String> command = view.setCommands();
        if (model.getAnimals().get(indexAnimal).getCommands().addAll(command)){
            view.successfulAddCommand();
        }
        else {
            view.failedAddCommand();
        }

    }


}
