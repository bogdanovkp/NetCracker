package com.company;

public class Add {
    private  ControllerClass controller = new ControllerClass();
     void addNewFirstName() throws Exception {
        try {
            System.out.println("Введите имя:");
            controller.addFirstName("");
        } catch (MyException e) {
            System.out.println(e.getMessage());
            addNewFirstName();
        }
        addNewLastName();
    }
     void addNewLastName() throws Exception {
        try {
            System.out.println("Введите фамилию:");
            controller.addLastName("");
        } catch (MyException e) {
            System.out.println(e.getMessage());
            addNewLastName();
        }
        addNewPhone();
    }
     void addNewPhone() throws Exception {
        try {
            System.out.println("Введите телефон:");
            controller.addPhone("");
        } catch (MyException e) {
            System.out.println(e.getMessage());
            addNewPhone();
        }
        addNewSalary();
    }
     void addNewSalary() throws Exception {
        try {
            System.out.println("Введите зарплату:");
            controller.addSalary("");
        } catch (MyException e) {
            System.out.println(e.getMessage());
            addNewSalary();
        }
        addNewTitle();
    }
     void addNewTitle() throws Exception {
        try {
            System.out.println("Введите название отдела:");
            controller.addTitle("");
        } catch (MyException e) {
            System.out.println(e.getMessage());
            addNewTitle();
        }
        addNewChiefFirstName();
    }
     void addNewChiefFirstName() throws Exception {
        try {
            System.out.println("Введите имя начальника отдела:");
            controller.addChiefFirstName("");
        } catch (MyException e) {
            System.out.println(e.getMessage());
            addNewChiefFirstName();
        }
        addNewChiefLastName();
    }
     void addNewChiefLastName() throws Exception {
        try {
            System.out.println("Введите фамилию начальника отдела:");
            controller.addChiefLastName("");
        } catch (MyException e) {
            System.out.println(e.getMessage());
            addNewChiefLastName();
        }
         controller.addEmployee();
    }
}
