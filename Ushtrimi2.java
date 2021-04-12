//Ndërtoni një program që lexon një skedar tekst. Lexoni secilin rresht të skedarit dhe shkruajeni atë
//në skedarin output të ndjekur nga numri i rreshtit. Për shembull, nëse skedari input është:
//Mary had a little lamb
//Whose fleece was white as snow.
//And everywhere that Mary went,
//The lamb was sure to go!
//programi duhet të prodhojë skedarin output:
///* 1 */ Mary had a little lamb
///* 2 */ Whose fleece was white as snow.
///* 3 */ And everywhere that Mary went,
///* 4 */ The lamb was sure to go!
//Kërkoni nga përdoruesi emrat e skedarëve input dhe output.
package com.seminar8;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ushtrimi2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Skedari Input: ");
        String emriISkedaritInput = input.next();
        System.out.print("Skedari output: ");
        String emriISkedaritOutput = input.next();
        try {
            File skedariInput = new File(emriISkedaritInput);
            Scanner in = new Scanner(skedariInput);
            PrintWriter out = new PrintWriter(emriISkedaritOutput);
            int nrRreshtit = 1;
            while (in.hasNextLine()) {
                String line = in.nextLine();
                out.println("/* " + nrRreshtit + " */ " + line);
                nrRreshtit++;
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
