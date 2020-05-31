package com.Judges.CodeForce. CF1352;
import java.util.*;
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(k == 1)
            {
                System.out.println(1);
                continue;
            }
            //3 7
            int div = k / (n-1);
            int rem = k % (n-1);
            if(rem == 0)
                rem --;
            //4 12
            System.out.println((1l*div*n)+ rem);
        }
    }
}
