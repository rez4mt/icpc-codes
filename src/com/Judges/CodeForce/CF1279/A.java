package com.Judges.CodeForce.CF1279;

import java.util.Arrays;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int[] list = new int[3];
            for(int i = 0 ; i < 3 ; i++)
                list[i] = sc.nextInt();
            Arrays.sort(list);
            if(list[2]-1 > list[0]+list[1])
                System.out.println("No");
            else System.out.println("Yes");
        }
    }
}