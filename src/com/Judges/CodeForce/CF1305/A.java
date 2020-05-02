package com.Judges.CodeForce.CF1305;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            int[] list = new int[N];
            for(int i = 0 ; i < N ; i++)
            {
                list[i]  =sc.nextInt();
            }
            int[] list2 = new int[N];
            for(int i = 0 ; i < N ; i++)
                list2[i] = sc.nextInt();
            Arrays.sort(list);
            Arrays.sort(list2);
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for(int i = 0 ; i < N ;i++)
            {
                sb.append(list[i]+" ");
                sb2.append(list2[i]+" ");
            }
            sb.deleteCharAt(sb.length()-1);
            sb2.deleteCharAt(sb2.length()-1);
            System.out.println(sb);
            System.out.println(sb2);
        }
    }
}
