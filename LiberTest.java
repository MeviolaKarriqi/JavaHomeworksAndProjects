//c. Ndërtoni klasën Libër duke supozuar që një libër është shkruar nga ekzaktësisht nga një
//autor dhe do të përmbajë:
//i. Variablat e instancës emër(String), autor(instance e klasës Autor), cmimi(double),
//sasia(int)
//ii. Metodat aksesuese dhe ndryshuese merrEmër(), merrAutor(), merrCmim(),
//vendosCmim(), merrSasi(), vendosSasi().
//iii. Metodën toString().
//d. Ndërtoni klasën testuese LibërTest

package com.seminari10;

import java.util.Scanner;

class Liber {
    private String  emerLibri;
    private Double cmimi;
    private int sasia;
    private  Autor autor;

    public String getEmerLibri(){
        return emerLibri;
    }
    public void setEmerLibri(String emrL){
        this.emerLibri = emrL;
    }
    public Double getCmimi(){
        return cmimi;
    }
    public void setCmimi(Double cmimii){
        this.cmimi = cmimii;
    }
    public int getSasia(){
        return sasia;
    }
    public void setSasia(int sasiaa){
        this.sasia = sasiaa;
    }
    public Autor getAutor(){
        return autor;
    }
    public void setAutor(Autor autorr){
        this.autor = autorr;
    }

    public String toString(){
        return ("Emri i librit : "+this.emerLibri+ " \nAutori i librit : "+ this.autor + " \nCmimi i librit : " + this.cmimi+" $" + " \nSasia : " + this.sasia);
    }
}

public class LiberTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Liber liber = new Liber();
        liber.setEmerLibri("Metamorfoza");
        Autor autor = new Autor("Kafka", "Kafka@gmail.com", 'M');
        liber.setAutor(autor);
        liber.setCmimi(300.21);
        liber.setSasia(12);
        System.out.println(liber);
    }
}
