package com.company;

public class Dept {
    private String title;// название отдела
    private Chief chief;//начальник

    public Dept(String title, Chief chief){
        this.chief = chief;
        this.title = title;
    }

    protected Chief getChief() {
        return chief;
    }
    protected String getTitle() {
        return title;
    }

    protected void setChief(Chief chief) {
        this.chief = chief;
    }

    protected void setTitle(String title) {
        this.title = title;
    }
}
