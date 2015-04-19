package com.company;

import java.util.Scanner;

public class VIew {


    protected void searchOut(){
        System.out.println("1: Search by name");
        System.out.println("2: Search by dept");
        System.out.println("3: Search by phone");
        System.out.println("4: Search by salary");

        Scanner in = new Scanner(System.in);
        int item = in.nextInt();

        switch (item){
            case 1: System.out.println("Vvedite name:");break;
            case 2: System.out.println("Vvedite dept:");break;
            case 3: System.out.println("Vvedite phone:");break;
            case 4: System.out.println("Vvedite salary:");break;
            default:
        }

        ModelClass searchView = new ModelClass();
        searchView.search(item);
    }

}
