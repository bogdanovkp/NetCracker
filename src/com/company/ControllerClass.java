package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


interface Controller{
    ArrayList search(int x, ArrayList<Employee> y) throws Exception;
}

public class ControllerClass implements Controller  {
    final int NAME=1;
    final int DEPT=2;
    final int PHONE=3;
    final int SALARY=4;
    private  Employee employee = new Employee("","","",0,new Dept("", new Chief("","")));
    private ArrayList index = new ArrayList<Integer>();

    public ArrayList getIndex() {
        return index;
    }

    public ArrayList search(int typeOfSearch, ArrayList<Employee> x) throws Exception {
        Double salarySearch;
        ArrayList temp = new ArrayList();
        while(true){
            Scanner in = new Scanner(System.in);
            String dataSearch = in.nextLine();
            switch (typeOfSearch) {
                case NAME:
                    if (!ValidationChecking.checkName(dataSearch)) throw new MyException("Неправильно введено имя. Повторите ввод:");
                    for (int element = 0; element < x.size(); element++) {
                        if (dataSearch.equals(x.get(element).getFirstname()) || dataSearch.equals(x.get(element).getLastname())) {
                            temp.add(x.get(element));
                            index.add(element);
                        }
                    }
                    if (!temp.isEmpty()){
                        return temp;
                    }
                    else {
                        throw new Exception("Не найдено!");
                    }
                case DEPT:
                    if (!ValidationChecking.checkDept(dataSearch))throw new MyException("Неправильно введен отдел или ФИО начальника. Повторите ввод:");
                    for (int element = 0; element < x.size(); element++) {
                        if (dataSearch.equals(x.get(element).getDept().getChief().getFirstName()) ||dataSearch.equals(x.get(element).getDept().getChief().getLastName()) || dataSearch.equals(x.get(element).getDept().getTitle())) {
                            temp.add(x.get(element));

                        }
                    }
                    if (!temp.isEmpty()){
                        return temp;
                    }
                    else {
                        throw new Exception("Не найдено!");
                    }

                case PHONE:
                    if (!ValidationChecking.checkPhone(dataSearch)) throw new MyException("Неправильно введен телефон. Повторите ввод:");
                    for (int element = 0; element < x.size(); element++) {
                        if (dataSearch.equals(x.get(element).getPhone())) {
                            temp.add(x.get(element));

                        }
                    }
                    if (!temp.isEmpty()){
                        return temp;
                    }
                    else {
                        throw new Exception("Не найдено!");
                    }

                case SALARY:
                    if (!ValidationChecking.checkSalary(dataSearch)) throw new MyException("Неправильно введена зарплата. Повторите ввод:");
                    salarySearch = new Double(dataSearch);
                    for (int element = 0; element < x.size(); element++) {
                        if (salarySearch == x.get(element).getSalary()) {
                            temp.add(x.get(element));

                        }
                    }
                    if (!temp.isEmpty()){
                        return temp;
                    }
                    else {
                        throw new Exception("Не найдено!");
                    }
            }
        }
    }
    void remove (int indexForRemove, ArrayList data) throws IOException {
        data.remove(indexForRemove);
        if (data.size() == 0) {
            new ModelClass().cleanFile();
        }
        else new ModelClass().addEmployeeOnremove(data);
    }

     void addFirstName (String firstName) throws MyException {
         if (firstName.equals("")){
         Scanner in = new Scanner(System.in);
         String temp = in.nextLine();
        if (!ValidationChecking.checkName(temp)) {
            throw new MyException("Неверно введено имя. Повторите ввод:");

        }
        else employee.setFirstname(temp);
         }
         else employee.setFirstname(firstName);
    }
     void addLastName (String lastName) throws MyException {
         if (lastName.equals("")) {
             Scanner in = new Scanner(System.in);
             String temp = in.nextLine();
             if (!ValidationChecking.checkName(temp)) {
                 throw new MyException("Неверно введена фамилия. Повторите ввод:");
             }
             else employee.setLastname(temp);
         }
         else employee.setLastname(lastName);
    }
      void addPhone (String phone) throws MyException {
          if (phone.equals("")) {
              Scanner in = new Scanner(System.in);
              String temp = in.nextLine();
              if (!ValidationChecking.checkPhone(temp)) {
                  throw new MyException("Неверно введен телефон. Повторите ввод:");
              }
              else employee.setPhone(temp);
          }
          else employee.setPhone(phone);
    }
     void addSalary (String salary) throws MyException {
         if (salary.equals("")) {
             Scanner in = new Scanner(System.in);
             String temp = in.nextLine();
             if (!ValidationChecking.checkSalary(temp)) {
                 throw new MyException("Неверно введена зарплата. Повторите ввод:");
             }
             else employee.setSalary(new Double(temp));
         }
         else employee.setSalary(new Double(salary));
    }
      void addTitle (String title) throws MyException {
          if (title.equals("")) {
              Scanner in = new Scanner(System.in);
              String temp = in.nextLine();
              if (!ValidationChecking.checkDept(temp)) {
                  throw new MyException("Неверно введено название отдела. Повторите ввод:");
              }
              else employee.getDept().setTitle(temp);
          }
          else employee.getDept().setTitle(title);
    }
      void addChiefFirstName (String chiefFirstName) throws MyException {
          if (chiefFirstName.equals("")) {
              Scanner in = new Scanner(System.in);
              String temp = in.nextLine();
              if (!ValidationChecking.checkName(temp)) {
                  throw new MyException("Неверно введено имя начальника отдела. Повторите ввод:");
              }
              else employee.getDept().getChief().setFirstName(temp);
          }
          else employee.getDept().getChief().setFirstName(chiefFirstName);
    }
     void addChiefLastName (String chiefLastName) throws MyException {
         if (chiefLastName.equals("")) {
             Scanner in = new Scanner(System.in);
             String temp = in.nextLine();
             if (!ValidationChecking.checkName(temp)) {
                 throw new MyException("Неверно введена фамилия начальника отдела. Повторите ввод:");
             }
             else employee.getDept().getChief().setLastName(temp);
         }
         else employee.getDept().getChief().setLastName(chiefLastName);
    }
      void addEmployee () throws IOException {
        new ModelClass().addEmployeeFile(employee);
    }

}
