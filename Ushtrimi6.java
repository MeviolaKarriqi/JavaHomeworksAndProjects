//Ndërtoni një metodë statike që merr si parametër një tabelë dhe kthen mbrapsht sekuencën e
//elementëve. Për shembull nëse metoda thërritet me vlerat 1 4 8 9 16 metoda do të kthejë 16 9 8 4 1.
package com.seminar6;
import java.util.Arrays;
import java.util.Scanner;
public class Ushtrimi6 {
    static void reverseVek(int tab[], int n)
    {
        int  temp;
        for (int i = 0; i < n / 2; i++) {
            temp = tab[i];
            tab[i] = tab[n - i - 1];
            tab[n - i - 1] = temp;
        }
        System.out.println("Tabela reverse: \n" + Arrays.toString(tab));
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Vendosni sa vlera doni qe te permbaje tabela juaj : ");
        int nr = in.nextInt();
        int [] vek = new int[nr];
        System.out.println("Vendosni vlerat per te mbushur tabelen : ");
        for (int i=0; i<nr; i++){
            vek[i]=in.nextInt();
        }
        System.out.println("Tabela e dhene nga ju : \n" + Arrays.toString(vek));
        reverseVek(vek, nr);
    }
}
