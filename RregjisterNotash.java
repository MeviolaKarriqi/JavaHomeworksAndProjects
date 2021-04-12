package com.com.seminar9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

 class Rregjister{
    private ArrayList<String> emra;
    private ArrayList<Integer> nota;

    public  Rregjister(){
        this.emra = new ArrayList<>();
        this.nota = new ArrayList<>();
    }
    public Rregjister(ArrayList<String> e , ArrayList<Integer> n){
        this.emra = e;
        this.nota = n;
    }

    public int getNotat(String emri){
        if (this.emra.contains(emri)){
            int n = this.emra.indexOf(emri);
            return this.nota.get(n);
        }
        else{
            return-1;
        }
    }
    public void setNota(String e, int n){
        if (this.emra.contains(e)){
            int r = this.emra.indexOf(e);
            this.nota.set(r,n);
            System.out.println("Nota e ndryshuar eshte : "+this.nota.get(r));
        }
        else{
            System.out.println("Emri i studentit nuk gjendet ne liste per te bere ndryshimin. ");
        }
    }
    public void shtoNote(String emrii, int notaa){
        if(this.emra.contains(emrii)){
            this.emra.add(emrii);
            this.nota.add(notaa);
        }
    }
    public float notaMesatare(){
        float shuma = 0;
        for (int i=0; i<this.nota.size(); i++){
            shuma = shuma+ this.nota.get(i);
        }
        return shuma/this.nota.size();
    }
    public ArrayList<String> ktheEmrat(int not){
        ArrayList<String> emraa = new ArrayList<>();
        for(int i=0; i<this.nota.size(); i++){
            if (this.nota.get(i)==not){
                emraa.add(this.emra.get(i));
            }
        }
        return emraa;
    }
    public ArrayList<String> emraTest(int max, int min ){
        ArrayList<String> emraa = new ArrayList<>();
        for (int i=0; i<this.nota.size(); i++){
            if (this.nota.get(i)>=min && this.nota.get(i)<=max){
                emraa.add(this.emra.get(i));
            }
        }
        return emraa;
    }
}
public class RregjisterNotash {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Vendos fjalen : ");
        String s = in.next();
        ArrayList<String> emra = new ArrayList<>();
        ArrayList<Integer> nota = new ArrayList<>();
        String d = "ndalo";
        while(!d.equalsIgnoreCase(s)){
            System.out.println("Vendos fjalen : ");
            System.out.println("Vendos emrin : ");
            s=in.next();
            emra.add(s);
            System.out.println("Vendos noten: ");
            int not = in.nextInt();
            nota.add(not);
        }
        Rregjister rregjister = new Rregjister(emra, nota);
        System.out.println("Vendos emrin e studentit : ");
        String emr = in.next();
        System.out.println("Vendos noten : ");
        int n= in.nextInt();
        rregjister.setNota(emr,n);
    }
}
