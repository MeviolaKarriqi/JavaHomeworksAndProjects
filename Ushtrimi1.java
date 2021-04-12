//1. Ndërtoni një program që mbush tabelën me 10 numra të rastësishëm të ndryshëm midis 1 dhe
//100.
package com.seminar6;

import java.util.Random;

public class Ushtrimi1 {
    public static void main (String [] args){
        Random rastesor = new Random();
        int [] vek = new int [10];
        System.out.println("Numrat jane zgjedhur nga programi ne menyre rastesore nga 1 deri ne 100 :");
        for (int i=0; i<10; i++) {
            vek[i] = rastesor.nextInt(100);
            System.out.print(vek[i] + "\t");

            for (int j = 0; j < i; j++) {
                if (j == vek[i]) {
                    i--;
                }
            }
        }
    }
}