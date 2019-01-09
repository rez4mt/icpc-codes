package com.ICPC.Sharif.P96;

import java.util.Arrays;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a,b,c,d;
        String to_check = "";
        int[] card_num = new int[16];
        int n;
        while (true)
        {
            a = sc.next()+sc.next()+sc.next()+sc.next();;
            if(a.equals("0000000000000000"))
                break;
            for(int i = 0 ; i <16;i++)
            {
                n=Integer.valueOf(a.substring(i,i+1));
                card_num[i] = (i+1)%2==0?n:((n*2)%9);
            }
            n = 0;
            for(int i = 0 ; i < 16 ; i++)
            {
                n+= card_num[i];
            }
            if(n%10 == 0)
                System.out.println("Yes");
            else System.out.println("No");

        }
    }
}
