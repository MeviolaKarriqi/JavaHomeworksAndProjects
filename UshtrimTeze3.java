//Ndertoni nje program qe merr nga perdoruesi emrin e skedarit lexon cdo rresht te skedarit dhe shkruan ne nje skedar
// tjeter fjalen e pare dhe fjalen e fundit te skedarit
package com.seminar8;

import java.io.*;
import java.util.Scanner;

public class UshtrimTeze3 {

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

            int nrRreshtit = 1;
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] listefjalesh = line.split("\\s+");
                out.println(" " + nrRreshtit + " => " + listefjalesh[0] + " " + listefjalesh[listefjalesh.length-1]);
                nrRreshtit++;
            }
            in.close();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
