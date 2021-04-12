//Ndërtoni një metodë public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a,
//ArrayList<Integer> b) që bashkon dy array lista të renditura, duke prodhuar një array list të re të
//renditur. Nëse a është 1 4 9 16 dhe b është 4 7 9 9 11 atëherë metoda do të kthejë 1 4 4 7 9 9 9
//11 16.
package com.seminar7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ushtrimi3 {

    public static ArrayList<Integer> bashkuar(ArrayList<Integer> a, ArrayList<Integer> b) {
        int size = Math.max(a.size(), b.size());
        ArrayList<Integer> eBashkuar = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            if(i <= a.size() - 1) {
                eBashkuar.add(a.get(i));
            }
            if(i <= b.size() - 1) {
                eBashkuar.add(b.get(i));
            }
        }
        Collections.sort(eBashkuar);
        return eBashkuar;
    }

    public static String ndanListen(ArrayList<Integer> ints) {
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < ints.size(); i++) {
            s.append(ints.get(i)).append(i != ints.size() - 1 ? " " : "");
        }
        return s.toString();
    }

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

        System.out.println("Sa elemente doni te perfshni ne listen e dyte : ");
        int m = in.nextInt();
        System.out.println("Vendosni numrat : ");
        ArrayList<Integer> b = new ArrayList(m);
        for (int i=0; i<m; i++){
            Integer k = in.nextInt();
            b.add(k);
        }
        ArrayList<Integer> eBashkuar = bashkuar(a, b);
        System.out.println("Lista A: " + ndanListen(a));
        System.out.println("Lista B: " + ndanListen(b));
        System.out.println("E bashkuar : " + ndanListen(eBashkuar));
    }
}
