package com.company;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{


        Employee EmployeeMain = new Employee("John", "Macclane", "7-555-565-35", 35000, new Dept("47", "Otis Smith"));
        Employee EmployeeMain1 = new Employee("Koby","Bryant", "7-333-522-65", 53335, new Dept("1","Phil Dakxon"));


        Gson gson = new Gson();
        String json = gson.toJson(EmployeeMain);
        String json1 = gson.toJson(EmployeeMain1);

        ModelClass fileMain = new ModelClass();
        fileMain.writeFile(json);

        String proverka = fileMain.readFile();


        Employee obj = gson.fromJson(proverka, Employee.class);
/*
        Scanner in = new Scanner(System.in);
        String inMain = in.nextLine();
        if(inMain.equals(obj.getFirstname()) || inMain.equals(obj.getLastname())) {
            System.out.println(obj);
        }
*/
        System.out.println("1: SEARCH");
        Scanner in = new Scanner(System.in);
        int itemMain = in.nextInt();
        System.out.println();

        VIew searchOutMain = new VIew();
        int item = searchOutMain.searchOut();
        fileMain.search(item, obj);


    }
}
