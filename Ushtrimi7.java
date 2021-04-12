//Ndërtoni një metodë statike boolean-e që kontrollon nëse elementët e njëjtë të dy tabelave
//ndodhen në një rradhë të caktuar (nga e majta në të djathtë ose anasjelltas) pa përfshirë vlerat e
//dublikuara. Për shembull metoda që merr si parametër dy tabelat 1 4 9 16 9 7 4 9 11 dhe 11 11 7 9 16
//4 1 do të kthejë true.
package com.seminar6;
import java.util.Scanner;
public class Ushtrimi7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vendosni sa vlera doni qe te permbaje tabela juaj : ");
        int nr = in.nextInt();
        int [] vek = new int[nr];
        System.out.println("Vendosni vlerat per te mbushur tabelen : ");
        for (int i=0; i<nr; i++){
            vek[i]=in.nextInt();
        }
        System.out.println("\nTabela e dhene nga ju :");
        for(int i=0;i<nr;i++)
            System.out.print(vek[i] + "\t");

        System.out.println("\n\nVaktori i rradhitur ne menyre reverse:");
        for(int i=nr-1;i>=0;i--)
            System.out.print(vek[i] + "\t");
    }
}
