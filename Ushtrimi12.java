package com.seminar6;
import java.util.Scanner;
public class Ushtrimi12 {
    public static void main (String [] arg){

    //Creating Scanner class object
    Scanner input = new Scanner(System.in);
    //Temporary array for storing numbers.
    int temp[] = new int[525];
    //Some temp variables
    int i=0;
    int j=0;

    //Reading numbers for magic square.
        do{
        System.out.println("Please enter the number (Enter -1 to stop reading)");
        i=input.nextInt();
        temp[j]=i;
        j++;
    }while(i!=-1);
    j--;

    //Checking wether entered number are n^2 or not.
    int n=(int)Math.sqrt(j);
        if(Math.sqrt(j)!=n){
        System.out.println("Insufficient numbers.");
        return;
    }

    //Performing further operations
        System.out.println("User enters n^2 numbers.");
    //Creating magic square like a matrix
    int k=0;
    int mat[][]=new int[n][n];
        for( i = 0; i < n; i++ ) {
        for( j = 0; j < n; j++ ) {
            mat[i][j]=temp[k];
            k++;
        }
    }

    //Printing the matrix on screen
        for( i = 0; i < n; i++ ) {
        for( j= 0; j < n; j++)
            System.out.print(mat[i][j]+" ");
        System.out.println();
    }

    //Checking for duplicate numbers
    int check=0;
    boolean flag=false;
    test: for( i = 0; i < n; i++ ) {
        for( j= 0; j < n; j++) {
            check=mat[i][j];
            for( k = 0; k < n; k++ ) {
                for(int l = 0; l < n; l++ ) {
                    if(check==mat[k][l] && (i!=k || j!=l)) {
                        flag=true;
                        break test;
                    }
                }
            }
        }
    }
        if(flag==true)
            System.out.println("Magic square has duplicate numbers.");
        else
                System.out.println("Magic square does not has duplicate numbers.");

    //Checking for magic square.
    magicSquare(mat,n);
}

    //Method for checking magic square.
    static void magicSquare(int arr[][],int num) {
        //some variables
        int sumRow[] = new int[num];
        int sumCol[] = new int[num];
        int sumDig[] = new int[2];
        boolean flag = false;

        //Adding rows and columns
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                sumRow[i] = sumRow[i] + arr[i][j];
                sumCol[i] = sumCol[i] + arr[i][j];
            }
        }

        //Adding diagonals
        for (int i = 0; i < num; i++) {
            sumDig[0] = sumDig[0] + arr[i][i];
            sumDig[1] = sumDig[1] + arr[i][num - i - 1];
        }

        //Checking for duplicate entries.
        int sum = sumDig[0];
        for (int i = 0; i < num; i++) {
            if ((sum == sumRow[i] && sum == sumCol[i]) && (sum == sumDig[1])) {
                flag = true;
            } else {
                flag = false;
            }
        }

        //Printing output
        if (flag)
            System.out.println("Magic square !!");
        else
            System.out.println(" It's not a magic square!!");
    }
}
