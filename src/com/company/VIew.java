package com.company;

import java.util.Scanner;

public class VIew {

    protected void menu(){

        System.out.println("1: SEARCH");
        System.out.println("2: CREATE");
    }

    protected void searchOut() {

        System.out.println("1: Search by name");
        System.out.println("2: Search by dept");
        System.out.println("3: Search by phone");
        System.out.println("4: Search by salary");

    }

    protected void searchOutMenu(int item){
        switch (item) {
            case 1:
                System.out.println("Vvedite name:");
                break;
            case 2:
                System.out.println("Vvedite dept:");
                break;
            case 3:
                System.out.println("Vvedite phone:");
                break;
            case 4:
                System.out.println("Vvedite salary:");
                break;
            default:
                System.out.println("Input error");
                break;
        }

    }
    public void outEmployee(Employee x){
        System.out.println(x.getFirstname() + "  " + x.getLastname() + "  " + x.getDept().getTitle() + "  " + x.getDept().getChief() + "  " + x.getPhone() + "  " + x.getSalary());

    }

}
