//Ndërtoni klasën Punonjës që ka një emër dhe pagë. Ndërtoni klasën Menaxher që trashëgon nga
//klasa Punonjës. Shtoni variablën e instancës departament të tipit String. Ndërtoni metodën
//toString që do të afishojë emrin e menaxherit, departamentin dhe pagën. Ndërtoni klasën
//Ekzekutiv që do të trashëgojë nga klasa Menaxher. Ndërtoni metodën toString në të gjitha klasat.
//Ndërtoni klasën testuese.
package com.seminari10;

import java.util.Scanner;

class Punonjes{
    private String emri;
    private double pagesa;

    public String getEmri(){
        return emri;
    }

    public void setEmri(String emr){
        this.emri = emr;
    }

    public Double getPagesa(){
        return pagesa;
    }

    public void setPagesa(Double pag){
        this.pagesa = pag;
    }

    public String toString() {
        return ("Emri "+this.emri + " dhe pagesa " + this.pagesa + " $");
    }
}

class Menaxher extends Punonjes{
    private String departamenti;

    public String getDepartamenti(){
        return departamenti;
    }

    public void setDepartamenti(String dep){
        this.departamenti = dep;
    }

    public String toString(){
        return ("Departamenti "+ this.departamenti +" per punojesin "+ super.toString() );
    }
}

public class Ushtrimi2 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        Menaxher men  = new Menaxher();
        System.out.println("Vendosi emrin e punonjesit : ");
        String emer = in.next();
        System.out.println("Vendosi pagen e punonjesit : ");
        Double pagesa = in.nextDouble();
        System.out.println("Vendosi departamentin e punonjesit : ");
        String departamenti = in.next();
        men.setEmri(emer);
        men.setPagesa(pagesa);
        men.setDepartamenti(departamenti);
        System.out.println("Informacioni per punonjesin : ");
        System.out.println(men);
    }
}