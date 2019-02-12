package com.Judges.uri;

import java.util.Scanner;

public class P1397 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int as = 0;
            int bs = 0;
            int T = sc.nextInt();
            if(T==0)
                break;
            while (T-->0)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(a>b)
                    as++;
                else if(b>a)
                    bs++;
            }
            System.out.printf("%d %d\n",as,bs);
        }

    }
}
