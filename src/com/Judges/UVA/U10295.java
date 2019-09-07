package com.Judges.UVA;

import java.util.HashMap;
import java.util.Scanner;

public class U10295 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N , M ;
        N = sc.nextInt();
        M = sc.nextInt();
        HashMap<String,Integer> prices = new HashMap<>();
        for(int i = 0 ; i < N ; i++)
            prices.put(sc.next(),sc.nextInt());
        for(int i = 0 ; i < M ; i++)
        {
            long p = 0;
            String s = sc.next();
            while (!s.equals("."))
            {
                if(prices.containsKey(s))
                    p+=prices.get(s);
                s = sc.next();
            }

            System.out.println(p);
        }
    }
}
