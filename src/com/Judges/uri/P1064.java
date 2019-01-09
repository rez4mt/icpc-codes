package com.Judges.uri;

import java.util.Scanner;

public class P1064 {
    public P1064()
    {

        double sum =0,num ;
        int count =0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<6 ; i++)
        {
            num = sc.nextDouble();
            if(num>0)
            {
                sum+=num;
                count++;
            }
        }
        System.out.printf("%d valores positivos\n",count);
        System.out.printf("%.1f\n",sum/count);
    }
    public static void main(String[] args) {
        new P1064();
    }
}
