package com.company;


import java.io.IOException;

public class Add {
    static void addNewFirstName() throws MyException, IOException {
        try {
            System.out.println("Введите имя:");
            ControllerClass.addFirstName();
        } catch (MyException e) {
            e.getMessage();
            addNewFirstName();
        }
        addNewLastName();
    }
    static void addNewLastName() throws MyException, IOException {
        try {
            System.out.println("Введите фамилию:");
            ControllerClass.addLastName();
        } catch (MyException e) {
            e.getMessage();
            addNewLastName();
        }
        addNewPhone();
    }
    static void addNewPhone() throws MyException, IOException {
        try {
            System.out.println("Введите телефон:");
            ControllerClass.addPhone();
        } catch (MyException e) {
            e.getMessage();
            addNewPhone();
        }
        addNewSalary();
    }
    static void addNewSalary() throws MyException, IOException {
        try {
            System.out.println("Введите зарплату:");
            ControllerClass.addSalary();
        } catch (MyException e) {
            e.getMessage();
            addNewSalary();
        }
        addNewTitle();
    }
    static void addNewTitle() throws MyException, IOException {
        try {
            System.out.println("Введите название отдела:");
            ControllerClass.addTitle();
        } catch (MyException e) {
            e.getMessage();
            addNewTitle();
        }
        addNewChiefFirstName();
    }
    static void addNewChiefFirstName() throws MyException, IOException {
        try {
            System.out.println("Введите имя начальника отдела:");
            ControllerClass.addChiefFirstName();
        } catch (MyException e) {
            e.getMessage();
            addNewChiefFirstName();
        }
        addNewChiefLastName();
    }
    static void addNewChiefLastName() throws MyException, IOException {
        try {
            System.out.println("Введите фамилию начальника отдела:");
            ControllerClass.addChiefLastName();
        } catch (MyException e) {
            e.getMessage();
            addNewChiefLastName();
        }
        ControllerClass.addEmployee();
    }
}
