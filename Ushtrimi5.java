//Ndërtoni një program që kërkon të gjithë skedarët në command line dhe afishon të gjithë rreshtat
//që përmbajnë një fjalë të caktuar. Për shembull, nëse inputet tuaja janë
//java Find ring report.txt address.txt Homework.java
//atëherë programi do të afishojë
//report.txt: has broken up an international ring of DVD bootleggers that
//address.txt: Kris Kringle, North Pole
//address.txt: Homer Simpson, Springfield
//Homework.java: String filename;
//Fjalët që kërkohen janë gjithmonë argumentet e para në command line.
package com.seminar8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ushtrimi5 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length < 2)
        {
            System.out.println(
                    "Usage: Find keyword sourcefile1 sourcefile2 . . .");
            return;
        }
        String keyword = args[0];
        for (int i = 1; i < args.length; i++)
        {
            String filename = args[i];
            FileReader reader = new FileReader(filename);
            Scanner in = new Scanner(reader);

            String line = in.nextLine();
            while(line != null)
            {

                if(line.indexOf(keyword) != -1)
                {
                    System.out.println(line);
                }
            }
        }
    }
}


/*
 public static void main(String[] args) throws FileNotFoundException {
        String input = args[0];
        for (int i = 1; i < args.length; i++) {
            System.out.println(" File  " + args[i]);
            File one = new File(args[i]);
            Scanner in = new Scanner(one);
            while (in.hasNext()) {
                String line = in.nextLine();
                if (line.contains(input)) {
                    System.out.println(line);
                }
            }
        }
    }
 */

/*

 */

/*
public static void main(String[] args) throws IOException
    {
        if (args.length < 2)
        {
            System.out.println(
                    "Usage: Find keyword sourcefile1 sourcefile2 . . .");
            return;
        }
        String keyword = args[0];
        for (int i = 1; i < args.length; i++)
        {
            String filename = args[i];
            FileReader reader = new FileReader(filename);
            Scanner in = new Scanner(reader);

            String line = in.nextLine();
            while(line != null)
            {

                if(line.indexOf(keyword) != -1)
                {
                    System.out.println(line);
                }
            }
        }
    }
 */