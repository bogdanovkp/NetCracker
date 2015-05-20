package com.company;

public class Add {
    private  ControllerClass controller = new ControllerClass();
     void addNewFirstName() throws Exception {
        try {
            System.out.println("Введите имя:");
            controller.addFirstName("");
            addNewLastName();
        } catch (MyException e) {
            System.out.println(e.getMessage());
            addNewFirstName();
        }

    }
     void addNewLastName() throws Exception {
        try {
            System.out.println("Введите фамилию:");
            controller.addLastName("");
            addNewPhone();
        } catch (MyException e) {
            System.out.println(e.getMessage());
            addNewLastName();
        }

    }
     void addNewPhone() throws Exception {
        try {
            System.out.println("Введите телефон:");
            controller.addPhone("");
            addNewSalary();
        } catch (MyException e) {
            System.out.println(e.getMessage());
            addNewPhone();
        }

    }
     void addNewSalary() throws Exception {
        try {
            System.out.println("Введите зарплату:");
            controller.addSalary("");
            addNewTitle();
        } catch (MyException e) {
            System.out.println(e.getMessage());
            addNewSalary();
        }

    }
     void addNewTitle() throws Exception {
        try {
            System.out.println("Введите название отдела:");
            controller.addTitle("");
            addNewChiefFirstName();
        } catch (MyException e) {
            System.out.println(e.getMessage());
            addNewTitle();
        }

    }
     void addNewChiefFirstName() throws Exception {
        try {
            System.out.println("Введите имя начальника отдела:");
            controller.addChiefFirstName("");
            addNewChiefLastName();
        } catch (MyException e) {
            System.out.println(e.getMessage());
            addNewChiefFirstName();
        }

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
