package com.Judges.CodeForce. CF1353;
import java.util.*;
public class A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n , m ;
            n = sc.nextInt();
            m = sc.nextInt();
            if(n == 1)
                System.out.println(0);
            else if(n==2)
                System.out.println(m);
            else System.out.println(m*2l);
        }
    }
}
