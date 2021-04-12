package com.seminar6;

import java.util.ArrayList;
import java.util.Random;

public class ushtrimi4 {
    public static ArrayList<Integer> NrTeRastesishem1(int n){
        ArrayList<Integer>terastesishem=new ArrayList<Integer>(n);
        Random ratsesishem = new Random(10);

        for (int i=0; i<n; i++){
            Integer r  =ratsesishem.nextInt(10);
            terastesishem.add(r);
        }
        return terastesishem;
    }

    private static void PrintoArraylist1(ArrayList<Integer>arrayERastesishme){
        int n=arrayERastesishme.size();
        ArrayList<Integer>printoArraylist= new ArrayList<Integer>(n);
        for (int i=0; i<n; i++){
            int r =arrayERastesishme.get(i);
            printoArraylist.add(r);
        }
        System.out.println(printoArraylist);
    }

    public static ArrayList<Integer>NrTeRastesishem2(int n){
        ArrayList<Integer>terastesishem=new ArrayList<Integer>(n);
        Random ratsesishem = new Random(10);

        for (int i=0; i<n; i++){
            Integer r  =ratsesishem.nextInt(10);
            terastesishem.add(r);
        }
        return terastesishem;
    }

    private static void PrintoArraylist2(ArrayList<Integer>arrayERastesishme){
        int n=arrayERastesishme.size();
        ArrayList<Integer>printoArraylist= new ArrayList<Integer>(n);
        for (int i=0; i<n; i++){
            int r =arrayERastesishme.get(i);
            printoArraylist.add(r);
        }
        System.out.println(printoArraylist);
    }

    //static int a;
    public static void main(String [] arg){
        /*
        ArrayList nrRastesor = new ArrayList(10);
        Random rastesor = new Random(10);
        for (int i=0; i< nrRastesor.size(); i++){
            Integer a=rastesor.nextInt();
            nrRastesor.add(a);
        }
        System.out.println("Permbajtja e numrave rastesore : "+nrRastesor);
         */
        PrintoArraylist1(NrTeRastesishem1(10));
        PrintoArraylist2(NrTeRastesishem2(10));
    }
}
