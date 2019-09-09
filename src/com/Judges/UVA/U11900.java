package com.Judges.UVA;

import java.util.Arrays;
import java.util.Scanner;

public class U11900 {
    public static void main(String[] args) {
        Scanner
                sc = new Scanner(System.in);
        int T = sc.nextInt();
        int C = 1;
        while (T-->0) {
            int N = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int[] eggs = new int[N];
            for (int i = 0; i < N; i++)
            {
                eggs[i] = sc.nextInt();
            }
            int currentQ = 0 ;
            int taken = 0;
            Arrays.sort(eggs);
            for(int i = 0 ; i < N && taken  < P ;i++)
            {
                if(Q - currentQ < eggs[i])
                    break;
                taken++;
                currentQ+=eggs[i];
            }
            System.out.printf("Case %d: %d\n",C++,taken);
        }
    }
}
