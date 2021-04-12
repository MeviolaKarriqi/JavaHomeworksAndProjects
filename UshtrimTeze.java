package com.seminar6;
import java.util.Arrays;
import java.util.Scanner;

public class UshtrimTeze {
    static int ushtrimTeze(int []vek, int n){
        int counter = 0;
        int nrSekuence = 0;

        for (int i = 1; i < n; i++) {
            if (vek[i] >= vek[i - 1]-1) {
                counter++;
            } else {
                counter = 0;
            }

            if (counter > nrSekuence) {
                nrSekuence = counter;
            }
        }
        return nrSekuence;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vendosni sa vlera doni qe te permbaje tabela juaj : ");
        int nr = in.nextInt();
        int [] vek = new int[nr];
        System.out.println("Vendosni vlerat per te mbushur tabelen : ");
        for (int i=0; i<nr; i++){
            vek[i]=in.nextInt();
        }
        System.out.println("Gjatesia me e madhe e elementeve te njepasnjeshem eshte : " + ushtrimTeze(vek, nr));
    }
}
