package com.company;

import java.util.ArrayList;
import java.util.Scanner;


interface Controller{
    ArrayList search(int x, ArrayList<Employee> y) throws Exception;
    boolean addEmployee(int x) throws MyException;
}

public class ControllerClass implements Controller  {
    final int NAME=1;
    final int DEPT=2;
    final int PHONE=3;
    final int SALARY=4;
    public ArrayList search(int typeOfSearch, ArrayList<Employee> x) throws Exception {
        Double salarySearch;
        ArrayList temp = new ArrayList();
        while(true){
            Scanner in = new Scanner(System.in);
            String dataSearch = in.nextLine();
            switch (typeOfSearch) {
                case NAME:
                    if (!ValidationChecking.checkName(dataSearch)) throw new MyException();
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
                    if (!ValidationChecking.checkDept(dataSearch))throw new MyException();
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
                    if (!ValidationChecking.checkPhone(dataSearch)) throw new MyException();
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
                    if (!ValidationChecking.checkSalary(dataSearch)) throw new MyException();
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

    public boolean addEmployee(int item) throws MyException {
        Employee employee = new Employee();

        Scanner in = new Scanner(System.in);
        String temp = in.nextLine();
        switch (item){
            case 1://имя
                if (!ValidationChecking.checkName(temp)) throw new MyException(1);
                employee.setFirstname(temp);
                break;
            case 2://фамилия
                if (!ValidationChecking.checkName(temp)) throw new MyException(2);
                employee.setLastname(temp);
                break;
            case 3://телефон
                if (!ValidationChecking.checkPhone(temp)) throw new MyException(3);
                employee.setPhone(temp);
                break;
            case 4://зарплата
                if (!ValidationChecking.checkSalary(temp)) throw new MyException(4);
                employee.setSalary(new Double(temp));
                break;
            case 5://название отдела
                if (!ValidationChecking.checkDept(temp)) throw new MyException(5);
                employee.getDept().setTitle(temp);
                break;
            case 6://имя начальника отдела
                if (!ValidationChecking.checkName(temp)) throw new MyException(6);
                employee.getDept().getChief().setFirstName(temp);
                break;
            case 7://фамилия начальника отдела
                if (!ValidationChecking.checkName(temp)) throw new MyException(7);
                employee.getDept().getChief().setLastName(temp);
                break;
        }
        return (true);
    }


}
