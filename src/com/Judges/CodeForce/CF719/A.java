package com.Judges.CodeForce.CF719;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[N];
        for(int i = 0 ; i < N ; i++)
        {
            list[i] = sc.nextInt();
        }
        if(N == 1)
        {
            if(list[N-1] == 15)
            {
                System.out.println("DOWN");
            }else if(list[N-1] == 0){
                System.out.println("UP");
            }else System.out.println("-1");
        }
        else
        {
            if(list[N-1]>list[N-2]){
                if(list[N-1] == 15)
                {
                    System.out.println("DOWN");
                }else
                {
                    System.out.println("UP");
                }
            }else {
                if(list[N-1] == 0)
                {
                    System.out.println("UP");
                }else
                {
                    System.out.println("DOWN");
                }
            }
        }
    }

}
