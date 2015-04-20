package com.company;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{

        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        Employee EmployeeMain = new Employee("John", "Macclane", "7-555-565-35", 35000, new Dept("47", "Otis Smith"));
        Employee EmployeeMain1 = new Employee("John","Bryant", "7-333-522-65", 53335, new Dept("1","Phil Dakxon"));

        employeeList.add(EmployeeMain);
        employeeList.add(EmployeeMain1);
        Gson gson = new Gson();
        ModelClass fileMain = new ModelClass();

       /* for (int i = 0; i < employeeList.size(); i++){
            String json = gson.toJson(employeeList.get(i));
            fileMain.writeFile(json);

        }*/

        VIew searchOutMain = new VIew();

        System.out.println("1: SEARCH");
        Scanner in = new Scanner(System.in);
        int itemMain = in.nextInt();
        System.out.println();

        int item = searchOutMain.searchOut();
        fileMain.search(item, employeeList);


    }
}
