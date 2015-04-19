package com.company;
import java.nio.channels.ScatteringByteChannel;
import java.io.*;
import java.util.Scanner;

public class ModelClass {

    public void search(int typeOfSearch, Employee x){

        while(true){
            Scanner in = new Scanner(System.in);
            String dataSearch = in.nextLine();

                if (typeOfSearch == 1){
                    if (dataSearch.equals(x.getLastname()) || dataSearch.equals(x.getFirstname())){
                        System.out.println(x);
                    }
                    else System.out.println("Not Found");
                }





        }
    }

    public void writeFile(String stroka){
        FileWriter writeFile = null;
        try {
            File logFile = new File("K:\\Student\\Java\\JavaIDE\\data.txt");
            writeFile = new FileWriter(logFile);
            writeFile.append(stroka + "\n");
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
        Scanner in = new Scanner(new File("K:\\Student\\Java\\JavaIDE\\data.txt"));
        stroka = stroka + in.nextLine() + "\r"+"\n";
        in.close();
        return stroka;

    }
}
