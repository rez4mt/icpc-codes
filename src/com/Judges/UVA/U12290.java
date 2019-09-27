package com.Judges.UVA;

import java.util.Scanner;

public class U12290 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int N = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            if(N == 0 && m == 0 && k==0)
                break;
            int[] claps = new int[N+1];
            boolean increasing  = true;
            int count = 0 ;
            while (claps[m]<k)
            {

                for(int i = 1 ; i <=N; i++)
                {
                    count++;
                    if(clap(count))
                    {
                        claps[i]++;
                        if(claps[m] == k)
                            break;
                    }
                }
                if(claps[m] == k)
                    break;
                for(int i = N-1 ; i>1;i--)
                {
                    count++;
                    if(clap(count))
                    {
                        claps[i]++;
                        if(claps[m] == k)
                            break;
                    }

                }
            }
            System.out.println(count);
        }
    }
    public static boolean clap(int i)
    {
        if(i%7 == 0)
            return true;

        while (i!=0)
        {

            if(i%10 == 7)
                return true;
            i = i/=10;
        }
        return false;
    }
}
