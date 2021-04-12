//2. Ndërtoni një program që inicializon një tabelë me dhjetë elementë numra random me vlerë nga 1
//deri në 10 dhe afishon:
//a) Elementët në pozion çift
//b) Të gjithë elementët në pozicion të kundërt
//c) Elementin e parë dhe elementin e fundit
package com.seminar6;

import java.util.Random;

public class Ushtrimi2 {
    public static void main(String [] arg){
        Random rastesor =  new Random();
        int [] vektor = new int[10];
        System.out.println("\n\nNumrat jane zgjedhur nga programi ne menyre rastesore nga 1 deri ne 100 :");
        for (int i=0; i<10; i++){
            vektor[i] = rastesor.nextInt(10);
            System.out.println("pozicioni : "+i+ "\t" +"Vlera rastesore "+ vektor[i]);
        }
        System.out.println("\n\n\nNumrat rastesor te vendosur ne pozicionet cifte jane: ");
        for (int i=0; i<10; i++){
            if(i%2==0){
                System.out.println("pozicioni : "+i+ "\t" +"Vlera rastesore "+ vektor[i]);
            }
        }
        System.out.println("\n\n\nTe gjithe elementet ne pozicion të kundert : ");
        for (int i=10-1; i>=0; i--){
            System.out.println("pozicioni : "+i+ "\t" +"Vlera rastesore "+ vektor[i]);
        }
        System.out.println("\n\n\nElementi i pare eshte : "+ vektor[0] + " dhe elementi i fumdit eshte : "+vektor[10-1]);

    }
}
