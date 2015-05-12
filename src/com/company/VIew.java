package com.company;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class VIew {
    private ControllerClass controller = new ControllerClass();
    private ArrayList<Employee> employee = new ArrayList();

     void menu() throws Exception {
        System.out.println("1: ПОИСК");
         System.out.println("2: ДОБАВЛЕНИЕ");
         System.out.println("3: ИЗМЕНЕНИЕ");
        System.out.println("4: УДАЛЕНИЕ ПО ФИО");
        System.out.println("5: ВЫХОД!!!");
        try {
            Scanner in = new Scanner(System.in);
            int item = in.nextInt();
            switch (item){
                case 1:
                    searchOut();
                    break;
                case 2:
                    menuAdd();
                    break;
                case 3:
                    searchOutMenu(1);
                    break;
                case 4:
                    searchOutMenu(1);
                    break;
                case 5: System.exit(0);
                default:
                    System.out.println("Неверный ввод!!! Повторите еще раз.");
                    menu();
                    break;
            }
        }
        catch (InputMismatchException e){
            System.out.println("Неверный ввод!!! Повторите еще раз.");
            menu();
        }
    }
    void searchOut() throws Exception {
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
                    searchOutMenu(1);
                    break;
                case 2:
                    searchOutMenu(2);
                    break;
                case 3:
                    searchOutMenu(3);
                    break;
                case 4:
                    searchOutMenu(4);
                    break;
                case 5:
                    menu();
                    break;
                default:
                    System.out.println("Неверный ввод!!! Повторите еще раз.");
                    searchOut();
                    break;
            }
        }
        catch (InputMismatchException e){
            System.out.println("Неверный ввод!!! Повторите еще раз.");
            searchOut();
        }
    }
    void searchMethod(int item) throws Exception {
        try {
            employee = controller.search(item, new ModelClass().employeeMain());

            for (int element = 0; element < employee.size(); element++) {
                System.out.print(controller.getIndex().get(element) + "   ");
                outEmployee(employee.get(element));
            }

        } catch (MyException e){
            System.out.println(e.getMessage());
            searchOutMenu(item);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            changeSearch(item);
        }
        if (item == 1){
            choiceRemoveOrChange();
        }
        else changeSearch(item);
    }
    void searchOutMenu(int item) throws Exception {
        switch (item) {
            case 1:
                System.out.println("Введите имя или фамилию:");
                searchMethod(1);
                break;
            case 2:
                System.out.println("Введите название отдела или начальника:");
                searchMethod(2);
                break;
            case 3:
                System.out.println("Введите телефон:");
                searchMethod(3);
                break;
            case 4:
                System.out.println("Введите зарплату:");
                searchMethod(4);
                break;
        }
    }
    void changeSearch( int searchCriterium) throws Exception {
        try{
            System.out.println("Продолжить поиск: 1 - ДА   2 - НЕТ");
            Scanner in = new Scanner(System.in);
            int item = in.nextInt();
            switch (item){
                case 1:
                    changeCriteria(searchCriterium);
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("Неверный ввод!!! Повторите еще раз.");
                    changeSearch(searchCriterium);
                    break;
            }
        }
        catch (InputMismatchException e){
            System.out.println("Неверный ввод!!! Повторите еще раз.");
            changeSearch(searchCriterium);
        }
    }
    void changeCriteria(int changeSearchCriterium) throws Exception {
        try {
            System.out.println("Сменить критерий поиска: 1- ДА   2-НЕТ");
            Scanner in = new Scanner(System.in);
            int item = in.nextInt();
            switch (item){
                case 1:
                    searchOut();
                    break;
                case 2:
                    searchOutMenu(changeSearchCriterium);
                    break;
                default:
                    System.out.println("Неверный ввод!!! Повторите еще раз.");
                    changeCriteria(changeSearchCriterium);
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод!!! Повторите еще раз.");
            changeCriteria(changeSearchCriterium);
        }
    }
    void menuAdd() throws Exception {
        System.out.println("1: Добавить нового сотрудника.");
        System.out.println("2: Назад.");
        try {
            Scanner in = new Scanner(System.in);
            int item = in.nextInt();
            switch (item){
                case 1:
                    addNewEmployee();
                    break;
                case 2:
                    menu();
                    break;
                default:
                    System.out.println("Неверный ввод!!! Повторите еще раз.");
                    menuAdd();
                    break;
            }
        }
        catch (InputMismatchException e){
            System.out.println("Неверный ввод!!! Повторите еще раз.");
            menuAdd();
        }
    }
    void addNewEmployee() throws Exception {
        new Add().addNewFirstName();
        System.out.println("Запись прошла успешно!!!");
        menu();
    }
    void choiceRemoveOrChange() throws Exception {
        try {
            System.out.println("1 - Удаление работника 2 - Изменение данных работника 3 - Вернуться в поиск");
            Scanner in = new Scanner(System.in);
            int temp = in.nextInt();
            switch (temp){
                case 1:
                    outRemove();
                    break;
                case 2:
                    changeEmployee();
                    break;
                case 3:
                    changeSearch(1);
                    break;
                default:
                    System.out.println("Неверный ввод!!! Повторите еще раз.");
                    choiceRemoveOrChange();
                    break;
            }
        }catch (InputMismatchException e){
            System.out.println("Неверный ввод!!! Повторите еще раз.");
            choiceRemoveOrChange();
        }
    }
    void changeEmployee() throws Exception {
        System.out.println("Введите позицию для изменения:");
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        new ChangeClass().changeFirstName(index);
        removeEmployee(index);
    }
    void outRemove() throws Exception {
           try {
               System.out.println("Введите позицию для удаления:");
               Scanner inDel = new Scanner(System.in);
               int pozitionDel = inDel.nextInt();
               System.out.println("Удалить выбранного работника: 1- ДА 2 - НЕТ");
               int temp = inDel.nextInt();
               if (temp == 1) {
                   removeEmployee(pozitionDel);
               }
               else changeSearch(1);
           }catch (InputMismatchException e){
               System.out.println("Неверный ввод!!! Повторите еще раз.");
               outRemove();
           }

    }
    void removeEmployee(int index) throws Exception {
        controller.remove(index, new ModelClass().employeeMain());
        System.out.println("Удаление завершено.");
        menu();
    }


     void outEmployee(Employee x){
        System.out.println(x.getFirstname() + "  " + x.getLastname() + "  " + x.getDept().getTitle() + "  " + x.getDept().getChief().getFirstName()
                + "  " + x.getDept().getChief().getLastName() + "  " + x.getPhone() + "  " + x.getSalary());
     }
}


