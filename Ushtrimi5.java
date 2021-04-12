//Ndërtoni një program i cili mbush një array list me vlera nga përdoruesi. Përdoruesi gjithashtu jep
//dy indekse. Programi duhet të afishojë array listën duke hequr nga lista të gjithë elementët indeksi
//i të cilëve është midis indeksit më të vogël të dhënë nga përdoruesi deri tek indeksi më të madh.
package com.seminar7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ushtrimi5 {


    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Sa elemente doni te perfshni ne listen e pare : ");
        int n = in.nextInt();
        System.out.println("Vendosni numrat : ");
        ArrayList<Integer> a = new ArrayList(n);
        for (int i=0; i<n; i++){
            Integer s = in.nextInt();
            a.add(s);
        }
        System.out.println("Lista e dhene nga ju : "+a);
        System.out.println("Vendosni indekset midis te cileve doni te fshini elemente : ");
        ArrayList<Integer> b = new ArrayList(n);
        int k= in.nextInt();
        int l= in.nextInt();
        for (int i=0; i<n; i++){
            //a.remove(a.subList(k,l));
            a.subList(k, l).clear();
            b.add(i);
        }
        System.out.println(b);
    }
}
