package com.Judges.UVA;

import java.util.Scanner;

public class U591 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sN = 1;
        while (true)
        {
            int N = sc.nextInt();
            if(N == 0)
                break;
            System.out.printf("Set #%d\n",sN++);
            int[] list = new int[N];
            long sum = 0;
            for(int i = 0 ; i < N ; i++)
            {
                list[i] = sc.nextInt();
                sum += list[i];
            }
            long avg = (sum / N) + (sum%N==0?0:1);
            long count = 0;
            for(int i = 0 ; i < N ; i++)
            {
                if(list[i] == avg)
                    continue;
                count+= Math.abs(list[i]-avg);
            }

            System.out.printf("The minimum number of moves is %d.\n",count/2);
            System.out.println();
        }
    }
}
