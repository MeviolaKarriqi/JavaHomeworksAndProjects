//Implementoni një klasë Product. Një produkt ka një emër dhe një çmim, për shembull neë Product
//(“Tost”, 29.95). Ndërtoni metodat getName, getPrice dhe reducePrice. Ndërtoni një program
//ProductPrinter i cili do afishojë emrin dhe çmimin e dy produkteve, do të reduktojë çmimin e tyre
//me 5$ dhe do të afishojë përsëri çmimet e tyre.
package com.com.seminar9;

import java.util.Scanner;

class Produkt{
    private String emerProdukt;
    private double cmimiProdukt;
    Produkt(String emerProdukt, double cmimiProdukt){
        this.emerProdukt = emerProdukt;
        this.cmimiProdukt = cmimiProdukt;
    }

    public String merrEmerProdukti(){
        return emerProdukt;
    }
    public double merrCmimProdukti(){
        return cmimiProdukt;
    }
    public double reduktoCmimin(double cmim){
        this.cmimiProdukt = cmimiProdukt - 5;
        return cmimiProdukt;
    }
}
public class Ushtrimi4 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        System.out.println("Vendos e emrin e produktit te pare : ");
        String emri = in.next();
        System.out.println("Vendos e cmimin e produktit te pare : ");
        double cmimi = in.nextDouble();

        System.out.println("Vendos e emrin e produtit te dyte : ");
        String emri2 = in.next();
        System.out.println("Vendos e cmimin e produtit te dyte : ");
        int cmimi2 = in.nextInt();

        Produkt produkti1 = new Produkt(emri,cmimi);
        System.out.println("Emri i produktit te pare : "+produkti1.merrEmerProdukti());
        System.out.println("Cmimi i produktit te pare : "+produkti1.merrCmimProdukti()+" $");
        System.out.println("Cmimi i reduktuar i produktit te pare : "+produkti1.reduktoCmimin(cmimi)+" $");

        Produkt produkti2 = new Produkt(emri2,cmimi2);
        System.out.println("\n\n\nEmri i produktit te dyte : "+produkti2.merrEmerProdukti());
        System.out.println("Cmimi i produktit te dyte : "+produkti2.merrCmimProdukti()+" $");
        System.out.println("Cmimi i reduktuar i produktit te dyte : "+produkti2.reduktoCmimin(cmimi2)+" $");
    }
}
