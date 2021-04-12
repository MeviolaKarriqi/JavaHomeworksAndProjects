//Ndërtoni klasën abstrakte Forma që do të ruajë nr e brinjëve. Ndërtoni konstruktorin me
//parametra, metodën merrNumërbrinjësh dhe metodat abstrakte merrSipërfaqe(),
//merrPerimetër(). Ndërtoni klasën Drejtkëndësh që trashëgon nga klasa Forma. Klasa Drejtkëndësh
//do të ruajë gjatësi dhe gjerësi të drejtkëndëshit. Ndërtoni konstruktorin e dhe metodat përkatëse
//të klasës Drejtkëndësh.
package com.seminari10;

abstract class Forma {
    private double lartesia;
    private double gjeresia;

    public void setVlerat(double lartesia, double gjeresia) {
        this.lartesia = lartesia;
        this.gjeresia = gjeresia;
    }

    public double getLartesia() {
        return lartesia;
    }

    public double getGjeresia() {
        return gjeresia;
    }

    public abstract double getSip();
}
class Drejtkendeshi extends Forma {
    public double getSip(){
        return getLartesia() * getGjeresia();
    }
}
class Trekendeshi extends Forma {
    public double getSip(){
        return (getLartesia() * getGjeresia()) / 2;
    }
}
public class Ushtrimi5 {
    public static void main(String[] args) {
        Forma forma;

        Drejtkendeshi drejt = new Drejtkendeshi();

        forma = drejt;

        forma.setVlerat(25, 27);

        System.out.println("Siperfaqja e drejtkeneshit : " + forma.getSip());

        Trekendeshi trek = new Trekendeshi();

        forma = trek;

        forma.setVlerat(36,62);

        System.out.println("Siperfaqja e trekendeshit : " + forma.getSip());
    }
}
