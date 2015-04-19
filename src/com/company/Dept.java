package com.company;

public class Dept {
    private String title;//название отдела
    private String chief;//начальник

    public Dept(String title, String chief){
        this.chief = chief;
        this.title = title;
    }

    protected String getChief() {
        return chief;
    }

    protected String getTitle() {
        return title;
    }
}
