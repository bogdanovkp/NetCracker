package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class VIew {
    private ControllerClass controller = new ControllerClass();
    private ModelClass inModelClass = new ModelClass();
    private ArrayList<Employee> employee = new ArrayList();

    protected void menu(){
        System.out.println("1: ПОИСК");
        System.out.println("2: ДОБАВЛЕНИЕ, ИЗМЕНЕНИЕ");
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
                    System.out.println("Неверный ввод!!! Повторите еще раз.");
                    VIew.this.menu();
                    break;
            }
        }
        catch (InputMismatchException e){
            System.out.println("Неверный ввод!!! Повторите еще раз.");
            VIew.this.menu();
        } catch (Exception e) {
            e.printStackTrace();
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
                    System.out.println("Неверный ввод!!! Повторите еще раз.");
                    VIew.this.searchOut();
                    break;
            }
        }
        catch (InputMismatchException e){
            System.out.println("Неверный ввод!!! Повторите еще раз.");
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
                    employee = controller.search(1, ModelClass.employeeMain());
                    for (int i = 0; i < employee.size(); i++) VIew.this.outEmployee(employee.get(i));
                } catch (MyException e){
                    VIew.this.errorIn();
                    VIew.this.searchOutMenu(1);
                } catch (Exception e){
                    VIew.this.outNotFound();
                }
                VIew.this.changeSearch(1);
                break;
            case 2:
                System.out.println("Введите название отдела или начальника:");
                try {
                    employee = controller.search(2,ModelClass.employeeMain());
                    for (int i = 0; i < employee.size(); i++) VIew.this.outEmployee(employee.get(i));
                }
                catch (MyException e){
                    VIew.this.errorIn();
                    VIew.this.searchOutMenu(2);
                }
                catch (Exception e){
                    VIew.this.outNotFound();
                }
                VIew.this.changeSearch(2);
                break;
            case 3:
                System.out.println("Введите телефон:");
                try {
                    employee = controller.search(3,ModelClass.employeeMain());
                    for (int i = 0; i < employee.size(); i++) VIew.this.outEmployee(employee.get(i));
                }
                catch (MyException e){
                    VIew.this.errorIn();
                    VIew.this.searchOutMenu(3);
                }
                catch (Exception e){
                    VIew.this.outNotFound();
                }
                VIew.this.changeSearch(3);
                break;
            case 4:
                System.out.println("Введите зарплату:");
                try {
                    employee = controller.search(4,ModelClass.employeeMain());
                    for (int i = 0; i < employee.size(); i++) VIew.this.outEmployee(employee.get(i));
                }
                catch (MyException e){
                    VIew.this.errorIn();

                    VIew.this.searchOutMenu(4);
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
                    VIew.this.changeCriteruim(searchCriterium);
                    break;
                case 2:
                    VIew.this.menu();
                    break;
                default:
                    System.out.println("Неверный ввод!!! Повторите еще раз.");
                    VIew.this.changeSearch(searchCriterium);
                    break;
            }
        }
        catch (InputMismatchException e){
            System.out.println("Неверный ввод!!! Повторите еще раз.");
            VIew.this.changeSearch(searchCriterium);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    protected void changeCriteruim (int changeSearchCriterium){
        try {
            System.out.println("Сменить критерий поиска: 1- ДА   2-НЕТ");
            Scanner in = new Scanner(System.in);
            int item = in.nextInt();
            switch (item){
                case 1:
                    VIew.this.searchOut();
                    break;
                case 2:
                    VIew.this.searchOutMenu(changeSearchCriterium);
                    break;
                default:
                    System.out.println("Неверный ввод!!! Повторите еще раз.");
                    VIew.this.changeCriteruim(changeSearchCriterium);
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод!!! Повторите еще раз.");
            VIew.this.changeCriteruim(changeSearchCriterium);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    protected void menuAdd()  {
        System.out.println("1: Добавить нового сотрудника.");
        System.out.println("2: Изменить данные сотрудника.");
        System.out.println("3: Назад.");
        try {
            Scanner in = new Scanner(System.in);
            int item = in.nextInt();
            switch (item){
                case 1:
                    VIew.this.addNewEmployee(1);
                    break;
                case 2:

                    break;
                case 3:
                    VIew.this.menu();
                    break;
                default:
                    System.out.println("Неверный ввод!!! Повторите еще раз.");
                    VIew.this.menuAdd();
                    break;
            }
        }
        catch (InputMismatchException e){
            System.out.println("Неверный ввод!!! Повторите еще раз.");
            VIew.this.menuAdd();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    protected void addNewEmployee(int item) throws MyException{
        try {
            switch (item){
                case 1:
                    System.out.println("Введите имя:");
                    controller.addEmployee(1);
                case 2:
                    System.out.println("Введите фамилию:");
                    controller.addEmployee(2);
                case 3:
                    System.out.println("Введите телефон:");
                    controller.addEmployee(3);
                case 4:
                    System.out.println("Введите зарплату:");
                    controller.addEmployee(4);
                case 5:
                    System.out.println("Введите название отдела:");
                    controller.addEmployee(5);
                case 6:
                    System.out.println("Введите имя начальника отдела:");
                    controller.addEmployee(6);
                case 7:
                    System.out.println("Введите фамилию начальника отдела:");
                    controller.addEmployee(7);
                    break;
            }
        }
        catch (MyException e){
            VIew.this.addNewEmployee(e.val());
        }

        VIew.this.menu();

    }

    public void outEmployee(Employee x){
        System.out.println(x.getFirstname() + "  " + x.getLastname() + "  " + x.getDept().getTitle() + "  " + x.getDept().getChief().getFirstName()
                + "  " + x.getDept().getChief().getLastName() + "  " + x.getPhone() + "  " + x.getSalary());

    }
    protected void outNotFound() {
        System.out.println("Не найдено!!!");
    }
    protected void errorIn(){
        System.out.println("Неверно введены данные!!!");
    }

}

