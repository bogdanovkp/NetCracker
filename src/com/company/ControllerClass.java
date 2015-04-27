package com.company;
import java.nio.channels.ScatteringByteChannel;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerClass {


    protected ArrayList search(int typeOfSearch, ArrayList<Employee> x) throws Exception {
        Double salarySearch = null;
        ArrayList temp = new ArrayList();
        while(true){
            Scanner in = new Scanner(System.in);
            String dataSearch = in.nextLine();
            if (typeOfSearch == 4) {
                 salarySearch = new Double(dataSearch);
            }

            switch (typeOfSearch) {
                case 1:
                    for (int i = 0; i < x.size(); i++) {
                        if (dataSearch.equals(x.get(i).getFirstname()) || dataSearch.equals(x.get(i).getLastname())) {
                            temp.add(x.get(i));
                        }
                    }
                    if (temp.size() != 0){
                    return temp;
                    }
                    else {
                        throw new Exception();
                    }
                case 2:
                    for (int i = 0; i < x.size(); i++) {
                        if (dataSearch.equals(x.get(i).getDept().getChief().getFirstName()) ||dataSearch.equals(x.get(i).getDept().getChief().getLastName()) || dataSearch.equals(x.get(i).getDept().getTitle())) {
                            temp.add(x.get(i));
                        }
                    }
                    if (temp.size() != 0){
                        return temp;
                    }
                    else {
                        throw new Exception();
                    }

                case 3:
                    for (int i = 0; i < x.size(); i++) {
                        if (dataSearch.equals(x.get(i).getPhone())) {
                            temp.add(x.get(i));
                        }
                    }
                    if (temp.size() != 0){
                        return temp;
                    }
                    else {
                        throw new Exception();
                    }

                case 4:
                    for (int i = 0; i < x.size(); i++) {
                        if (salarySearch == x.get(i).getSalary()) {
                            temp.add(x.get(i));
                        }
                    }
                    if (temp.size() != 0){
                        return temp;
                    }
                    else {
                        throw new Exception();
                    }
        }

        }
    }

    public void writeFile(String stroka){
        FileWriter writeFile = null;
        try {
            File logFile = new File("C:\\data.txt");
            writeFile = new FileWriter(logFile,true);
            writeFile.append(stroka).append("\r").append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(writeFile != null) {
                try {
                    writeFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String readFile() throws IOException{
        String stroka = "";
        Scanner in = new Scanner(new File("C:\\data.txt"));
        stroka = stroka + in.nextLine() + "\r"+"\n";
        in.close();
        return stroka;

    }

    /*  VIew viewAdd = new VIew();
        viewAdd.addEmployeeFirstName();
        Scanner in = new Scanner(System.in);
        String nameFirstAdd = in.nextLine();
        System.out.println();
        viewAdd.addEmployeeLastName();
        in = new Scanner(System.in);
        String nameLastAdd = in.nextLine();
        System.out.println();
        viewAdd.addEmployeePhone();
        in = new Scanner(System.in);
        String phoneAdd = in.nextLine();
        System.out.println();
        viewAdd.addEmployeeChiefDept();
        in = new Scanner(System.in);
        String chiefDeptAdd = in.nextLine();
        System.out.println();
        viewAdd.addEmployeeTitleDept();
        in = new Scanner(System.in);
        String titleDeptAdd = in.nextLine();
        System.out.println();
        viewAdd.addEmployeeSalary();
        in = new Scanner(System.in);
        Double salaryAdd = in.nextDouble();
        Employee addEmployee = new Employee(nameFirstAdd,nameLastAdd,phoneAdd,salaryAdd,new Dept(titleDeptAdd,chiefDeptAdd));
        y.add(addEmployee);
        System.out.println(y.get(y.size()-1));
       return y;
    }*/
}
