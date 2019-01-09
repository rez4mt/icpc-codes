package com.Judges.uri;

import java.util.Scanner;

public class P1040 {
    public P1040()
    {
        Scanner sc = new Scanner(System.in);
        float a,b,c,d;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d = sc.nextFloat();
        float av = ((a*2)+(b*3)+(c*4)+d)/10;
        System.out.printf("Media: %.1f\n",av);
        if(av >= 7)
            System.out.println("Aluno aprovado.");
        else if(av<5)
        {
            System.out.println("Aluno reprovado.");
        }else if(av >= 5 && av<=6.9){
            System.out.println("Aluno em exame.");
            float ex = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f\n",ex);
            av = (av+ex)/2f;
            if(av>= 5)
                System.out.println("Aluno aprovado.");
            else if(av <=4.9)
                System.out.println("Aluno reprovado.");
            System.out.printf("Media final: %.1f\n",av);
        }
    }
    public static void main(String[] args) {
        new P1040();
    }
}
