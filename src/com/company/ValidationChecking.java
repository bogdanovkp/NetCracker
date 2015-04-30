package com.company;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationChecking {
    protected static boolean checkName(String userString){
        Pattern p = Pattern.compile("^[a-zA-Z]{3,100}$");
        Matcher m = p.matcher(userString);
        return m.matches();
    }

    protected static boolean checkSalary (String userstring){
        Pattern p = Pattern.compile("^[\\d]{1,20}$");
        Matcher m = p.matcher(userstring);
        return m.matches();
    }
    protected static boolean checkDept(String userString){
        Pattern p = Pattern.compile("^[a-zA-Z0-9]{1,100}$");
        Matcher m = p.matcher(userString);
        return m.matches();
    }
    protected static boolean checkPhone (String userString){
        Pattern p = Pattern.compile("^[\\d-]{1,20}$");
        Matcher m = p.matcher(userString);
        return m.matches();
    }
}
