//Ndërtoni një program që gjeneron një sekuencë prej 20 numra rasti hedhjesh zari dhe afishon
//vlerat duke vendosur në kllapa numrat që përsëriten si më poshtë:
package com.seminar6;
import java.util.Random;
public class Ushtrimi9 {
    public static void kllapat(int arr[]){
        boolean perseriten = false;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                if(!perseriten){
                    perseriten = true;
                    System.out.print(" (");
                }
                System.out.print(arr[i] + " ");
            }
            else{
                System.out.print(arr[i] + " ");
                if(perseriten){
                    System.out.print(") ");
                    perseriten = false;
                }
            }
        }
        System.out.print(arr[arr.length-1] + " ");
        if(perseriten){
            System.out.print(") ");
        }
    }

    public static void main(String[] args) {
        Random ran = new Random();
        int []arr = new int [20];
        for(int i = 0;i<arr.length;i++){
            arr[i] = ran.nextInt(6)+1;
        }
        kllapat(arr);
    }
}
