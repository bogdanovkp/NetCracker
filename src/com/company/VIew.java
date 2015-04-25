package com.company;

import java.util.Scanner;

public class VIew {

    protected void menu(){

        System.out.println("1: SEARCH");//поиск
        System.out.println("2: ADDITION AND CHANGE");//добавление
    }

    protected void menuAdd(){
        System.out.println("1: add a new Employee.");
        System.out.println("2: change Employee data.");
    }

    protected void addEmployeeFirstName() {
        System.out.println("1: Enter your name.");
    }
    protected void addEmployeeLastName(){
        System.out.println("2: Enter your Familiu.");}
    protected void addEmployeeTitleDept() {
        System.out.println("3: Enter title Dept.");}
    protected void addEmployeeChiefDept(){
        System.out.println("4: Enter chief Dept.");}
    protected void addEmployeePhone(){
        System.out.println("5: Enter your phone.");}
    protected void addEmployeeSalary(){
        System.out.println("6: Enter your salary.");}


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
    protected void outNotFound() {
        System.out.println("Not Found!!!");
    }

}

