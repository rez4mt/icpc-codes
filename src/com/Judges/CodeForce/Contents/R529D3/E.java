package com.Judges.CodeForce.Contents.R529D3;

import java.util.Scanner;
import java.util.Stack;

public class E {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        for(int i = 0 ; i < n ; i++)
        {
            switch (str.charAt(i))
            {
                case '(':
                    s.push(0);
                    break;
                case ')':
                    break;
            }
        }
    }
}
