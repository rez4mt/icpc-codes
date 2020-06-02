package com.Judges.CodeForce. CF1355;
import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
           long n = sc.nextLong();
           long k = sc.nextLong();
           while (k-->1)
           {
               int min = min(n);
               int max = max(n);
                if(min == 0)
                    break;
                n += min*max;
           }
            System.out.println(n);
        }
    }
    static int max(long a)
    {
        int max = 0 ;
        while (a!=0)
        {
            max = Math.max(max , (int)(a%10));
            a/=10;
        }
        return max;
    }
    static int min(long a)
    {
        int max = 9 ;
        while (a!=0)
        {
            max = Math.min(max , (int)(a%10));
            a/=10;
        }
        return max;
    }
}
