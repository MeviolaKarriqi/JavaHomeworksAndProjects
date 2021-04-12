//Një matrice n x nqë mbushet me numra 1 , 2, 3 ...., n2 është një katror magjik nëse shuma e
//elementëve në secilin rresht, në secilën kolonë dhe në dy diagonalet ka të njëjtën vlerë. Ndërtoni një
//program që lexon 16 vlera nga tastjera dhe teston nëse formohet katror magjik në një matricë 4x4. Ju
//duhet të kryeni testimet e mëposhtme:
//a) A ka dhënë përdoruesi numrat 1 ,2 , .....16?
//b) Kur numrat vendosen në matricë, a është shuma e rreshtave, kolonave dhe diagonaleve e
//barabartë?
//katrori magjik:
//1		15		14		4
//10		11		8		5
//7		6		9		12
//16		2		3		13

package com.seminar7;

import java.util.Scanner;

public class Ushtrimi13Seminari6 {

    public static boolean kaDublikime(int [][] katrori){
        for (int i=0; i<katrori.length ; i++){
            for (int j=0; j<katrori[i].length; j++){
                double kontrollo =katrori[i][j];
                for (int k=0; k<katrori.length; k++){
                    for (int l=0; l< katrori[i].length; l++){
                        if (kontrollo==katrori[k][l]){
                            if(i!=k || j!=l){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    static void eshteKatrorMagjik(int kat[][], int nr){
        int shumaRresht[] = new int[nr];
        int shumaKolon[] = new int[nr];
        int shumaDiagonal[] = new int[2];

        for (int i=0; i< nr; i++){
            for (int j=0; j<nr; j++){
                shumaRresht[i] = shumaRresht[i] + kat[i][j];
                shumaKolon[i]=shumaKolon[i]+kat[i][j];
            }
        }

        for (int i=0; i<nr; i++){
            shumaDiagonal[0]=shumaDiagonal[0]+ kat[i][i];
            shumaDiagonal[1]= shumaDiagonal[1] + kat[i][nr-i-1];
        }

        for (int i=0; i<nr; i++){
            if ((shumaDiagonal[0]==shumaRresht[i] && shumaDiagonal[0]==shumaKolon[i]) && (shumaDiagonal[0]==shumaDiagonal[1])){
                System.out.println("Katrori i dhene eshte nje katror magjik !");
            }
            else{
                System.out.println("Katrori i dhene nuk eshte nje katror magjik!");
            }
        }
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Vendosni permasat e katrorit magjik : ");
        int n= in.nextInt();
        int a[][] = new int[n][n];

        //mbushim matricen
        System.out.println("Vendosni elementet e katrorit magjik : ");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                a[i][j]=in.nextInt();
            }
        }

        //kontrollojme nqs katrori ka permasa 4x4
        if (n!=4){
            System.out.println("Katrori juaj magjik duhet ti kete permasat 4x4! ");
            return;
        }
        else {
            System.out.println("Katrori juaj magjik ka permasat 4x4! ");
        }

        //Afishimi i matrices
        System.out.println("Matrica qe ju dhate eshte : ");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(a[i][j]+"\t\t");
            }
            System.out.print("\n");
        }

        //kontollojme nqs ka dublikime
        boolean dublikime = kaDublikime(a);
        if (dublikime==true){
            System.out.println("Ne katrorin tuaj magjik ka elemente te dublikuara!");
            return;
        }
        else {
            System.out.println("Ne katrorin tuaj magjik nuk ka vlera te dublikuara!");
        }
        eshteKatrorMagjik(a,n);
    }
}
