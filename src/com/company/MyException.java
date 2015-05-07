package com.company;

public class MyException extends Exception{
    public MyException(String Message){
        System.out.println(Message);
    }
}
