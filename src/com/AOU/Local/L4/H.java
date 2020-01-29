package com.AOU.Local.L4;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            double v = a / (double)b;
            StringBuilder sb = new StringBuilder();
            while (v > 10e-9)
            {
                int x = 0 ;
                //find x and output it ...
                x = (int)Math.ceil(1d/v);
                sb.append("1/");
                sb.append(x);
                sb.append(" + ");
                v -= (1d/x);
            }
            sb.deleteCharAt(sb.length()-1);
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb.toString());
        }
    }
}
