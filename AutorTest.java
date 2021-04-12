//Ndërtoni klasat e mëposhtme:
//a. Ndërtoni klasën Autor që përmban:
//i. Variablat e instancës emër (String), email(string), gjinia (char ‘m’ose ‘f’)
//ii. Konstruktor për të inicializuar variablat e instancës
//iii. Metodat aksesuese dhe ndryshuese merrEmër(), merrEmail(), vendosEmail(),
//merrGjinia().
//iv. Metodën toString()
//b. Ndërtoni klasën testuese AutorTest


package com.seminari10;
import java.util.Scanner;

class Autor{
    private String emer;
    private String email;
    private char gjinia;
    Autor(String emr, String em, char gj){
        this.emer =emr;
        this.email = em;
        this.gjinia = gj;
    }
    public String getEmer(){
        return emer;
    }
    public void setEmer(String emri){
        this.emer = emri;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String emaill){
        this.email = emaill;
    }
    public char getGjinia(){
        return gjinia;
    }
    public void setGjinia(char gjin){
        this.gjinia = gjin;
    }

    public String toString(){
        return("Emri i autorit : "+this.emer + " \tEmali : "+this.email +" \tGjinia : "+this.gjinia);
    }
}
public class AutorTest {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Vendosni emrin e autorit : ");
        String emri = in.next();
        System.out.println("Vendosni emailin e autorit : ");
        String emaili = in.next();
        System.out.println("Vendosni gjinine e autorit : ");
        char gjinia = in.next().charAt(0);
        Autor autor = new Autor(emri, emaili, gjinia);
        autor.setEmer(emri);
        autor.setEmail(emaili);
        autor.setGjinia(gjinia);
        System.out.println("Informacioni i autorit");
        System.out.println(autor);
    }
}