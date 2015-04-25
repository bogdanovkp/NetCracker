package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VIew {


    ControllerClass controller = new ControllerClass();
    ArrayList<Employee> employee = new ArrayList();

    protected void menu(){
        System.out.println("1: ПОИСК");
        System.out.println("2: ДОБАВЛЕНИЕ");
        System.out.println("3: ВЫХОД!!!");
        try {
            Scanner in = new Scanner(System.in);
            int item = in.nextInt();
            switch (item){
                case 1:
                    VIew.this.searchOut();
                    break;
                case 2:
                    VIew.this.menuAdd();
                    break;
                case 3: System.exit(0);

                default:
                    VIew.this.menu();
                    break;
            }
        }
        catch (InputMismatchException e){
            VIew.this.menu();
        }
    }
    protected void searchOut() {
        System.out.println("1: Поиск по имени");
        System.out.println("2: Поиск по отделу");
        System.out.println("3: Поиск по телефону");
        System.out.println("4: Поиск по зарплате");
        System.out.println("5: Назад");
        try {
            Scanner in = new Scanner(System.in);
            int item = in.nextInt();
            switch (item){
                case 1:
                    VIew.this.searchOutMenu(1);
                    break;
                case 2:
                    VIew.this.searchOutMenu(2);
                    break;
                case 3:
                    VIew.this.searchOutMenu(3);
                    break;
                case 4:
                    VIew.this.searchOutMenu(4);
                    break;
                case 5:
                    VIew.this.menu();
                    break;
                default:
                    VIew.this.searchOut();
            }
        }
        catch (InputMismatchException e){
            VIew.this.searchOut();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    protected void searchOutMenu(int item) throws Exception {
            switch (item) {
                case 1:
                    System.out.println("Введите имя или фамилию:");
                    try {
                    employee = controller.search(1,controller.employeeMain());
                    for (int i = 0; i < employee.size(); i++) VIew.this.outEmployee(employee.get(i));

                    }
                    catch (Exception e){
                        VIew.this.outNotFound();
                    }

                    VIew.this.changeSearch(1);
                    break;

                case 2:
                    System.out.println("Введите название отдела или начальника:");
                    try {
                        employee = controller.search(2,controller.employeeMain());
                        for (int i = 0; i < employee.size(); i++) VIew.this.outEmployee(employee.get(i));

                    }
                    catch (Exception e){
                        VIew.this.outNotFound();
                    }

                    VIew.this.changeSearch(2);
                    break;
                case 3:
                    System.out.println("Введите телефон:");
                    try {
                        employee = controller.search(3,controller.employeeMain());
                        for (int i = 0; i < employee.size(); i++) VIew.this.outEmployee(employee.get(i));

                    }
                    catch (Exception e){
                        VIew.this.outNotFound();
                    }

                    VIew.this.changeSearch(3);
                    break;
                case 4:
                    System.out.println("Введите зарплату:");
                    try {
                        employee = controller.search(4,controller.employeeMain());
                        for (int i = 0; i < employee.size(); i++) VIew.this.outEmployee(employee.get(i));

                    }
                    catch (Exception e){
                        VIew.this.outNotFound();
                    }

                    VIew.this.changeSearch(4);
                    break;
            }
    }
    protected void changeSearch( int searchCriterium){
        try{
            System.out.println("Продолжить поиск: 1 - ДА   2 - НЕТ");
            Scanner in = new Scanner(System.in);
            int item = in.nextInt();
            switch (item){
                case 1:
                    System.out.println("Сменить критерий поиска: 1 - ДА   2 - НЕТ");
                    int criterium = in.nextInt();
                    if (criterium == 1) {
                        VIew.this.searchOut();
                    }
                    else{
                        VIew.this.searchOutMenu(searchCriterium);
                    }

                case 2: VIew.this.menu();break;
                default: VIew.this.changeSearch(searchCriterium);
            }

        }
        catch (InputMismatchException e){
            VIew.this.changeSearch(searchCriterium);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    protected void menuAdd(){
        System.out.println("1: add a new Employee.");
        System.out.println("2: change Employee data.");
    }

    protected void addEmployeeFirstName() {
        System.out.println("1: Ent.");
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





    public void outEmployee(Employee x){
        System.out.println(x.getFirstname() + "  " + x.getLastname() + "  " + x.getDept().getTitle() + "  " + x.getDept().getChief().getFirstName()
                + "  " + x.getDept().getChief().getLastName() + "  " + x.getPhone() + "  " + x.getSalary());

    }
    protected void outNotFound() {
        System.out.println("Не найдено!!!");
    }

}

