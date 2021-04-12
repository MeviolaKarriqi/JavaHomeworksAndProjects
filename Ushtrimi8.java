//Ndërtoni një metodë statike që kontrollon nëse dy tabela kanë të njëjtët elementë në një rradhë të
//caktuar. Për shembull, tabelat 1 4 9 16 9 7 4 9 11 dhe 11 1 4 9 16 9 7 4 9 do të konsiderohen identike.
//Ndërsa tabelat 1 4 9 16 9 7 4 9 11 dhe 11 11 7 9 16 4 1 4 9 nuk janë identike.
package com.seminar6;
import java.util.Scanner;
public class Ushtrimi8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Vendosni sa vlera doni qe te permbajne tabelat tuaja : ");
        int nr = in.nextInt();
        int [] vek1 = new int[nr];
        System.out.println("Vendosni vlerat per te mbushur tabelen e pare: ");
        for (int i=0; i<nr; i++){
            vek1[i]=in.nextInt();
        }

        int [] vek2 = new int[nr];
        System.out.println("Vendosni vlerat per te mbushur tabelen e dyte: ");
        for (int i=0; i<nr; i++){
            vek2[i]=in.nextInt();
        }


        if (teBarabarta(vek1, vek2)) {
            System.out.println("Te dy tabelat jane ne menyre strikte identike.");
        } else {
            System.out.println("Te dy tabelat nuk jane ne menyre strikte identike.");
        }



    }

    public static boolean teBarabarta(int[] tab1, int[] tab2) {

        if (tab1.length != tab2.length)
            return false;


        for (int i = 0; i < tab1.length; i++) {
            for(int j=i; j< tab1.length; j++){
                if (tab1[i] != tab2[i])
                    return false;
            }

        }

        return true;
    }
}
