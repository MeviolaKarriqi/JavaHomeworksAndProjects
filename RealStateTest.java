package com.com.seminar9;

import java.util.ArrayList;
import java.util.Scanner;

class RealState{
    public ArrayList<String>emra;
    public ArrayList<Integer>cmime;

    RealState(ArrayList<String> e, ArrayList<Integer>c){
        this.emra = e;
        this.cmime = c;
    }
    RealState(){
        this.emra = new ArrayList<String>();
        this.cmime = new ArrayList<Integer>();
    }
    public void setEmra(ArrayList<String>emra){
        this.emra = emra;
    }
    public ArrayList<String> getEmra(){
        return this.emra;
    }
    public void setCmime(ArrayList<Integer>cmime){
        this.cmime = cmime;
    }
    public ArrayList<Integer> getCmime(){
        return this.cmime;
    }
    public void shtoPasuri (String emerPasuri, int cmimi){
        if (!emra.contains(emerPasuri)){
            emra.add(emerPasuri);
            this.cmime.add(cmimi);
        }
    }
    public void hiqPasuri (String emerPasuri){
        int index=0;
        for (int i=0; i<emra.size(); i++){
            if(emra.get(i).contains(emerPasuri)){
                index = i;
                System.out.println("Ky emer u hoq nga lista. ");
                break;
            }
        }
        if (index == -1){
            System.out.println("Ky emer nuk  eshte ne liste. ");
        }
        emra.remove(index);
        cmime.remove(index);
    }
    public boolean gjejPasuri(String emerPasuri){
        if (emra.contains(emerPasuri)){
            return true;
        }
        else{
            return false;
        }
    }
}

public class RealStateTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String>emra = new ArrayList<String>();
        ArrayList<Integer> cmime = new ArrayList<Integer>();
        String s = "";
        String d = "ndalo";
        while(!d.equalsIgnoreCase(s)){
            System.out.println("FILLO : ");
            System.out.println("Vendos emrin e pasurise : ");
            String str=in.next();
            emra.add(str);
            System.out.println("Vendos cmimin : ");
            int not = in.nextInt();
            cmime.add(not);
            System.out.println("Vendos fjalen : ");
            s=in.next();
        }
        RealState rs = new RealState(emra, cmime);
        rs.setCmime(cmime);
        rs.setEmra(emra);
        rs.shtoPasuri("Agimi", 131223);
        rs.hiqPasuri("Elsoni");
        System.out.println(rs.gjejPasuri("Ana"));
        System.out.println(rs.getEmra());
        System.out.println(rs.getCmime());
    }
}