//Implementoni një klasë Population e cili simulon rritjen e popullsisë. Konstruktori merr numrin e
//popullsisë fillestare. Ndërtoni një metodë e cila simulon rritjen e popullsisë duke e dyfishuar atë,
//një metodë e cila e zvogëlon popullsinë me 10% dhe një metodë e cila kthen numrin aktual të
//popullsisë. Ndërtoni programin i cili afishon dy herë numrin e popullsisë pas rritjes dhe zvogëlimit
//të saj dy herë.
package com.com.seminar9;

import java.util.Scanner;

class Popullsia{
    private int persona;
    Popullsia (int persona){
        this.persona = persona;
    }
    public int nrAktual(){
        return persona;
    }
    public int rritNr(){
        this.persona = persona * 2;
        return persona;
    }
    public int zvogeloNr(int popullsi){
        this.persona = (int) (popullsi - popullsi*0.1);
        return persona;
    }
}
public class Ushtrimi5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vendosni popullsine fillestare : ");
        int popullesia = in.nextInt();
        Popullsia popullesi = new Popullsia(popullesia);
        System.out.println("Popullesia aktuale  :"+popullesi.nrAktual());
        System.out.println("Dyfishi i popullesise aktuale : "+popullesi.rritNr());
        System.out.println("10% me pak e popullsise aktuale eshte : "+popullesi.zvogeloNr(popullesia));
    }
}
