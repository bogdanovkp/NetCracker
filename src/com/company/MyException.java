package com.company;

public class MyException extends Exception{
    private int i;
    public MyException (){}
    public MyException(String Message){
        System.out.println(Message);
    }
    public  MyException(int temp){
        i = temp;
    }
    public int val(){
        return  i;
    }

}
