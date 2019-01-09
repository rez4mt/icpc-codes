package com.Judges.uri;

import java.util.Scanner;

public class P1179 {
    public static void main(String[] args) {
        new P1179();
    }
    public P1179()
    {
        int[] odd = new int[5];
        int[] even = new int[5];
        int odd_count = 0;
        int even_count = 0;
        Scanner sc = new Scanner(System.in);
        int num ;
        for(int i = 0 ; i < 15;i++)
        {
            num = sc.nextInt();
            if(num%2 == 0)
            {
                if(even_count == 5)
                {
                    //print out;
                    for(int j = 0 ; j < 5 ; j++)
                        System.out.printf("par[%d] = %d\n",j,even[j]);
                    even_count = 0;
                }
                even[even_count] = num;
                even_count++;
            }else
            {
                if(odd_count == 5)
                {
                    //print out;
                    for(int j = 0 ; j < 5 ; j++)
                        System.out.printf("impar[%d] = %d\n",j,odd[j]);
                    odd_count = 0;
                }
                odd[odd_count] = num;
                odd_count++;
            }
        }
        for(int i = 0 ; i < odd_count ; i++)
            System.out.printf("impar[%d] = %d\n",i,odd[i]);
        for(int i = 0 ; i < even_count ; i++)
            System.out.printf("par[%d] = %d\n",i,even[i]);
    }
}
