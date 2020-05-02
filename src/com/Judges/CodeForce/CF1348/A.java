package com.Judges.CodeForce.CF1348;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            list.add(1<<i);
        }
        int T = sc.nextInt();
        while (T-->0)
        {
            long rsum = 0 ;
            long lsum = 0 ;
            int n = sc.nextInt();
            if(n == 2)
                System.out.println("2");
            else
            {
                rsum += list.get(n-1);
                for(int i = 0 ; i < (n/2)-1 ;i++)
                    rsum+=list.get(i);
                for(int i = (n/2)-1 ; i < n-1 ; i++)
                    lsum+=list.get(i);
                System.out.println(Math.abs(rsum-lsum));
            }
        }
    }
}
