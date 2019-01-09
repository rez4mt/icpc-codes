package com.Judges.uri;

import java.util.Scanner;

public class P1159 {
    public static void main(String[] args) {
        new P1159();
    }

    public P1159()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s ,c;
        while (n != 0)
        {
            s = 0;
            c = 0;
            for(int i = n;;i++)
            {
                if(i%2 == 0)
                {
                    s+=i;
                    c++;
                }
                if(c == 5)
                    break;
            }
            System.out.printf("%d\n",s);
            n = sc.nextInt();
        }
    }
}
