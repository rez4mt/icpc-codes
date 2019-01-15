package com.Judges.uri;

import java.util.Scanner;

public class P1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int x1 = sc.nextInt(),y1 = sc.nextInt(),x2 = sc.nextInt(),y2 = sc.nextInt();
            if(x1 == 0 && x2==0 && y2 == 0 && y1 == 0)
                break;
            if(x1 == x2 && y1==y2)
            {
                System.out.println(0);
            }else if(x1 == x2 || y1 == y2)
            {
                System.out.println(1);
            }else
            {
                int a = Math.abs(x1-x2);
                int b = Math.abs(y1-y2);
                if(a == b)
                {
                    System.out.println(1);
                }else
                    System.out.println(2);
            }

        }

    }
}
