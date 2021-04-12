//Ndërtoni një program që lexon një skedar nga përdoruesi. Skedari ka dy kolona me numra me
//presje dhjetore. Afishoni mesataren e secilit rresht.
package com.seminar8;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Ushtrimi3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.println("Vendosni emrin e skedarit : ");
        String emri = in.next();

        try {
            File skedari = new File(emri);
            Scanner input = new Scanner(skedari);
            double iPare=0.0;
            double iDyte = 0.0;
            int rreshta=0;
            while (input.hasNextLine()){
                String rreshti = input.nextLine();
                String[] numra = rreshti.split("\\s+");
                iPare = iPare + Double.parseDouble(numra[0]);
                iDyte = iDyte + Double.parseDouble(numra[1]);
                rreshta++;
            }
            if (rreshta >0){
                System.out.println("Mesatarja e kolones se pare : "+iPare/rreshta);
                System.out.println("Mesatarja e kolones se dyte : "+iDyte/rreshta);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}