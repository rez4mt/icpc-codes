package com.Judges.kattis;

import java.util.*;

public class twostones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        if(N % 2 == 1)
            System.out.println("Alice");
        else System.out.println("Bob");
    }
}
