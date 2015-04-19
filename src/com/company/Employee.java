package com.company;


public class Employee {

    private String firstname;// имя

    private String lastname;//фамилия

    private Dept dept;// отдел

    private String phone;// телефон

    private double salary; // зарплата

    public Employee (String firstname,String lastname, String phone, double salary, Dept dept){
            this.firstname = firstname;
            this.lastname = lastname;
            this.dept = dept;
            this.phone = phone;
            this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Dept getDept() {
        return dept;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }



    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return firstname + "  " + lastname +"  "+ dept.getTitle() + "  " +  dept.getChief() +"  "+ phone +"  "+ salary +"  ";
    }
}
