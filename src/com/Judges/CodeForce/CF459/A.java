package com.Judges.CodeForce.CF459;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(),y1 = sc.nextInt(),x2 = sc.nextInt(),y2 = sc.nextInt();
        int x = Math.abs(x1-x2);
        int y = Math.abs(y2-y1);
        int x3 = 0 ,y3 = 0,x4 = 0,y4 = 0;
        if(y == 0)
        {
            x3 = x1;
            y3 = y1 + x;
            x4 = x2;
            y4 = y2 + x;
        }else if(x == 0)
        {
            x3 = x1 + y;
            y3 = y1;
            x4 = x2 + y;
            y4 = y2;
        }else
        {
            if(x!=y)
            {
                System.out.println("-1");
                return;
            }
            else
            {
                x3 = x1;
                y3 = y2;
                x4 = x2;
                y4 = y1;
            }
        }
        System.out.printf("%d %d %d %d",x3,y3,x4,y4);
    }

}
