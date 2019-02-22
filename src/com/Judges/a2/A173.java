package com.Judges.a2;

import java.util.Scanner;

public class A173 {
    static int MAX = 20000001;
    static int[] mem ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        mem = new int[MAX];
        mem[1] = 0;
        mem[2] = 1;
        mem[3] = 1;

        for(int i = 4 ; i < MAX ; i++)
        {
            boolean two = i%2==0,three = i%3==0;
            if(two && !three)
            {
                mem[i] = Math.min(mem[i/2],mem[i-1])+1;
            }else if(three && !two)
            {
                mem[i] = Math.min(mem[i/3],mem[i-1])+1;
            }else if(three && two)
            {
                mem[i] = Math.min(Math.min(mem[i/3],mem[i/2]),mem[i-1])+1;
            }else mem[i] = mem[i-1]+1;

        }
        for(int i = 0 ; i < T ; i++)
        {
            int A = sc.nextInt();
            System.out.printf("Case %d: %d\n",i+1,mem[A]);
        }

    }


}
