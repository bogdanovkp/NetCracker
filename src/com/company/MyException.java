package com.company;

public class MyException extends Exception{
    private int i;
    public MyException (){}
    public  MyException(int temp){
        i = temp;
    }
    public int val(){
        return  i;
    }

}
