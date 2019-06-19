package com.Judges.CodeForce.CF682;

import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

public class A {
    int MAX = (int)10e6;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count = 0;
        int MAX = Math.max(A,B);
        int MIN = Math.min(A,B);
        int[] fsum = new int[5];
        int[] ssum = new int[5];

        for(int i = 1; i <= A ; i++)
        {
            fsum[i%5]++;
        }
        for(int i = 1 ; i <= B ; i++)
        {
            ssum[4 - (i%5)]++;
        }
        long fi = 0;
        for(int i = 0 ; i< 5 ;i++)
        {
            fi += ssum[i]*fsum[i];
        }
        System.out.println(fi);
    }

}
