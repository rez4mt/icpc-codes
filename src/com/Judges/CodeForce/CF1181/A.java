package com.Judges.CodeForce.CF1181;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x,y,z;
        x = sc.nextLong(); //girl one
        y = sc.nextLong(); //girl two
        z = sc.nextLong(); //price
        long count = (x/z) + (y/z);
        long maxCount = count + ((x%z)+(y%z))/z;
        if(count == maxCount)
        {
            System.out.printf("%d %d\n",maxCount,0);
        }else
        {
            System.out.printf("%d %d\n",maxCount,Math.min(x%z,y%z));
        }
    }
}
