package com.Judges.CodeForce.CF1293;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class A {
    static int s ;
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            s = sc.nextInt();
            int k = sc.nextInt();
            HashSet<Integer> closed = new HashSet<>();

            for(int i = 0 ; i < k ; i++)
                closed.add(sc.nextInt());
            int mv = 0 ;
            while (true)
            {
                int mr = s+mv;
                int ml = s-mv;
                if(mr<=n)
                {
                    if(!closed.contains(mr))
                    {
                        System.out.println(mv);
                        break;
                    }
                }
                if(ml>0)
                {
                    if(!closed.contains(ml))
                    {
                        System.out.println(mv);
                        break;
                    }
                }
                mv++;
            }
        }
    }

}
