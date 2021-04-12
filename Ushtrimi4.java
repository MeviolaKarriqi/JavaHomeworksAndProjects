//Ndërtoni një program që kërkon nga përdoruesi emrin e skedarit dhe afishon numrin e
//karaktereve, fjalëve dhe rreshtave në skedar.
package com.seminar8;

import java.io.*;

public class Ushtrimi4 {
    public static void main(String[] args) throws IOException
    {
        File skedar = new File("Ushtrimi4.txt");
        FileInputStream shfaqjaESkedarit = new FileInputStream(skedar);
        InputStreamReader input = new InputStreamReader(shfaqjaESkedarit);
        BufferedReader lexuesi = new BufferedReader(input);
        String rresht;
        int nrRreshtash = 0;
        int nrFjalish = 0;
        int nrKarakteresh = 0;
        int nrParagrafesh = 1;
        while((rresht = lexuesi.readLine()) != null) {
            if(rresht.equals("")) {
                nrParagrafesh++;
            }
            else {
                nrKarakteresh += rresht.length();
                String[] listefjalesh = rresht.split("\\s+");

                nrRreshtash += listefjalesh.length;
                String[] listeFjalish = rresht.split("[!?.:]+");
                nrFjalish += listeFjalish.length;
            }
        }
        System.out.println("Numri total i fjaleve = " + nrRreshtash);
        System.out.println("Numri total i fjalive= " + nrFjalish);
        System.out.println("Numri total i karaktereve = " + nrKarakteresh);
        System.out.println("Numri total i paragrafeve = " + nrParagrafesh);
    }
}
