package com.shahian;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.shahian.POJOGenerator.generatePOJO;

public class Main {

    public static void main(String[] args) {
//        String className = "Person";
//        List<String> fieldNames = Arrays.asList("firstName", "lastName", "age");
//        List<String> fieldTypes = Arrays.asList("String", "String", "int");
//        String pojo = generatePOJO(className, fieldNames, fieldTypes);
//        System.out.println(pojo);
        Scanner scanner = new Scanner(System.in);

        // Read class name
        System.out.print("Enter class name: ");
        String className = scanner.nextLine();

        // Read number of fields
        System.out.print("Enter number of fields: ");
        int numFields = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        // Read field names and types
        List<String> fieldNames = new ArrayList<>();
        List<String> fieldTypes = new ArrayList<>();
        for (int i = 1; i <= numFields; i++) {
            System.out.println("Enter details for field #" + i + ":");
            System.out.print("Name: ");
            fieldNames.add(scanner.nextLine());
            System.out.print("Type: ");
            fieldTypes.add(scanner.nextLine());
        }

        // Generate POJO class and print it
        String pojo = generatePOJO(className, fieldNames, fieldTypes);
        System.out.println(pojo);
    }
}
