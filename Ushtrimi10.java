//Ndërtoni një program që gjeneron 20 numra rasti me vlerë midis 0 dhe 99 në një tabelë. Programi
//afishon sekuencën, i rendit ato dhe më pas afishon sekuencën e renditur. Përdorni metodën sort nga
//libraria e Javës.
package com.seminar6;
import java.util.Arrays;
import java.util.Random;

public class Ushtrimi10 {
    public static void main(String[] args){
        Random rastesor = new Random();
        int [] vek = new int [20];
        System.out.println("Numrat jane zgjedhur nga programi ne menyre rastesore :");
        for (int i=0; i<20; i++) {
            vek[i] = rastesor.nextInt(99);
            System.out.print(vek[i] + "\t");
        }
        System.out.println("\nNumrat e zgjedhur nga programi ne menyre rastesore te renditur :");
        Arrays.sort(vek);
        for (int i = 0; i < 20; i++) {
            System.out.print(vek[i]+ "\t");
        }
    }
}
