package com.Judges.uri;

import java.util.Scanner;

public class P1072 {
    public P1072()
    {
        int in = 0,out = 0,num;
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        for(int i = 0 ; i < l ; i++)
        {
            num = sc.nextInt();
            if(num>=10 && num<=20)
                in++;
            else
                out++;
        }
        System.out.printf("%d in\n",in);
        System.out.printf("%d out\n",out);
    }

    public static void main(String[] args) {
        new P1072();
    }
}
