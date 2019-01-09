package com.Judges.uri;

import java.util.Scanner;

public class P1080 {
    public P1080()
    {
        Scanner sc = new Scanner(System.in);
        int pos = 0 ,max,num;
        max = sc.nextInt();
        for(int i = 1 ; i <100;i++)
        {
            num = sc.nextInt();

            if(Math.max(max,num) != max)
            {
                pos = i+1;
                max = num;
            }
        }
        System.out.printf("%d\n%d\n",max,pos);
    }

    public static void main(String[] args) {
        new P1080();
    }
}
