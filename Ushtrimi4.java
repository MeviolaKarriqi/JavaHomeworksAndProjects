//Supozoni se kërkohet që të modeloni klasat Studentë dhe Lektor. Superklasa Person do të ruajë
//karakteristikat e përgjithshme si emër, adresë dhe subklasa Student dhe Lektor karakteristikat e
//vecanta. Për studentët duhet të ruhen lendet e ndjekura dhe notat respektive, të mund të shtohet
//një lënde sëbashku me notën, të afishohen të gjitha lëndët e ndjekura dhe nota mesatare.
//Supozohet se një student nuk do të ketë më shumë se 30 lëndë të ndjekura. Për Lektorin duhet të
//ruhen lëndët e dhëna, dhe të kemi mundësi të shtojmë ose heqim një lëndë nga lëndët qe jep
//Lektori. Supozohet që një lector nuk jep më shumë se 5 kurse.

package com.seminari10;
import java.util.ArrayList;
class Person{
    private String emri;
    private String adresa;
    Person(String emr, String adr){
        this.emri = emr;
        this.adresa = adr;
    }
    public String getEmri(){
        return emri;
    }
    public void setEmri(String emrii){
        this.emri = emrii;
    }
    public String getAdresa(){
        return adresa;
    }
    public void setAdresa(String adresaa){
        this.adresa = adresaa;
    }

    public String toString(){
        return("Emri i personit : " + this.emri + " \nAdresa e personit : " + this.adresa);
    }
}

class Studente extends Person{
    private int nrLendeve;
    private String [] lendet;
    private int [] notat;


    Studente(String emr, String adr) {
        super(emr, adr);
    }
}

class Lektor extends Person{

    Lektor(String emr, String adr) {
        super(emr, adr);
    }
}
public class Ushtrimi4 {
}
