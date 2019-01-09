package com.Judges.uri;

import java.util.Scanner;

public class P1131 {
    public P1131()
    {
        Scanner sc = new Scanner(System.in);
        int[] wins = new int[2];
        int a,b,c=0;
        while (true)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            c++;
            if(a > b)
                wins[0]++;
            else if( b > a)
                wins[1]++;
            System.out.println("Novo grenal (1-sim 2-nao)");
            if(sc.nextInt() == 2)
                break;
        }
        System.out.printf("%d grenais\n",c);
        System.out.printf("Inter:%d\n",wins[0]);
        System.out.printf("Gremio:%d\n",wins[1]);
        System.out.printf("Empates:%d\n",c-(wins[1]+wins[0]));
        if(wins[0]>wins[1])
            System.out.println("Inter venceu mais");
        else if(wins[1]>wins[0])
            System.out.println("Gremio venceu mais");
        else
            System.out.println("Não houve vencedor");
    }
    public static void main(String[] args) {
        new P1131();
    }
}
