package com.seminar8;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RowCiftSK {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Vendosni emrin e skedarit input : ");
        String emriISkedaritInput = input.next();
        System.out.println("Vendosni emrin e skedarit output : ");
        String emriISkedaritOutput = input.next();
        ArrayList<String> a = new ArrayList<String>();
        try {
            File skedariInput = new File(emriISkedaritInput);
            File skedariOutput = new File(emriISkedaritOutput);
            Scanner content  = new Scanner(skedariInput);
            PrintWriter out = new PrintWriter(skedariOutput);
            while (content.hasNextLine()){
                String str= content.nextLine();
                StringBuffer buffer = new StringBuffer(str);
                buffer = buffer.reverse();
                String stri = buffer.toString();
                a.add(stri);
            }
            for (int i=0; i<a.size(); i++){
                if (i%2!=0){
                    out.println(a.get(i));
                }
            }
            content.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}