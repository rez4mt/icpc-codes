package com.Judges.CodeForce.CF1324;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            HashMap<Integer,Integer> read = new HashMap<>();
            boolean flag = false;
            for (int i = 0; i < N ; i++) {
                int x = sc.nextInt();
                if(!read.containsKey(x))
                {
                    read.put(x , i);
                }else if (i-read.get(x)!=1)
                {
                    flag = true;
                }
            }
            System.out.println(flag?"YES":"NO");
        }
    }
}
