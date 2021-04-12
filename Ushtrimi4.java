//Ndërtoni një metodë që modifikon një Array list me stringje, duke zhvendosur të gjitha stringjet që
//fillojnë me shkronjë të madhe në fillim, pa ndryshuar renditjen e elementëve të tjerë.
package com.seminar7;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;
public class Ushtrimi4 {

    public static void main(String [] arg){
        Scanner in = new Scanner(System.in);
        System.out.println("Sa stringje doni te vendosni : ");
        int n = in.nextInt();
        ArrayList<String> lista = new ArrayList(n);
        for (int i=0; i<n; i++){
            String s = in.next();
            lista.add(s);
        }
        ArrayList<String>listaERenditur = new ArrayList<>();
        ArrayList<String>listaERenditur2 = new ArrayList<>();
        System.out.println(lista);

        for (int i=0; i<n; i++){
            if (lista.get(i).charAt(0)==(lista.get(i).toUpperCase().charAt(0))){
                //listaERenditur.get(i);
                String s = lista.get(i);
                listaERenditur.add(s);
            }
            else{
                String s = lista.get(i);
                listaERenditur2.add(s);
            }
        }
        listaERenditur.addAll(listaERenditur2);
        System.out.println("Lista e renditur : "+listaERenditur);

    }
}
