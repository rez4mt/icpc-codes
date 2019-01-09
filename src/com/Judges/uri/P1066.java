package com.Judges.uri;

import java.util.Scanner;

public class P1066 {
    public static void main(String[] args) {
        new P1066();
    }
    public P1066()
    {
        int odd= 0,even = 0,pos =0,neg =0;
        Scanner sc = new Scanner(System.in);
        int num ;
        for(int i = 0 ;i < 5 ; i++)
        {
            num = sc.nextInt();
            if(num%2 == 0)
                even++;
            else
                odd++;

            if(num>0)
                pos++;
            else if(num<0)
                neg++;
        }
        System.out.printf("%d valor(es) par(es)\n",even);
        System.out.printf("%d valor(es) impar(es)\n",odd);
        System.out.printf("%d valor(es) positivo(s)\n",pos);
        System.out.printf("%d valor(es) negativo(s)\n",neg);
    }
}
