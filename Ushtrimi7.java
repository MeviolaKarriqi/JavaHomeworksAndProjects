//Ndërtoni një program që lexon çdo rresht të një skedari, kthen mbrapsht çdo rresht të skedarit
//dhe i shkruan ato në një skedar tjetër. Për shembull, nëse skedari input.txt përmban rreshtat
//Mary had a little lamb
//Its fleece was white as snow
//And everywhere that Mary went
//The lamb was sure to go.
//dhe ju ekzekutoni
//reverse input.txt output.txt
//skedari output.txt do të mbajë rreshtat e mëposhtëm:
//The lamb was sure to go.
//And everywhere that Mary went
//Its fleece was white as snow
//Mary had a little lamb
package com.seminar8;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ushtrimi7 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Vendosni emrin e skedarit input : ");
        String emriISkedaritInput = input.next();
        System.out.println("Vendosni emrin e skedarit output : ");
        String emriISkedaritOutput = input.next();
        try {
            File skedariInput = new File(emriISkedaritInput);
            File skedariOutput = new File(emriISkedaritOutput);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(skedariInput)));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(skedariOutput)));
            ArrayList arrLista = new ArrayList(0);
            String str = "";
            while((str = br.readLine())!=null){
                arrLista.add(str);
            }
            String[] rreshtat = new String [arrLista.size()];

            for (int i=rreshtat.length - 1 ; i>=0; i--){
                rreshtat[i] = (String) arrLista.get(arrLista.size()-(i+1));
                System.out.println(rreshtat[i]);
            }

            for (int i=0; i< rreshtat.length; i++){
                System.out.println(rreshtat[i]);
                bw.write(rreshtat[i]);
                bw.write("\n");
            }
            bw.flush();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
