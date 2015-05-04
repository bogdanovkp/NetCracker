package com.company;



import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Scanner;

import java.util.ArrayList;


public  class ModelClass{
    protected static ArrayList<Employee> employeeMain() throws IOException {
        ArrayList<Employee> employeeList = new ArrayList<>();
        Gson gson = new Gson();
        StringBuffer json = readFile();
        Employee e = gson.fromJson(String.valueOf(json),Employee.class);

       /*
        Employee EmployeeMain = new Employee("John", "Macclane", "7-555-565-35", 35000, new Dept("47", new Chief("Otis", "Smith")));
        Employee EmployeeMain1 = new Employee("John","Bryant", "7-333-522-65", 35000, new Dept("132",new Chief("Wein", "Bruce")));
        employeeList.add(EmployeeMain);
        employeeList.add(EmployeeMain1);

        String json = gson.toJson(employeeList);*/

        return employeeList;
    }

    protected static StringBuffer readFile() throws IOException {


        Scanner in = null;
        StringBuffer data = null;
        try {
            in = new Scanner(new File("K:\\Student\\Java\\GitHub\\employee.txt"));
            data = new StringBuffer();
            while (in.hasNext())
                data.append(in.nextLine()).append("\n");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            assert in != null;
            in.close();
        }

        return data;

    }
}
