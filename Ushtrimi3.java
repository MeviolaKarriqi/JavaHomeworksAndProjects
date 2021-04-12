//Implementoni një klasë Makina me karakteristikat e mëposhtme. Një makine ka një efiçiencë
//nafte dhe një sasi të caktuar nafte në motorr. Efiçienca përcaktohet në kostruktor dhe niveli
//fillestar i naftës është 0. Ndërtoni një metodë drive e cila simulon lëvizjen e makinës për një
//distancë të caktuar, duke zvogëluar sasinë e naftës në motorr. Gjithashtu ndërtoni metodat
//getGazInTank, për sasinë e mbetur të naftës dhe addGas për të shtuar naftën. Për shembull:
//Makina m = neë Makina (50); //50 milje per galon
//m.addGaz(20); // mbushet me 20 galon
//m.drive(100); // 100 milje lecizje
//double gasLeft =a.getGasInTank();
//Ndërtoni klasën MakinaTester e cila teston të gjitha metodat.
package com.com.seminar9;

import java.util.Scanner;

class Makina{
    private int sasiaENaftes;
    private int eficencaENaftes;

    public Makina(int eficenca){
        this.eficencaENaftes = eficenca;
        sasiaENaftes = 0;
    }
    public void shtoNafte(int nafte){
        sasiaENaftes = sasiaENaftes + nafte;
    }
    public void drive(int distanca){
        sasiaENaftes = sasiaENaftes - (distanca/eficencaENaftes);
    }
    public int niveliINaftes(){
        return sasiaENaftes;
    }
}
public class Ushtrimi3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vendosni eficencen e naftes ne makinen tuaj : ");
        int eficenca = in.nextInt();
        Makina auto = new Makina(eficenca);
        System.out.println("Vendosni sasine e naftes ne makinen tuaj : ");
        int nafte = in.nextInt();
        auto.shtoNafte(nafte);
        System.out.println("Vendosni distancen : ");
        int distance = in.nextInt();
        auto.drive(distance);
        System.out.println("Niveli i naftes i mbetur ne makinen tuaj eshte : "+auto.niveliINaftes());
    }
}
