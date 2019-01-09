package com.Judges.CodeForce.CF118;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder b = new StringBuilder();
        int n = sc.nextInt();
        n++;
        for(int i = 1 ; i <= n; i++)
        {
            for(int j = i ; j <n;j++)
                b.append("  ");
            for(int j = 0 ; j < i ; j ++)
            {
                b.append(j+" ");
            }
            for(int j = i-2;j>=0;j--)
            {
                b.append(j+" ");
            }
            b.deleteCharAt(b.length()-1);
            b.append("\n");
        }
        for(int i = n-1 ; i >=0; i--)
        {
            for(int j = i ; j <n;j++)
                b.append("  ");
            for(int j = 0 ; j < i ; j ++)
            {
                b.append(j+" ");
            }
            for(int j = i-2;j>=0;j--)
            {
                b.append(j+" ");
            }
            b.deleteCharAt(b.length()-1);
            b.append("\n");
        }

        System.out.print(b);
    }
}
