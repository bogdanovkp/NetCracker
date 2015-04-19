package com.company;

import com.google.gson.Gson;
import java.util.Scanner;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        File file = new File("K:\\Student\\Java\\JavaIDE\\data.txt");

        Employee EmployeeMain = new Employee("John", "Macclane", "7-555-565-35", 35000, new Dept("47", "Otis Smith"));
        Employee EmployeeMain1 = new Employee("Koby","Bryant", "7-333-522-65", 53335, new Dept("1","Phil Dakxon"));


        Gson gson = new Gson();
        String json = gson.toJson(EmployeeMain);
        String json1 = gson.toJson(EmployeeMain1);


        Employee obj = gson.fromJson(json, Employee.class);

        Scanner in = new Scanner(System.in);
        String inMain = in.nextLine();
        if(inMain.equals(obj.getFirstname()) || inMain.equals(obj.getLastname())) {
            System.out.println(obj);
        }

        System.out.println("1: SEARCH");
        Scanner in = new Scanner(System.in);
        int itemMain = in.nextInt();
        System.out.println();

        VIew searchOutMain = new VIew();
        searchOutMain.searchOut();


    }
}
