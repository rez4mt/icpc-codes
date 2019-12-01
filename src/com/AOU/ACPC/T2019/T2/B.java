package com.AOU.ACPC.T2019.T2;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A%2!=0)
                System.out.println("Kilani");
            else{
                int max = Math.max(1, A-B);
                if(max!=1)
                    System.out.println("Kilani");
                else System.out.println("Ayoub");
            }
        }
    }
}
