package com.Judges.uri;

import java.util.Scanner;

public class P2787 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt()%2;
        int b = sc.nextInt()%2;
        if(a==b)
            System.out.println(1);
        else System.out.println(0);
    }
}
