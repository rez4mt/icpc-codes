package com.Judges.CodeForce. CF1351;
import java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {

            int a1 = sc.nextInt();
            int b1 = sc.nextInt();
            /////
            int a2 = sc.nextInt();
            int b2 = sc.nextInt();
            int c = Math.max(a1,b1) - Math.min(a1,b1);
            if(Math.max(a1,b1) == Math.max(a2,b2) && Math.min(a2,b2) == c)
                System.out.println("yes");
            else System.out.println("no");
        }
    }
    static boolean eq(double a , double b)
    {
        return Math.abs(a-b)  <10e-9;
    }
}
