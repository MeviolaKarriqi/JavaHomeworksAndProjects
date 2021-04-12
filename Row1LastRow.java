package com.seminar8;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Row1LastRow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Skedari Input: ");
        String emriISkedaritInput = input.next();
        System.out.print("Skedari output: ");
        String emriISkedaritOutput = input.next();
        try{
            File skedariInput = new File(emriISkedaritInput);
            File skedariOutput = new File(emriISkedaritOutput);
            Scanner in = new Scanner(skedariInput);
            PrintWriter out = new PrintWriter(emriISkedaritOutput);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(skedariInput)));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(skedariOutput)));
            ArrayList<String> arrLista = new ArrayList<String>();
            String str = "";
            while((str = br.readLine())!=null){
                arrLista.add(str);
            }
            String[] rreshtat = new String [arrLista.size()];

            for (int i=0 ; i< rreshtat.length-1; i++){
                rreshtat[i] = (String) arrLista.get(arrLista.size()-1);
                bw.write(rreshtat[0]);
                bw.write("\n");
                bw.write(rreshtat[rreshtat.length-1]);
            }

            for (int i=0; i< rreshtat.length; i++){

            }
            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
