package com.company;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public  class ModelClass{
    private static final String FILENAME = "employee.txt";

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
            in = new Scanner(new File(FILENAME));
            while (in.hasNext())
                data.add(in.nextLine());
        } catch (IOException ex) {
            System.out.println("Файл не найден!");
        } finally {
            if (in == null) throw new AssertionError();
            in.close();
        }
        return data;
    }

    protected static void writeFile(String stroka) throws IOException {
       try {
           FileWriter fileWrite = new FileWriter(FILENAME, true);
           fileWrite.write(stroka + "\n");
           fileWrite.close();
       }catch (IOException e){
           System.out.println("Файл не найден!");
       }
        ModelClass.readFile();
    }

    protected static void addEmployeeFile(Employee example) throws IOException {
        Gson gson = new Gson();
        String json = gson.toJson(example);
        ModelClass.writeFile(json);
    }
}

