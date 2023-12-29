package org.example.View;

import org.example.Model.Animals.Animals;
import org.example.Model.Animals.AnimalsType;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    public String setName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя животного: ");
        String name = scanner.nextLine();
        return name;
    }

    public String setBirthDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату рождения животного (День/месяц/год): ");
        String date = scanner.nextLine();
        while (true) {
            if (isValidFormat("dd/MM/yyyy", date)) {
                return date;
            } else {
                System.out.println("Введите дату рождения животного в првильном формате (День/месяц/год): ");
                date = scanner.nextLine();
            }
        }
    }

    public String setType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Доступны на данный момент типы животных: ");
        for (AnimalsType animalsType : AnimalsType.values()) {
            System.out.print(animalsType + " ");
        }
        System.out.println();
        System.out.println("Введите тип животного: ");
        while (true) {
            String typeAnimal = scanner.nextLine();
            for (ViewText.AnimalType type : ViewText.AnimalType.values()) {
                if (type.name().equals(typeAnimal)) {
                    return String.valueOf(type);
                }
            }
            System.out.println("Введите правильный тип животного: ");
        }
    }

    public List<String> setCommands() {
        Scanner scanner = new Scanner(System.in);
        List<String> commands = new ArrayList<>();
        while (true) {
            int i = commands.size();
            System.out.printf("Введите %s команду животного или exit (для завершения ввода): ", i);
            String command = scanner.nextLine();
            if (command.toLowerCase().equals("exit")) {
                return commands;
            } else {
                commands.add(command);
            }
        }
    }


    public void showTable(Object[][] tableData, String[] columnNames) {
        System.out.println("=".repeat(50));
        int[] maxLengths = new int[columnNames.length];
        for (int i = 0; i < columnNames.length; i++) {
            maxLengths[i] = columnNames[i].length();
        }

        for (int i = 0; i < tableData.length; i++) {
            for (int j = 0; j < tableData[i].length; j++) {
                int length = tableData[i][j].toString().length();
                if (length > maxLengths[j]) {
                    maxLengths[j] = length;
                }
            }
        }

        for (int i = 0; i < columnNames.length; i++) {
            System.out.printf("%-" + (maxLengths[i] + 2) + "s", columnNames[i]);
        }
        System.out.println();

        for (int i = 0; i < tableData.length; i++) {
            for (int j = 0; j < tableData[i].length; j++) {
                System.out.printf("%-" + (maxLengths[j] + 2) + "s", tableData[i][j]);
            }
            System.out.println();
        }
        System.out.println("=".repeat(50));
    }

    public void showMenu() {
        System.out.println(ViewText.mainMenu);
    }

    public int selectMenuItem() {
        System.out.println(ViewText.selectMenuItem);
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        while (true) {
            if (i < 1 || i > 6) {
                System.out.println("Введите правильный номер меню (1-6): ");
                i = scanner.nextInt();
            } else {
                return i;
            }
        }
    }

    public int selectAnimalId(int maxSize) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id питомца: ");
        int id = scanner.nextInt();
        while (true) {
            if (id < 0 || id > maxSize) {
                System.out.println("Введите правильный id питомца: ");
                id = scanner.nextInt();
            } else {
                return id;
            }
        }
    }

    public void successfulAddCommand() {
        System.out.println(ViewText.successfulAddCommand);
    }

    public void failedAddCommand() {
        System.out.println(ViewText.failedAddCommand);
    }

    public void toJsonSave() {
        System.out.println("=".repeat(50));
        System.out.println(ViewText.toJsonSave);
        System.out.println("=".repeat(50));
    }

    public void fromJsonFile() {
        System.out.println("=".repeat(50));
        System.out.println(ViewText.fromJsonFile);
        System.out.println("=".repeat(50));
    }

    public boolean isValidFormat(String formatDate, String value) {
        SimpleDateFormat sdf = new SimpleDateFormat(formatDate);
        sdf.setLenient(false);
        try {
            sdf.parse(value);

        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
