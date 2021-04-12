package com.seminar8;

import java.io.*;
import java.util.Scanner;

public class


Ushtrimi3_1 {
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
            while (input.hasNext()){
                if (input.hasNextLine()){
                    iPare = iPare + Integer.parseInt(input.next());
                    iPare = iPare/2;
                    System.out.println("Mesatarja rreshtit : "+iPare);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}