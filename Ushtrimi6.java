//Ndërtoni një metodë që numëron numrin e elementëve të ndryshëm në një tabelë me stringje pa
//modifikuar arraylistën.
package com.seminar7;

import java.util.*;

public class Ushtrimi6 {

    public static Set<String> findDuplicates(int[] input) {
        Set<String> duplicates = new HashSet<String>();

        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < input.length; j++) {
                if (input[i] == input[j] && i != j) {
                    break;
                }
            }
        }

        return duplicates;
    }
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Sa stringje doni te vendosni : ");
        int n = in.nextInt();
        ArrayList lista = new ArrayList(n);
        for (int i=0; i<n; i++){
            String s = in.next();
            lista.add(s);
        }
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(lista);
        ArrayList<Integer>listERe = new ArrayList<>(hashSet);
        System.out.println("Lista e  pare pa dublikime : "+listERe);
        int m = listERe.size();
        System.out.println("Element  qe gjenden vetem nje here :  "+m);
    }
}
