package com.company;


public class Employee {

    private String firstname;// ���

    private String lastname;//�������

    private Dept dept;// �����

    private String phone;// �������

    private double salary; // ��������

    public Employee (String firstname,String lastname, String phone, double salary, Dept dept){
            this.firstname = firstname;
            this.lastname = lastname;
            this.dept = dept;
            this.phone = phone;
            this.salary = salary;
    }

    protected String getFirstname() {
        return firstname;
    }

    protected String getLastname() {
        return lastname;
    }

    protected Dept getDept() {
        return dept;
    }

    protected String getPhone() {
        return phone;
    }

    protected double getSalary() {
        return salary;
    }


    protected void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    protected void setLastname(String lastname) {
        this.lastname = lastname;
    }

    protected void setPhone(String phone) {
        this.phone = phone;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }

    protected void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return firstname + "  " + lastname +"  "+ dept.getTitle() + "  " +  dept.getChief() +"  "+ phone +"  "+ salary +"  ";
    }
}
