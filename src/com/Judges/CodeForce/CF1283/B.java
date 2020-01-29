package com.Judges.CodeForce.CF1283;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            long N = sc.nextLong();
            long K = sc.nextLong();
            if(N%K == 0)
            {
                System.out.println(N);
                continue;
            }
            if(K >= N)
            {
                System.out.println(Math.min(N , K/2));
            }else
            {
                long div = N / K;
                long ans = K  * div;
                long rem = N % K;
                ans += Math.min(rem , K/2);
                System.out.println(ans);
            }
        }

    }
}