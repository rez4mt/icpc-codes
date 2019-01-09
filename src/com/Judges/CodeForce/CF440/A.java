package com.Judges.CodeForce.CF440;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] m = new int[a-1];
        for(int i = 0 ; i < a-1 ; i ++)
        {
            m[i] = sc.nextInt();
        }
        Arrays.sort(m);
        int c = 1;
        boolean found  = false;
        for(int i = 0 ; i <a-1;i++)
        {

            if(m[i] != c)
            {
                found = true;
                break;
            }
            c++;
        }

        System.out.println(c);
    }
}
