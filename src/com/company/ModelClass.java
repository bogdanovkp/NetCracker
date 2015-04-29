package com.company;


import java.util.ArrayList;

public  class ModelClass{
    protected static ArrayList<Employee> employeeMain(){
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        Employee EmployeeMain = new Employee("John", "Macclane", "7-555-565-35", 35000, new Dept("47", new Chief("Otis", "Smith")));
        Employee EmployeeMain1 = new Employee("John","Bryant", "7-333-522-65", 35000, new Dept("132",new Chief("Wein", "Bruce")));
        employeeList.add(EmployeeMain);
        employeeList.add(EmployeeMain1);
        return employeeList;
    }
}
