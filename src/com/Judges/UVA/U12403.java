package com.Judges.UVA;

import java.util.*;

public class U12403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long ans = 0 ;
        while (T-->0)
        {
            String t = sc.next();
            if(t.equals("report"))
            {
                System.out.println(ans);
            }else
            {
                ans += sc.nextInt();
            }

        }
    }
}