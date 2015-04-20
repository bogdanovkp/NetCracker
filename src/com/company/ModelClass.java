package com.company;
import java.nio.channels.ScatteringByteChannel;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ModelClass {

    public void search(int typeOfSearch, ArrayList<Employee> x){
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
}
