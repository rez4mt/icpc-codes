package com.Judges.uri;

import java.util.Scanner;

public class P1060 {
    public P1060()
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i< 6;i++)
        {
            if(sc.nextDouble()>0)
                count++;
        }
        System.out.printf("%d valores positivos\n",count);
    }

    public static void main(String[] args) {
        new P1060();
    }
}
