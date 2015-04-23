package com.company;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        Employee EmployeeMain = new Employee("John", "Macclane", "7-555-565-35", 35000, new Dept("47", "Otis Smith"));
        Employee EmployeeMain1 = new Employee("John","Bryant", "7-333-522-65", 53335, new Dept("132","Phil Dakxon"));

        employeeList.add(EmployeeMain);
        employeeList.add(EmployeeMain1);
        Gson gson = new Gson();
        ModelClass fileMain = new ModelClass();

       /* for (int i = 0; i < employeeList.size(); i++){
            String json = gson.toJson(employeeList.get(i));
            fileMain.writeFile(json);

        }*/

        VIew searchOutMain = new VIew();
        int itemMain;
        do{
        searchOutMain.menu();//основное меню
        System.out.println();
        Scanner in = new Scanner(System.in);//сканируем выбор меню
        itemMain = in.nextInt();}
        while (!(itemMain == 1 || itemMain == 2));





            int item;
            if(itemMain == 1) {
                do {
                    searchOutMain.searchOut();
                    System.out.println();
                    Scanner in1 = new Scanner(System.in);
                    item = in1.nextInt();
                }
                while(!(item == 1 || item == 2 || item == 3 || item == 4));
                searchOutMain.searchOutMenu(item);
                fileMain.search(item, employeeList);
            }
            if (itemMain == 2){
                do {
                    searchOutMain.menuAdd();
                    System.out.println();
                    Scanner in1 = new Scanner(System.in);
                    item = in1.nextInt();
                }
                while(!(item == 1 || item == 2));
                if (item == 1){
                    fileMain.addEmployee(employeeList);
                    System.out.println("111");




                }



            }


    }
}
