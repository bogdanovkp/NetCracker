package com.company;
import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public  class ModelClass{
    protected static ArrayList<Employee> employeeMain() throws IOException {
        ArrayList<Employee> employeeList = new ArrayList<>();
        Gson gson = new Gson();
        ArrayList<String> objReadFile = new ArrayList();
        objReadFile.addAll(readFile());
        for (int i=0;i < objReadFile.size();i++){
              employeeList.add(gson.fromJson(objReadFile.get(i), Employee.class));
        }
            return employeeList;
    }

    protected static ArrayList readFile() throws IOException {
        Scanner in = null;
        ArrayList<String> data = new ArrayList<>();
        try {
            in = new Scanner(new File("employee.txt"));
            while (in.hasNext())
                data.add(in.nextLine());
        } catch (IOException ex) {
            System.out.println("Файл не найден!");
        } finally {
            in.close();
        }
        return data;
    }
}
