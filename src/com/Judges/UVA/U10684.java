package com.Judges.UVA;

import java.util.Scanner;

public class U10684 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int N = sc.nextInt();
            if(N == 0)
                break;
            int[] Ns = new int[N];
            for(int i = 0 ; i < N ; i++)
                Ns[i] = sc.nextInt();

            int sum = 0;
            int max = 0;
            boolean min = false;
            for(int i = 0 ; i < N ; i++)
            {
                sum+=Ns[i];
                if(sum > max)
                {
                    max = sum;
                }else if( sum < 0)
                {
                    min = true;
                    sum = 0;
                }
            }
            if(sum == 0 && min)
            {
                System.out.println("Losing streak.");
            }else
                System.out.printf("The maximum winning streak is %d.\n",max);
        }
    }
}
