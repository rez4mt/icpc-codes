package com.Judges.kattis;

import java.util.*;

public class server {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int sum = 0 ;
        for(int i = 0 ; i < N ;  i++)
        {
            sum += sc.nextInt();
            if(sum>T)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println(N);

    }
}
