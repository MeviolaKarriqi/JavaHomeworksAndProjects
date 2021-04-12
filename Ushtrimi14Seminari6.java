//Ndërtoni një program që lexon një sekuencë me vlera nga përdoruesi sëbashku me shtetin
//përkatës dhe më pas afishoni një grafik të numrit të vlerave të marra nga përdoruesi duke përdorur
//yjet.

package com.seminar7;

import java.util.Scanner;

public class Ushtrimi14Seminari6 {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        System.out.println("Sa shtete do te vendosni : ");
        int nrShtetesh = in.nextInt();
        final int SHTETE = nrShtetesh;

        System.out.println("Vendosni emrat e shteteve");
        String [] shtete = new String[SHTETE];
        for (int i=0; i<shtete.length; i++){
            shtete[i]=in.next();
        }

        for (int i=0; i<SHTETE; i++){
            System.out.printf("%15s\n",shtete[i]);
        }

        System.out.println("\nVendosni sa yje doni qe te kete secili nga shtetet : ");
        int [] tabYje = new int[nrShtetesh];
        for (int i=0; i<nrShtetesh; i++){
            tabYje[i] = in.nextInt();
        }

        for (int i=0; i<SHTETE; i++){
            System.out.print(shtete[i]+" :");
            for (int j=0; j<nrShtetesh; j++){
                for (int k=0; k<tabYje[j]; k++){
                    if(i==j){
                        System.out.print("*");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}