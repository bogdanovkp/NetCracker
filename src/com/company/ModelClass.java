package com.company;
import java.nio.channels.ScatteringByteChannel;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ModelClass {

    protected int search(int typeOfSearch, ArrayList<Employee> x)  {
        Double salarySearch = null;
        while(true){
            VIew viewOut = new VIew();
            Scanner in = new Scanner(System.in);
            String dataSearch = in.nextLine();
            if (typeOfSearch == 4) {
                 salarySearch = new Double(dataSearch);
            }

            if (typeOfSearch == 1){
                    for (int i = 0; i < x.size(); i++){
                        if (dataSearch.equals(x.get(i).getFirstname()) || dataSearch.equals(x.get(i).getLastname())){
                            viewOut.outEmployee(x.get(i));
                        }
                    }
                }
            if (typeOfSearch == 2){
                for (int i = 0; i < x.size(); i++){
                    if (dataSearch.equals(x.get(i).getDept().getChief()) || dataSearch.equals(x.get(i).getDept().getTitle())){
                        viewOut.outEmployee(x.get(i));
                    }
                }
            }
            if (typeOfSearch == 3){
                for (int i = 0; i < x.size(); i++){
                    if (dataSearch.equals(x.get(i).getPhone())){
                        viewOut.outEmployee(x.get(i));
                    }
                }
            }
            if (typeOfSearch == 4){
                for (int i = 0; i < x.size(); i++){
                    if (salarySearch == x.get(i).getSalary()){
                        viewOut.outEmployee(x.get(i));
                    }
                }
            }
            System.out.println();
            System.out.println("Continue search: Yes(y)  No(n)");//продолжить поиск?
            in = new Scanner(System.in);
            String stroka = in.nextLine();
            if (stroka.equals("y")){

            }
            else return(1);

            System.out.println();
            System.out.println("Change search criteria: Yes(y)   No(n)"); //сменить критерий поиска?
            in = new Scanner(System.in);
            String strok = in.nextLine();
            if (strok.equals("y")){
                viewOut.searchOut();
                in = new Scanner(System.in);
                String strok1 = in.nextLine();
                typeOfSearch = new Integer(strok1);
                viewOut.searchOutMenu(typeOfSearch);
            }
            else viewOut.searchOutMenu(typeOfSearch);

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

    protected ArrayList addEmployee(ArrayList<Employee> y){
        VIew viewAdd = new VIew();
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
    }
}
