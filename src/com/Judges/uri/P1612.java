package com.Judges.uri;

import java.util.Scanner;

public class P1612 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0 ; i < T ; i ++)
        {
            long a = sc.nextLong();
            System.out.println(a%2==1?(a/2)+1:a/2);
        }
    }
}
