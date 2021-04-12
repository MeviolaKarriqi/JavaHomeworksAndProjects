//Shkruani një program që kryen detyrat e mëposhtme:
//Hap skedarin me emrin hello.txt.
//Ruaj mesazhin “Hello World!” në skedar.
//Mbyll skedarin.
//Hap përsëri skedarin.
//Lexo mesazhin në një variabël string dhe afishojeni atë.
package com.seminar8;

import java.io.*;
import java.util.Scanner;

public class Ushtrimi1 {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System. in );
            File file = new File("hello.txt");
            FileOutputStream fos = new FileOutputStream(file, true);
            System.out.print("Vendosni permbajtjen e skedarit : ");
            String str = in.nextLine() + "\n";
            byte[] b = str.getBytes();
            fos.write(b);
            fos.close();
            BufferedReader br = new BufferedReader(new FileReader(file));
            System.out.println("Permbajtaja e skedarit : ");
            int lexo = 0;
            while ((lexo = br.read()) != -1) {
                System.out.print((char) lexo);
            }
        }
        catch(IOException e){
            System.out.println("Ka nje problem ");
            e.printStackTrace();
        }
    }
}