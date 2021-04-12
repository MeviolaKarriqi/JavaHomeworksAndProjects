//Ndërtoni një program që vendos në array list 10 numra të rastësishëm nga 1 deri tek 10. Për të
//gjeneruar këtë, ju duhet të mbushni një tabelë me numra nga 1 deri në 10 duke pasur parasysh që
//dy vlera në tabelë nuk duhet të jenë të njëjta. Ky veprim do të bëhet derisa të gjenerohen numra
//random dhe të gjenerohet një vlerë që nuk ndodhet në tabelë. Por kjo gjë nuk është efiçiente. Për
//të realizuar kë program mund të ndiqni këtë algoritëm:
//Krijoni një tabelë të dytë më vlera nga 1 deri tek 10.
//Zgjidhni një element në mënyrë random nga tabela e dytë.
//Hiqeni elementin dhe vendoseni në tabelën me elementë të rastësishëm.

package com.seminar7;

import java.util.ArrayList;
import java.util.Random;

public class Ushtrimi1 {
    public static void main (String [] arg ){
        Random ratsesishem = new Random(10);
        ArrayList<Integer>ListaRastesishem1=new ArrayList<Integer>(10);
        ArrayList<Integer>ListaRastesishem2=new ArrayList<Integer>(10);
        ArrayList<Integer>ListaRastesishem3=new ArrayList<Integer>(10);
        for (int i=0; i<10; i++){
            ListaRastesishem1.add(ratsesishem.nextInt(10));
            ListaRastesishem2.add(ratsesishem.nextInt(10));

        }
        System.out.println("Lista e pare : "+ListaRastesishem1);
        for (int i=0; i<10; i++){

                if (ListaRastesishem1.get(i)== ListaRastesishem2.get(i)){
                    ListaRastesishem2.remove(i);
                }
                else{
                    ListaRastesishem3.add(i);
                }
            System.out.println("Lista e dyte : "+ListaRastesishem3);

        }
        //System.out.println("Lista e dyte : "+ListaRastesishem3);
    }

}
