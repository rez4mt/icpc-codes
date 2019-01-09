package com.Judges.uri;

import java.util.Scanner;

public class P1101 {
    public P1101()
    {
        int n1,n2,min,max,sum;
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            n1 = sc.nextInt();
            n2 = sc.nextInt();

            if(n1<=0 || n2 <= 0 )
                break;
            min = Math.min(n1,n2);
            max = Math.max(n1,n2);
            sum = 0;
            for(int i = min; i <= max ; i++)
            {
                sum += i;
                System.out.printf("%d ",i);
            }
            System.out.printf("Sum=%d\n",sum);

        }
    }
    public static void main(String[] args) {
        new P1101();
    }
}
