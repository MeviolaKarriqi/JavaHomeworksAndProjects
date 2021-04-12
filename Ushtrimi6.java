//Ndërtoni një program që zëvendëson çdo rresht të skedarit me të anasjelltin e tij. Përshembull
//përmbajtja e skedarit HelloPrinter.java do të ndryshonte në :
//retnirPolleH ssalc cilbup
//{
//)sgra ][gnirtS(niam diov citats cilbup
//{
//wodniw elosnoc eht ni gniteerg a yalpsiD //
//;)"!dlroW ,olleH"(nltnirp.tuo.metsyS
//}
//}
package com.seminar8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ushtrimi6 {

    public static String ktheMbrapsht(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Vendosni emrin e skedarit : ");
        String emri = in.next();
        try{
            File skedari = new File(emri);
            Scanner lexo = new Scanner(skedari);

            while (lexo.hasNextLine()){
                String rreshti = lexo.nextLine();
                String s=ktheMbrapsht(rreshti);
                System.out.println(s);
            }
            lexo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
