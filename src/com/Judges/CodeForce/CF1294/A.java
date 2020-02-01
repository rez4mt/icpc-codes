package com.Judges.CodeForce.CF1294;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int[] list = new int[3];
            for(int i = 0 ;i <  3 ; i++)
                list[i] = sc.nextInt();
            int N = sc.nextInt();
            int largest = Arrays.stream(list).max().getAsInt();
            int rem = 0 ;
            for(int i = 0 ; i<  3 ; i++)
            {
                   rem+= largest - list[i];
            }
            if(rem > N)
            {
                System.out.println("NO");
                continue;
            }
            N -= rem;
            if(N == 0)
                System.out.println("YES");
            else{
                if(N%3==0)
                    System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
