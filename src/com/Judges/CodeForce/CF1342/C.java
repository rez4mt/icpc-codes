package com.Judges.CodeForce.CF1342;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int q = sc.nextInt();
            long[] ans = new long[q];
            int largest = Math.max(a , b);
            int lcm =(int) lcm(a,b);

            for(int i = 0 ; i < q ; i++)
            {
                long l = sc.nextLong();
                long r = sc.nextLong();
                ans[i] = r - l + 1;
                if(ans[i]!=0 && r > Math.max(a,b))
                {
                    int rem =  (int)( ans[i]  % lcm );
                    //rem = 30
                    long m = ans[i] - rem;
                    int count = (int) Math.ceil(ans[i]*1.d / lcm);
                    ans[i] -= count*Math.max(a,b) ;
                    
                }else ans[i] = 0 ;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < q ; i++)
            {
                sb.append(ans[i]);
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb);
        }
    }

    static long gcd(long a, long b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    static long lcm(long a , long b)
    {
        return a*1L*b/gcd(a,b);
    }


}
