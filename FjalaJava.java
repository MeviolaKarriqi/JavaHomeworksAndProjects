package com.seminar8;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FjalaJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Skedari Input: ");
        String emriISkedaritInput = input.next();
        System.out.print("Skedari output: ");
        String emriISkedaritOutput = input.next();
        try{
            File skedariInput = new File(emriISkedaritInput);
            Scanner in = new Scanner(skedariInput);
            PrintWriter out = new PrintWriter(emriISkedaritOutput);

            int counter = 0;
            while (in.hasNext()) {
                String line = in.next();
                if (line.equals("java")){
                    counter++;
                }
            }
            out.println(counter);
            in.close();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
