package com.Judges.CodeForce.CF1342;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
        while (T-->0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int moshtarak = Math.min(x , y);
            long need = moshtarak*1l * b;
            long secNeed = (a*1l*moshtarak) + (a*1l*moshtarak);
            int rem = Math.max(x,y) - moshtarak;
            if(secNeed<need)
            {
                //we perform a !
                secNeed += a *1l* rem;
                System.out.println(secNeed);
            }else
            {
                //we remove B
                need += a*1l*rem;
                System.out.println(need);
            }
        }
    }
}
