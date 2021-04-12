//Implementoni algoritmin e mëposhtëm për të ndërtuar një katror magjik n x n; Ky algoritëm
//funksionon vetëm nëse n është tek.
//
//Shembull i një katrori 5x5 i ndërtuar sipas kësaj metode.
//Ndërtoni një program i cili merr si input numrin n dhe ka output katrorin magjik të rendit n, ku n
//është numër tek.
package com.seminar7;

import java.util.Scanner;

public class Ushtrimi9 {
    static void gjeneroKatrorinMagjik(int n)
    {
        int[][] katroriMagjik = new int[n][n];
        int i = n / 2;
        int j = n - 1;
        for (int num = 1; num <= n * n;) {
            if (i == -1 && j == n) {
                j = n - 2;
                i = 0;
            }
            else {
                if (j == n) {
                    j = 0;
                }
                if (i < 0) {
                    i = n - 1;
                }
            }
            if (katroriMagjik[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            }
            else {
                katroriMagjik[i][j] = num++;
            }
            j++;
            i--;
        }
        System.out.println("Katrori magjik per " + n + ":\n");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(katroriMagjik[i][j] + "\t\t");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        System.out.println("Vendosni vleren n qe duhet te jete nr tek :");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        gjeneroKatrorinMagjik(n);
    }
}

