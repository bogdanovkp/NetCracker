package com.company;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public  class ModelClass{
    private  final String FILENAME = "employee.txt";

    protected ArrayList<Employee> employeeMain() throws IOException {
        ArrayList<Employee> employeeList = new ArrayList<>();
        Gson gson = new Gson();
        ArrayList<String> objReadFile = new ArrayList();
        objReadFile.addAll(readFile());
        for (int i=0;i < objReadFile.size();i++){
              employeeList.add(gson.fromJson(objReadFile.get(i), Employee.class));
        }
            return employeeList;
    }
      ArrayList readFile() throws IOException {
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
      void writeFile(String stroka) throws IOException {
          FileWriter fileWrite =  new FileWriter(FILENAME, true);
        try {
            fileWrite.write(stroka + "\r\n");
            fileWrite.flush();

       }catch (IOException e){
           System.out.println("Файл не найден!");
       }
          finally {
            fileWrite.close();
        }
    }
    void addEmployeeFile(Employee example) throws IOException {
        Gson gson = new Gson();
        String json = gson.toJson(example);
        writeFile(json);
    }
    void addEmployeeOnremove(ArrayList example) throws IOException {
        Gson gson = new Gson();
        String json;
        for (int element = 0; element < example.size(); element ++){
            json = gson.toJson(example.get(element));
            writeFileOnremove(json);
        }
    }
    void writeFileOnremove(String stroka) throws IOException{
        FileWriter fileWrite = new FileWriter(FILENAME,false);
        try {
            cleanFile();
            fileWrite.write(stroka + "\r\n");
            fileWrite.flush();

        }catch (IOException e){
            System.out.println("Файл не найден!");
        }finally {
            fileWrite.close();
        }
    }

    void cleanFile() throws IOException {
        FileWriter fileWrite = new FileWriter(FILENAME,false);
        try {
            fileWrite.write("");
            fileWrite.flush();
        }catch (IOException e){
            System.out.println("Файл не найден!");
        }finally {
            fileWrite.close();
        }

    }
}

