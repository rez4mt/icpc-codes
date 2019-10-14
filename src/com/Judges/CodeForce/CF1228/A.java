package com.Judges.CodeForce.CF1228;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int l = Integer.valueOf(st.nextToken());
        int r = Integer.valueOf(st.nextToken());
        int[] frq = new int[10];
        boolean flag2 = false;
        for(int i = l ; i <= r ;i++)
        {


            for(int j = 0 ; j < 10 ; j++)
                frq[j] = 0 ;
            int mi = i ;
            boolean flag = true;
            while (mi >= 10)
            {
                int c = mi % 10 ;
                if(frq[c]!=0)
                {
                    flag = false;
                    break;
                }
                frq[c]++;
                mi/=10;
            }

            if(!flag)
                continue;
            if(frq[mi]!=0)
                continue;

            System.out.println(i);
            flag2 = true;
            break;
        }
        if(!flag2)
            System.out.println("-1");
    }
}
