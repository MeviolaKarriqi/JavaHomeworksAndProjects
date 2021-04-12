package com.com.seminar9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Fatura1{
    private String data;
    private ArrayList<String> artikuj;
    private ArrayList<Integer> sasia;
    private ArrayList<Integer> cmimet;

    Fatura1(String d, ArrayList<String> a, ArrayList<Integer> s, ArrayList<Integer> c){
        this.artikuj = a;
        this.sasia = s;
        this.cmimet = c;
        this.data=d;
    }
    public String getData(){
        return data;
    }
    public void setData(String dataa){
        this.data = dataa;
    }
    public void shtoArtikull( String artikulll, int sasii, int cmimmm){
        if (!artikuj.contains(artikulll)){
            this.artikuj.add(artikulll);
            this.sasia.add(sasii);
            this.cmimet.add(cmimmm);
        }
    }

    public void hiqArtikull(String artikulllll){
        int index = 0;
        for (int i = 0; i < artikuj.size(); i++) {
            if (artikuj.get(i) == artikulllll) {
                index = i;
                break;
            }
        }
        if (index == 0) {
            System.out.println("ky artikull nuk ndodhet ne liste");
        }
        artikuj.remove(index);
    }
    public void rendit(ArrayList<Integer> sasiaaa){
        Collections.sort(sasiaaa);
        for(int i=sasiaaa.size()-1; i>=0;i--){
            System.out.println(sasiaaa.get(i));
        }
    }
}
public class Fatura {
}
