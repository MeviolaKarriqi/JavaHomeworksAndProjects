//Implementoni klasën Student. Studenti ka emrin dhe numrin total të pikëve në quiz. Ndërtoni
//konstruktorin dhe metodat getName (), addQuiz(int score), getTotalScore () dhe
//getAverageScore(). Ju duhet të ruani dhe numrin e quiz-eve qe ka kryer studenti. Testoni klasën
//Student.
package com.com.seminar9;

import java.util.Scanner;

class Student{
    private String emriStudentit;
    private int piketEQuiz;
    private int nrIQuiz;
    Student(String emri){
        this.emriStudentit = emri;
        this.piketEQuiz = 0;
        nrIQuiz = 0;
    }
    public String merrEmrin(){
        return emriStudentit;
    }
    public void shtoQuiz(int piket){
        this.piketEQuiz+=piket;
        nrIQuiz++;
    }
    public int shumaEPikeve(){
        return piketEQuiz;
    }
    public double mesatarjaEPikeve(){
        return (double) piketEQuiz/nrIQuiz;
    }
}

public class Ushtrimi2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vendosni emrin e studentit : ");
        String emer = in.next();
        Student student = new Student(emer);
        System.out.println("Vendosni piket qe u fituan ne quizin e pare : ");
        int quiz1 = in.nextInt();
        student.shtoQuiz(quiz1);
        System.out.println("Vendosni piket qe u fituan ne quizin e dyte : ");
        int quiz2 = in.nextInt();
        student.shtoQuiz(quiz2);
        System.out.println("Vendosni piket qe u fituan ne quizin e trete : ");
        int quiz3 = in.nextInt();
        student.shtoQuiz(quiz3);
        System.out.println("Vendosni piket qe u fituan ne quizin e katert : ");
        int quiz4 = in.nextInt();
        student.shtoQuiz(quiz4);
        System.out.println("Vendosni piket qe u fituan ne quizin e peste : ");
        int quiz5 = in.nextInt();
        student.shtoQuiz(quiz5);
        System.out.println("Student : "+student.merrEmrin());
        System.out.println("Piket totale te fituara ne quize : "+student.shumaEPikeve());
        System.out.println("Mesatarja e pikeve te fituara ne quize : "+student.mesatarjaEPikeve());

    }
}
