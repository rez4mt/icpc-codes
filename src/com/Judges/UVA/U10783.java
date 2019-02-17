package com.Judges.UVA;

import java.util.Scanner;

public class U10783 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 0 ; t < T ; t++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            long sum = 0;
            for(int i = a; i <=b ;i++)
            {
                if(i%2==1)
                    sum+=i;
            }
            System.out.printf("Case %d: %d\n",t+1,sum);
        }
    }

}
