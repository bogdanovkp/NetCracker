package com.company;

import com.google.gson.Gson;
public class Main {

    public static void main(String[] args) {

        /*
        Gson gson = new Gson();
        ControllerClass fileMain = new ControllerClass();

       for (int i = 0; i < employeeList.size(); i++){
            String json = gson.toJson(employeeList.get(i));
            fileMain.writeFile(json);

        }*/

        VIew searchOutMain = new VIew();
        searchOutMain.menu();
        System.out.println();


    }

}
