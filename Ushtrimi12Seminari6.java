//Ndërtoni një metodë që llogarit mesataren e vlerave të fqinjëve të një tabele dydimensionale
//sipas tetë drejtimeve.
//public static double neighborAverage(int[][] values, int row, int column)
//nëse rreshti dhe kolona janë të dyja 0, atëherë do të kemi tre fqinj.

package com.seminar7;

import java.util.Scanner;

public class Ushtrimi12Seminari6 {

    public static  double gjejMesataren(double [][] vek){
        double shuma=0;
        int count =0;
        for (int i=0; i< vek.length; i++){
            for (int j=0; j< vek[i].length; j++){
                if (i==0){
                    shuma=shuma + vek[i][j];
                    count++;
                }
                else if (i==vek.length-1){
                    shuma = shuma + vek[i][j];
                    count++;
                }
                else if (j==0 && (i!=0) &&  (i!= vek.length-1)){
                    shuma=shuma+vek[i][j];
                    count++;
                }
                else if ((j==vek[i].length-1) && (i!=0) && (i!= vek.length-1)){
                    shuma = shuma + vek[i][j];
                    count++;
                }
            }
        }
        double mes=shuma/count;
        return mes;
    }

    public static void main(String [] arg){
        Scanner in = new Scanner(System.in);
        //mbushja e matices
        System.out.println("Vendosni permasat e matrices tuaj : ");
        int m= in.nextInt();
        int n= in.nextInt();
        System.out.println("Vendosni elemenetet per te mbushur matricen : ");
        double a[][] = new double[m][n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                a[i][j]=in.nextDouble();
            }
        }
        //Afishimi i matrices
        System.out.println("Matrica qe ju dhate eshte : ");
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print(a[i][j]+"\t\t");
            }
            System.out.print("\n");
        }
        double mes = gjejMesataren(a);
        System.out.println("Mesatarja e fqinjeve eshte : "+mes);
    }
}
