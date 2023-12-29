package org.example.View;

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
        System.out.println("Введите дату рождения животного (День-месяц-год): ");
        String date = scanner.nextLine();
        return date;
    }

    public String setType() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите тип животного: ");
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
            System.out.printf("Введите %s команду животного: ",i);
            String command = scanner.nextLine();
            if (command.equals("exit")) {
                return commands;
            } else {
                commands.add(command);
            }
        }
    }



    public void showTable(Object[][] tableData, String[] columnNames){
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

    public void showMenu(){
        System.out.println(ViewText.mainMenu);
    }

    public int selectMenuItem(){
        System.out.println(ViewText.selectMenuItem);
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return i;
    }

    public int selectAnimalId(int maxSize){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id питомца: ");
        int id = scanner.nextInt();
        while (true){
            if (id < 0 || id > maxSize){
                System.out.println("Введите правильный id питомца: ");
                id = scanner.nextInt();
            } else {
                return id;
            }
        }
    }
    public void successfulAddCommand(){
        System.out.println(ViewText.successfulAddCommand);
    }

    public void failedAddCommand(){
        System.out.println(ViewText.failedAddCommand);
    }

}
