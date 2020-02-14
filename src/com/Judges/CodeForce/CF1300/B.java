package com.Judges.CodeForce.CF1300;

import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {

            int N = sc.nextInt();
            int[] list = new int[N*2];
            for(int i = 0 ; i < N*2 ; i++)
            {
                list[i] = sc.nextInt();
            }
            Arrays.sort(list);
            System.out.println(Arrays.toString(list));

        }
    }

}
