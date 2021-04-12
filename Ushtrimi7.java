//Ndërtoni metodat statike
//public static double cylinderVolume(double r, double h)
//public static double cylinderSurface(double r, double h)
//të cilat llogarisin vëllimin dhe sipërfaqen e cilindrit. Vendosini ato në një klasë dhe më pas shkruani
//programin i cili kërkon nga përdoruesi vlerat e r dhe të h, thërret metodat dhe më pas afishon
//rezultatin.
package com.com.seminar9;

import java.util.Scanner;

class Cilinder{
    private double r;
    private double h;
    public Cilinder(double rrezja, double lartesia){
        r = rrezja;
        h = lartesia;
    }
    public double vellimi(){
        return h * Math.PI * r * r;
    }
    public double siperfaqe(){
        return (2.0 * r * Math.PI * h) + (2.0 * Math.PI * r * r);
    }
}

public class Ushtrimi7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Jepni rrezen: ");
        double r = in.nextDouble();
        System.out.println("Jepni lartesine: ");
        double h = in.nextDouble();
        Cilinder cilindri = new Cilinder(r, h);
        double vell = cilindri.vellimi();
        double sip = cilindri.siperfaqe();
        System.out.println("Vellimi i cilindrit eshte : " + vell);
        System.out.println("Siperfaqja e cilindrit eshte : " + sip);
    }
}
