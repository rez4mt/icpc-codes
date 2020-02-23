package com.Judges.CodeForce.CF1307;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T  = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] list = new int[n];
            int largest = Integer.MIN_VALUE;

            boolean found = false;
            for(int i = 0 ; i < n;i++)
            {
                list[i] = sc.nextInt();
                largest = Math.max(largest , list[i]);
                if(list[i] == x)
                    found = true;
            }
            if(found)
            {
                System.out.println(1);
                continue;
            }
            if(x > largest)
            {
                System.out.println((int)Math.ceil(1d*x / largest));
            }else System.out.println(2);
        }
    }
}
