package org.example.Model.AnimalRegistry;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.example.Model.Animals.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class AnimalRegistry {
    private List<Animals> animals;

    Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();


    public AnimalRegistry(List<Animals> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animals animal) {
        animals.add(animal);
    }

    public List<Animals> getAnimals() {
        return animals;
    }

    public Animals getAnimal(int index) {
        return animals.get(index);
    }

    public String toJsonStr(List<Animals> animals) {
        String jsonStr = "";
        if (animals.size() == 1) {
            jsonStr += gson.toJson(animals.get(0));
            return jsonStr;
        } else {
            jsonStr = "[";
            for (Animals animal : animals) {
                if (animals.indexOf(animal) != animals.size() - 1) {
                    jsonStr += gson.toJson(animal);
                    jsonStr += ",";
                } else {
                    jsonStr += gson.toJson(animal);
                    jsonStr += "]";
                }
            }
            return jsonStr;
        }
    }

    public void writeToJsonFile(String jsonStr) {
        try (FileWriter file = new FileWriter("src/main/java/org/example/Registry.json", false)) {
            file.write(jsonStr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readFromJsonFile() throws FileNotFoundException {
        try {
            String filePath = "src/main/java/org/example/Registry.json";
            String jsonStr = new String(Files.readAllBytes(Paths.get(filePath)));
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Animals> ToList(String jsonStr) {

        JsonReader reader = new JsonReader(new StringReader(jsonStr));
        reader.setLenient(true);
        List<Animals> animals = gson.fromJson(reader, new TypeToken<List<Animals>>() {
        }.getType());
        return animals;
    }


}
