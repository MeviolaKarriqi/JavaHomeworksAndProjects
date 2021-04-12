//Ndërtoni një program i cili pasi lexon disa Stringje nga përdoruesi i rendit ato nga ana leksikore
//duke i vendosur në vendin e duhur në një arraylist. Përdoruesi përcakton fundin e stringjeve
//nëpërmjet numrit -1.
//Për shembull nëse stringjet janë:
//Sonja
//Ralf
//Tani
//Artan
//Atëherë arraylist duhet të rritet si më poshtë:
//[Empy]
//[Sonja]
//[Ralf, Sonja]
//[Ralf, Sonja,Tani]
//[Artan, Ralf, Sonja,Tani]
package com.seminar7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ushtrimi8 {
    public static  void main(String [] args){
        ArrayList<String> list1=new ArrayList<>();

        Scanner in = new Scanner(System.in);
        String opsioni = "-1";
        {
            do {
                System.out.print("Vendosni elementin per listen e pare : ");
                list1.add(in.next());
                System.out.println("Ne qofte se doni te vazhdoni te shtoni elemente ne listat tuaja vendosni 'po' ne te kundert vendosni '-1': ");
                opsioni= in.next();
            }while (!opsioni.equals("-1"));
            if (opsioni.equals("-1")){
                for (int i=0; i<list1.size(); i++){
                    list1.get(i);
                }
                System.out.println(list1);

                Collections.sort(list1);
                for (int i=list1.size()-1; i>0; i--){
                    System.out.println(list1.get(i));
                }
                System.out.println("Lista me elementet e renditur : "+list1);
            }
        }
    }
}
