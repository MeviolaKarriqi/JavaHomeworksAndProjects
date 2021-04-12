//5. Ndërtoni një program që llogarit shumën alternative të elementëve në tabelë. Për shembull nëse
//programi lexon elementët 1 4 9 16 9 atëhërë do të llogarisë vlerën 1 – 4 + 9 – 16 + 9.
package com.seminar6;
import java.util.Scanner;
public class Ushtrimi5 {
    public static void main(String args[]){
        int shuma = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Vendosni sa vlera doni qe te permbaje tabela juaj : ");
        int nr = in.nextInt();
        int [] vek = new int[nr];
        System.out.println("Vendosni vlerat per te mbushur tabelen : ");
        for (int i=0; i<nr; i++){
            vek[i]=in.nextInt();
        }
        for( int i : vek) {
            shuma = shuma+i;
        }
        System.out.println("shuma e elementeve te tabeles eshte : "+shuma);
    }
}
