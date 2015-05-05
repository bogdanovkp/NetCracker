package com.company;

public class Dept {
    private String title;// название отдела
    private Chief chief;//начальник

    public Dept(String title, Chief chief){
        this.chief = chief;
        this.title = title;
    }

    public Chief getChief() {
        return chief;
    }
    public String getTitle() {
        return title;
    }

    public void setChief(Chief chief){

        this.chief = chief;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
