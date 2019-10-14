package com.Judges.CodeForce.CF1204;

import java.util.HashSet;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        int N , R , L ;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        L = sc.nextInt();
        R = sc.nextInt();
        int dif_nums = L ;
        long sum =  0 ;
        int nums = 0 ;
        while(dif_nums-->0)
        {
            sum += 1 << dif_nums ;
            nums++;
        }
        sum+= (N - nums);
        System.out.print(sum+" ");
        dif_nums = 0 ;
        nums = 0 ;
        sum = 0 ;
        while (dif_nums < R)
        {
            int cur = 1 << dif_nums;
            sum += cur ;
            dif_nums++;
            nums++;
        }
        sum += (N-nums) * (1<<(R-1));
        System.out.println(sum);

    }
}
