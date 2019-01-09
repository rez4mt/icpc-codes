package com.Judges.uri;

import java.util.Scanner;

public class P1114 {
    public P1114()
    {
        Scanner sc = new Scanner(System.in);
        while (!sc.next().equals("2002"))
            System.out.println("Senha Invalida");

        System.out.println("Acesso Permitido");
    }
    public static void main(String[] args) {
        new P1114();
    }
}
