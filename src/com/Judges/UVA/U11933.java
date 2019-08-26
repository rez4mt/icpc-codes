package com.Judges.UVA;

import java.util.Scanner;

public class U11933 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0 ;
        while( sc.hasNext())
        {
            N = sc.nextInt();
            if(N == 0)
                break;
            int a = 0 ;
            int b = 0 ;
            boolean first = true;
            for(int i = 0 ; i < 32 ; i++)
            {
                if(((1<<i) & N) != 0)
                {
                    if(first)
                    {
                        a = (a | (1<<i));
                    }else
                    {
                        b = (b | (1<<i));
                    }
                    first = !first;
                }
            }
            System.out.println(a+" "+b);
        }

    }
}
