package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChangeClass {
    private ControllerClass controllerClass = new ControllerClass();
    private ModelClass model = new ModelClass();
    void changeFirstName(int index) throws Exception {
        try {
            System.out.println("Имя:");
            System.out.println(model.employeeMain().get(index).getFirstname());
            System.out.println("1 - Изменить 2 - Не изменять");
            Scanner in = new Scanner(System.in);
            int temp = in.nextInt();
            switch (temp){
                case 1:
                    System.out.println("Введите имя:");
                    controllerClass.addFirstName("");
                    break;
                case 2:
                    controllerClass.addFirstName(model.employeeMain().get(index).getFirstname());
                    break;
                default:
                    System.out.println("Неверный ввод!!! Повторите еще раз.");
                    changeFirstName(index);
            }
            changeLastName(index);

        }catch (InputMismatchException e){
            System.out.println("Неверный ввод!!! Повторите еще раз.");
            changeFirstName(index);
        }catch (MyException e){
            System.out.println(e.getMessage());
            changeFirstName(index);
        }

    }
    void changeLastName(int index) throws Exception {
        try {
            System.out.println("Фамилия:");
            System.out.println(model.employeeMain().get(index).getLastname());
            System.out.println("1 - Изменить 2 - Не изменять");
            Scanner in = new Scanner(System.in);
            int temp = in.nextInt();
            switch (temp){
                case 1:
                    System.out.println("Введите Фамилию:");
                    controllerClass.addLastName("");
                    break;
                case 2:
                    controllerClass.addLastName(model.employeeMain().get(index).getFirstname());
                    break;
                default:
                    System.out.println("Неверный ввод!!! Повторите еще раз.");
                    changeLastName(index);
            }
            changePhone(index);

        }catch (InputMismatchException e){
            System.out.println("Неверный ввод!!! Повторите еще раз.");
            changeLastName(index);
        }catch (MyException e){
            System.out.println(e.getMessage());
            changeLastName(index);
        }

    }
    void changePhone(int index) throws Exception {
        try {
            System.out.println("Телефон:");
            System.out.println(model.employeeMain().get(index).getPhone());
            System.out.println("1 - Изменить 2 - Не изменять");
            Scanner in = new Scanner(System.in);
            int temp = in.nextInt();
            switch (temp){
                case 1:
                    System.out.println("Введите телефон:");
                    controllerClass.addPhone("");
                    break;
                case 2:
                    controllerClass.addPhone(model.employeeMain().get(index).getPhone());
                    break;
                default:
                    System.out.println("Неверный ввод!!! Повторите еще раз.");
                    changePhone(index);
            }
            changeSalary(index);

        }catch (InputMismatchException e){
            System.out.println("Неверный ввод!!! Повторите еще раз.");
            changePhone(index);
        }catch (MyException e){
            System.out.println(e.getMessage());
            changePhone(index);
        }

    }
    void changeSalary(int index) throws Exception {
        try {
            System.out.println("Зарплата:");
            System.out.println(model.employeeMain().get(index).getSalary());
            System.out.println("1 - Изменить 2 - Не изменять");
            Scanner in = new Scanner(System.in);
            int temp = in.nextInt();
            switch (temp){
                case 1:
                    System.out.println("Введите зарплату:");
                    controllerClass.addSalary("");
                    break;
                case 2:
                    controllerClass.addSalary(String.valueOf(model.employeeMain().get(index).getSalary()));
                    break;
                default:
                    System.out.println("Неверный ввод!!! Повторите еще раз.");
                    changeSalary(index);
            }
            changeTitle(index);

        }catch (InputMismatchException e){
            System.out.println("Неверный ввод!!! Повторите еще раз.");
            changeSalary(index);
        }catch (MyException e){
            System.out.println(e.getMessage());
            changeSalary(index);
        }

    }
    void changeTitle(int index) throws Exception {
        try {
            System.out.println("Название отдела:");
            System.out.println(model.employeeMain().get(index).getDept().getTitle());
            System.out.println("1 - Изменить 2 - Не изменять");
            Scanner in = new Scanner(System.in);
            int temp = in.nextInt();
            switch (temp){
                case 1:
                    System.out.println("Введите название отдела:");
                    controllerClass.addTitle("");
                    break;
                case 2:
                    controllerClass.addTitle(model.employeeMain().get(index).getDept().getTitle());
                    break;
                default:
                    System.out.println("Неверный ввод!!! Повторите еще раз.");
                    changeTitle(index);
            }
            changeChiefFirstName(index);

        }catch (InputMismatchException e){
            System.out.println("Неверный ввод!!! Повторите еще раз.");
            changeTitle(index);
        }catch (MyException e){
            System.out.println(e.getMessage());
            changeTitle(index);
        }

    }
    void changeChiefFirstName(int index) throws Exception {
        try {
            System.out.println("Имя начальника отдела:");
            System.out.println(model.employeeMain().get(index).getDept().getChief().getFirstName());
            System.out.println("1 - Изменить 2 - Не изменять");
            Scanner in = new Scanner(System.in);
            int temp = in.nextInt();
            switch (temp){
                case 1:
                    System.out.println("Введите имя начальника отдела:");
                    controllerClass.addChiefFirstName("");
                    break;
                case 2:
                    controllerClass.addChiefFirstName(model.employeeMain().get(index).getDept().getChief().getFirstName());
                    break;
                default:
                    System.out.println("Неверный ввод!!! Повторите еще раз.");
                    changeChiefFirstName(index);
            }
            changeChiefLastName(index);

        }catch (InputMismatchException e){
            System.out.println("Неверный ввод!!! Повторите еще раз.");
            changeChiefFirstName(index);
        }catch (MyException e){
            System.out.println(e.getMessage());
            changeChiefFirstName(index);
        }

    }
    void changeChiefLastName(int index) throws Exception {
        try {
            System.out.println("Фамилия начальника отдела:");
            System.out.println(model.employeeMain().get(index).getDept().getChief().getLastName());
            System.out.println("1 - Изменить 2 - Не изменять");
            Scanner in = new Scanner(System.in);
            int temp = in.nextInt();
            switch (temp){
                case 1:
                    System.out.println("Введите фамилию начальника отдела:");
                    controllerClass.addChiefLastName("");
                    break;
                case 2:
                    controllerClass.addChiefLastName(model.employeeMain().get(index).getDept().getChief().getLastName());
                    break;
                default:
                    System.out.println("Неверный ввод!!! Повторите еще раз.");
                    changeChiefLastName(index);
            }

        }catch (InputMismatchException e){
            System.out.println("Неверный ввод!!! Повторите еще раз.");
            changeChiefLastName(index);
        }catch (MyException e){
            System.out.println(e.getMessage());
            changeChiefLastName(index);
        }
        controllerClass.addEmployee();
    }
}
