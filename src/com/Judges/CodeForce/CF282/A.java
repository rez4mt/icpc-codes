package com.Judges.CodeForce.CF282;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int x = 0;
        sc.nextLine();
        while (T-->0)
        {
            String s = sc.nextLine().replace("X","");
            if(s.equals("++"))
                x++;
            else if(s.equals("--"))
                x--;
        }
        System.out.println(x);
    }
}
