package com.Judges.CodeForce.CF1097;

import java.util.*;

public class B {
    static int T ;
    static int[] n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        n = new int[T];
        int s = 0;
        for(int i = 0 ; i< T ; i ++)
        {
            n[i] = sc.nextInt();
        }
        if(check(0,0))
            System.out.println("YES");
        else System.out.println("NO");
    }

    private static boolean check(int rot,int deg)
    {
        if(deg<0)
            deg+=360;

        if(rot == T)
            return deg == 0;

        boolean a = check(rot+1,deg+n[rot] % 360);
        boolean b = check(rot+1,deg-n[rot] % 360);
        return a||b;
    }
}
