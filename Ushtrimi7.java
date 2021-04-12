//Ndërtoni një program i cili mbush dy array lista list1 dhe list2 derisa përdoruesi vendos -1 për të
//përfunduar. Për këtë ndërtoni një metodë që do të krijojë dy listat. Ndërtoni një metodë që merr
//si parametër list1 dhe list2 dhe kthen bashkimin e list1 me list2. Ndërtoni një metodë tjetër që
//merr si parametër list1 dhe kthen një arraylist të re që ka të njëjtat fjalë si list1 por nuk përmban
//elementët e përsëritur.
package com.seminar7;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ushtrimi7 {

    public static  void main(String [] args){
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        String opsioni = "po";
        {
            do {
                System.out.print("Vendosni elementin per listen e pare : ");
                list1.add(in.nextInt());
                System.out.println("Vendosni elementin per listen e dyte : ");
                list2.add(in.nextInt());
                System.out.println("Ne qofte se doni te vazhdoni te shtoni elemente ne listat tuaja vendosni 'po' ne te kundert vendosni '-1': ");
                opsioni= in.next();
            }while (!opsioni.equals("-1"));
            if (opsioni.equals("-1")){
                System.out.println("");
                for (int i=0; i<list1.size(); i++){
                    list1.get(i);
                    list2.get(i);
                }
                System.out.println("Lista e pare : "+list1);
                System.out.println("Lista e dyte : "+list2);

                list1.addAll(list2);
                System.out.println("Lista me elementet e bashkuar : "+list1);
                LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(list1);
                ArrayList<Integer>listERe = new ArrayList<>(hashSet);
                System.out.println("Lista e  pare pa dublikime : "+listERe);
                int m = listERe.size();
                System.out.println("elemete pa dublikime "+m);
            }
        }
    }
}
