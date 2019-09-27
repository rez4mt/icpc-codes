package com.Judges.CodeForce.CF1220;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        char[] list = sc.next().toCharArray();
        int c_o = 0;
        int c_z = 0;
        int c_r = 0;
        int c_e = 0;
        int c_n = 0;
        for(int i = 0 ; i < T ; i++)
        {
            switch (list[i])
            {
                case 'e':
                    c_e++;
                    break;
                case 'o':
                    c_o++;
                    break;
                case 'z':
                    c_z ++;
                    break;
                case 'n':
                    c_n++;
                    break;
                case 'r':
                    c_r++;
                    break;
            }
        }
        int max_ones = Math.min(c_o , Math.min(c_e,c_n));
        c_o -= max_ones;
        c_e -= max_ones;
        c_n -= max_ones;
        int max_zeros = Math.min(c_z , Math.max(c_e, Math.min(c_r,c_o)));
        StringBuilder b = new StringBuilder();
        for(int i = 0 ; i < max_ones ; i++)
        {
            b.append("1 ");
        }
        for(int i = 0 ; i < max_zeros ;i++)
            b.append("0 ");
        b.deleteCharAt(b.length()-1);
        System.out.println(b.toString());
    }
}
