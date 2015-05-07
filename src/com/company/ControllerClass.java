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
    private  static  Employee employee = new Employee("","","",0,new Dept("", new Chief("","")));

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
                        }
                    }
                    if (!temp.isEmpty()){
                        return temp;
                    }
                    else {
                        throw new Exception();
                    }
                case DEPT:
                    if (!ValidationChecking.checkDept(dataSearch))throw new MyException("Неправильно введен отдел или ФИО начальник. Повторите ввод:");
                    for (int element = 0; element < x.size(); element++) {
                        if (dataSearch.equals(x.get(element).getDept().getChief().getFirstName()) ||dataSearch.equals(x.get(element).getDept().getChief().getLastName()) || dataSearch.equals(x.get(element).getDept().getTitle())) {
                            temp.add(x.get(element));
                        }
                    }
                    if (!temp.isEmpty()){
                        return temp;
                    }
                    else {
                        throw new Exception();
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
                        throw new Exception();
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
                        throw new Exception();
                    }
            }
        }
    }

    public static void addFirstName () throws MyException {
        Scanner in = new Scanner(System.in);
        String temp = in.nextLine();
        if (!ValidationChecking.checkName(temp)) throw new MyException("Неверно введено имя. Повторите ввод:");
        employee.setFirstname(temp);
    }
    public static void addLastName () throws MyException {
        Scanner in = new Scanner(System.in);
        String temp = in.nextLine();
        if (!ValidationChecking.checkName(temp)) throw new MyException("Неверно введена фамилия. Повторите ввод:");
        employee.setLastname(temp);
    }
    public static void addPhone () throws MyException {
        Scanner in = new Scanner(System.in);
        String temp = in.nextLine();
        if (!ValidationChecking.checkPhone(temp)) throw new MyException("Неверно введен телефон. Повторите ввод:");
        employee.setPhone(temp);
    }
    public static void addSalary () throws MyException {
        Scanner in = new Scanner(System.in);
        String temp = in.nextLine();
        if (!ValidationChecking.checkSalary(temp)) throw new MyException("Неверно введена зарплата. Повторите ввод:");
        employee.setSalary(new Double(temp));
    }
    public static void addTitle () throws MyException {
        Scanner in = new Scanner(System.in);
        String temp = in.nextLine();
        if (!ValidationChecking.checkDept(temp)) throw new MyException("Неверно введено название отдела. Повторите ввод:");
        employee.getDept().setTitle(temp);
    }
    public static void addChiefFirstName () throws MyException {
        Scanner in = new Scanner(System.in);
        String temp = in.nextLine();
        if (!ValidationChecking.checkName(temp)) throw new MyException("Неверно введено имя начальника отдела. Повторите ввод:");
        employee.getDept().getChief().setFirstName(temp);
    }
    public static void addChiefLastName () throws MyException {
        Scanner in = new Scanner(System.in);
        String temp = in.nextLine();
        if (!ValidationChecking.checkName(temp)) throw new MyException("Неверно введена фамилия начальника отдела. Повторите ввод:");
        employee.getDept().getChief().setLastName(temp);
    }

    public static void addEmployee () throws IOException {
        ModelClass.addEmployeeFile(employee);
    }

}
