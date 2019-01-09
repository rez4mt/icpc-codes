package com.Judges.uri;

import java.util.Scanner;

public class P1050 {
    public static void main(String[] args) {
        new P1050();
    }
    public P1050()
    {
        Scanner sc = new Scanner(System.in);
        String val = "";
        switch (sc.nextInt())
        {
            case 61:
                val = "Brasilia";
                break;
            case 71:
                val = "Salvador";
                break;
            case 11:
                val = "Sao Paulo";
                break;
            case 21:
                val = "Rio de Janeiro";
                break;
            case 32:
                val = "Juiz de Fora";
                break;
            case 19:
                val = "Campinas";
                break;
            case 27:
                val = "Vitoria";
                break;
            case 31:
                val = "Belo Horizonte";
                break;
            default:
                val = "DDD nao cadastrado";
                break;
        }
        System.out.printf("%s\n",val);


    }
}
