package com.Judges.CodeForce.CF1293;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double ans = 0 ;
        System.out.printf("%.10f\n",check(N , 0));
        while (N>1)
        {
            double div = Math.floor(N/2d);

            ans+= (div/N);
            N-=div;
        }
        if(N >0)
            ans++;
        System.out.printf("%.10f",ans);

    }

   private static double check(int n , double v)
   {
       if(n == 0)
           return v;
       double max = Double.NEGATIVE_INFINITY;
       for(int i = 1 ; i <= n ;i++)
       {
            max = Math.max(max , check(n-i,v+(double)i/n));
       }
       return max;
   }

}
