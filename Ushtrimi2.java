//Ndërtoni një metodë public static ArrayList<Integer> merge (ArrayList<Integer> a,
//ArrayList<Integer> b), e cila bashkon dy array lista, duke alternuar elementë nga të dy arraylistat.
//Nëse një nga arraylistat është më e vogël se tjetra, atëherë kryeni alternimet për sa kohë që është
//e mundur dhe më pas shtoni elementët e mbetur nga array lista më e gjatë. Për shembull, nëse a
//është 1 4 9 16 dhe b është 9 7 4 9 11 atëherë metoda do të kthejë array listën 1 9 4 7 9 4 16 9 11.
package com.seminar7;

import java.util.ArrayList;
import java.util.Scanner;

public class Ushtrimi2 {

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int size = Math.max(a.size(), b.size());
        ArrayList<Integer> ebashkuar = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            if(i <= a.size() - 1) {
                ebashkuar.add(a.get(i));
            }
            if(i <= b.size() - 1) {
                ebashkuar.add(b.get(i));
            }
        }
        return ebashkuar;
    }

    public static String ndanListen(ArrayList<Integer> ints) {
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < ints.size(); i++)
            s.append(ints.get(i)).append(i != ints.size() - 1 ? " " : "");
        return s.toString();
    }

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Sa elemente doni te perfshni ne listen e pare : ");
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList(n);
        for (int i=0; i<n; i++){
            Integer s = in.nextInt();
            a.add(s);
        }

        System.out.println("Sa elemente doni te perfshni ne listen e dyte : ");
        int m = in.nextInt();
        System.out.println("Vendosni numrat : ");
        ArrayList<Integer> b = new ArrayList(n);
        for (int i=0; i<m; i++){
            Integer k = in.nextInt();
            b.add(k);
        }
        ArrayList<Integer> merged = merge(a, b);
        System.out.println("A: " + ndanListen(a));
        System.out.println("B: " + ndanListen(b));
        System.out.println("Lista e bashkuar : " + ndanListen(merged));
    }
}