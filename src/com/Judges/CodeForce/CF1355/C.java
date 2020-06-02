package com.Judges.CodeForce. CF1355;
import java.util.*;
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;
        while (T-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            long ans = 0;
            for(int i = a ; i<=b;i++)
            {
                if(i + Math.max(b ,c - i +1 ) > d)
                {
                    int fl = b-i+1;
                    int sl = c - Math.max(b ,c - i +1 ) + 1;
                    int len = d - c + 1;

                    ans+= 1l*fl*len*sl;
                    break;
                }
                for(int j = Math.max(b ,c - i +1 ) ; j<=c ;j++)
                {
                    //count.
                    //i+j>k
                    if(i+j>d)
                    {
                        int len = d - c + 1;
                        int lc = c - j +1;
                        ans+= 1l*len*lc;
                        break;
                    }
                    long cur =   Math.min(d , i+j) - c ;
                    if(cur<0)
                        break;
                    ans+=cur +1 ;
                    if( Math.min(d , i+j) == i+j)
                        ans--;

                }
            }
            System.out.println(ans);
        }
    }
}
