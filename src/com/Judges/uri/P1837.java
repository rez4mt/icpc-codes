package com.Judges.uri;

import java.util.Scanner;

public class P1837 {
    public static void main(String[] args) {
        new P1837();
    }

    public P1837()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int div = a/b;
        int r = a%b;
        if(r<0)
        {
            if(b>0)
                div--;
            else div++;
            r += Math.abs(b);
        }
        System.out.printf("%d %d\n",div,r);

    }
}
