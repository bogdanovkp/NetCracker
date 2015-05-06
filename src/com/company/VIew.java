package com.company;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class VIew {
    private ControllerClass controller = new ControllerClass();
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

    void searchMethod(int item) throws Exception {
        try {
            employee = controller.search(item, ModelClass.employeeMain());
            for (int i = 0; i < employee.size(); i++) VIew.this.outEmployee(employee.get(i));
        } catch (MyException e){
            VIew.this.errorIn();
            VIew.this.searchOutMenu(item);
        } catch (Exception e){
            VIew.this.outNotFound();
        }
        VIew.this.changeSearch(item);
    }

    protected void searchOutMenu(int item) throws Exception {
        switch (item) {
            case 1:
                System.out.println("Введите имя или фамилию:");
                VIew.this.searchMethod(1);
                break;
            case 2:
                System.out.println("Введите название отдела или начальника:");
                VIew.this.searchMethod(2);
                break;
            case 3:
                System.out.println("Введите телефон:");
                VIew.this.searchMethod(3);
                break;
            case 4:
                System.out.println("Введите зарплату:");
                VIew.this.searchMethod(4);
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
                    VIew.this.changeCriteria(searchCriterium);
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
    protected void changeCriteria(int changeSearchCriterium){
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
                    VIew.this.changeCriteria(changeSearchCriterium);
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод!!! Повторите еще раз.");
            VIew.this.changeCriteria(changeSearchCriterium);
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
                    controller.addFirstName();
                case 2:
                    System.out.println("Введите фамилию:");
                    controller.addLastName();
                case 3:
                    System.out.println("Введите телефон:");
                    controller.addPhone();
                case 4:
                    System.out.println("Введите зарплату:");
                    controller.addSalary();
                case 5:
                    System.out.println("Введите название отдела:");
                    controller.addTitle();
                case 6:
                    System.out.println("Введите имя начальника отдела:");
                    controller.addChiefFirstName();
                case 7:
                    System.out.println("Введите фамилию начальника отдела:");
                    controller.addChiefLastName();
                case 8:
                    controller.addEmployee();
                    break;
            }
        }
        catch (MyException e){
            VIew.this.addNewEmployee(e.val());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Запись прошла успешно!!!");
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

