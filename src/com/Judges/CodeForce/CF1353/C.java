package com.Judges.CodeForce. CF1353;
import java.math.BigInteger;
import java.util.*;
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            if(n == 1)
            {
                System.out.println(0);
                continue;
            }
            BigInteger ans = BigInteger.ZERO;
            while (n>1)
            {
                ans = ans.add(BigInteger.valueOf((n-1)*4l*(n/2l)));
                n-=2;
            }
            System.out.println(ans.toString());
        }
    }
}
