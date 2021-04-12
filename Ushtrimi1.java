//Implementoni një klasë Adresa. Një adresë ka numrin, rrugën, numrin e apartamentit (opsional),
//qytetin, shtetin dhe kodin postar ndërtoni dy konstruktorë: një me numrin e apartamentit dhe
//tjetri pa të. Ndërtoni metodën print që afishon të dhënat. Ndërtoni një metodë method public
//boolean comesBefore(Address other) që teston nëse kjo adresë vjen përpara adresës tjetër, duke
//u nisur nga kodi postar.
package com.com.seminar9;

import java.awt.*;
import java.util.Scanner;

class Adresa {
    private int nr;
    private String rruga;
    private int nrApartamentit;
    private String qyteti;
    private String shteti;
    private int kodiPostar;

    //konstruktori i pare pa numrine apartamentit
    Adresa(int nr, int kodiPostar, String qyteti, String shteti, String rruga){
        this.nr = nr;
        this.kodiPostar=kodiPostar;
        this.qyteti= qyteti;
        this.rruga = rruga;
        this.shteti = shteti;
    }

    //konstruktori me numrin e apartamentit
    Adresa(int nr, int kodiPostar, String qyteti, String shteti, String rruga, int nrApartamentit){
        this.nr = nr;
        this.kodiPostar = kodiPostar;
        this.qyteti = qyteti;
        this.shteti = shteti;
        this.rruga = rruga;
        this.nrApartamentit = nrApartamentit;
    }

    public void shfaqAdresen(){
        System.out.println("Emri i rruges : "+rruga);
        System.out.println("Emri i qytetit : "+qyteti);
        System.out.println("Emri i shtetit : "+shteti);
        System.out.println("Kodi postar : "+kodiPostar);

    }

    public boolean comesBefore(int kontrolloKodPostar){
        if (kodiPostar<kontrolloKodPostar){
            return true;
        }
        else {
            return false;
        }
    }
}

public class Ushtrimi1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\t\t\tTE DHENAT E BANESES SE PARE : ");
        System.out.println("Jepni te dhenat per adresen e pare : ");
        System.out.println("Jepni numrin e shtepiese : ");
        int nrS1 = in.nextInt();
        System.out.println("Jepni emrin e rruges : ");
        String rruge = in.next();
        System.out.println("Jepni emrin e qytetit: ");
        String qytetit = in.next();
        System.out.println("Jepni emrin e shtetit : ");
        String shtetit = in.next();
        System.out.println("Jepni numrin e kodit postar : ");
        int kodiP = in.nextInt();
        Adresa banimi = new Adresa(nrS1, kodiP, qytetit,  shtetit,rruge);


        System.out.println("\t\t\tTE DHENAT E BANESES SE DYTE : ");
        System.out.println("Jepni te dhenat per adresen e dyte : ");
        System.out.println("Jepni numrin e shtepiese 2 : ");
        int nrS2 = in.nextInt();
        System.out.println("Jepni emrin e rruges : ");
        String rruge2 = in.next();
        System.out.println("Jepni emrin e qytetit: ");
        String qytetit2 = in.next();
        System.out.println("Jepni emrin e shtetit : ");
        String shtetit2 = in.next();
        System.out.println("Jepni numrin e kodit postar : ");
        int kodiP2 = in.nextInt();
        System.out.println("Jepni numrin e apartamentit : ");
        int nrapt = in.nextInt();
        Adresa banimi2 = new Adresa(nrS2, kodiP2, qytetit2,  shtetit2, rruge2, nrapt);

        System.out.println("\t\t\tBANESA E PARE");
        banimi.shfaqAdresen();
        System.out.println("\t\t\tBANESA E DYTE");
        banimi2.shfaqAdresen();
        System.out.println("Numri i apartamentit : "+nrapt);

        if (banimi.comesBefore(kodiP2)==true){
            System.out.println("\n\tAdresa e shtepise se pare vjen perpara adreses se shtepise se dyte .");
        }
        else{
            System.out.println("\n\tAdresa e shtepise se dyte vjen perpara adreses se shtepise se pare .");
        }
    }
}
