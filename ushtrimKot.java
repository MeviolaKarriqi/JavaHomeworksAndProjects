package com.com.seminar9;

import java.util.Scanner;

class Studenti{
    private String emri;
    private String mbiemri;
    private String grupi;

    public Studenti(){
        emri = "";
        mbiemri = "";
        grupi = "";
    }
    public Studenti(String e, String m, String g){
        this.emri = e;
        this.mbiemri = m;
        this.grupi = g;
    }
    public String getEmri(){
        return emri;
    }
    public String getMbiemri(){
        return mbiemri;
    }
    public String getGrupi(){
        return grupi;
    }
    public void setEmri(String emrii){
        this.emri = emrii;
    }
    public void setMbiemri(String mbiemrii){
        this.mbiemri = mbiemrii;
    }
    public void setGrupi(String grupii){
        this.grupi = grupii;
    }

    public String toString(){
        return (" "+this.emri+" "+this.mbiemri +" "+ this.grupi );
    }
}

public class ushtrimKot {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String emri, mbiemri, grupi;
        System.out.println("Vendosni emrin e studentit : ");
        emri = in.next();
        System.out.println("Vendosni mbiemrin e studentit : ");
        mbiemri = in.next();
        System.out.println("Vendosni grupin e studentit : ");
        grupi = in.next();
        Studenti studenti = new Studenti(emri, mbiemri, grupi);
        System.out.println(studenti.toString());
    }
}

