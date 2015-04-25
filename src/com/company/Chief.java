package com.company;

public class Chief {
    private String firstName;//имя
    private String lastName;// фамилия

    public Chief (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected String getFirstName() {
        return firstName;
    }

    protected String getLastName() {
        return lastName;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
