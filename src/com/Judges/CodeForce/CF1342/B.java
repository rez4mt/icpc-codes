package com.Judges.CodeForce.CF1342;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            String s = sc.next();
            int n = s.length();
            boolean flag = false;
            String ff = "";
            StringBuilder sb = new StringBuilder();
            for(int i = 1 ; i < n ; i++)
            {
                if(s.charAt(i)!=s.charAt(i-1))
                {
                    flag = true;
                    break;
                }
            }
            for(int i = 0 ; i  < n; i ++)
            {
                if(flag)
                sb.append("10");
                else {
                    sb.append(s.charAt(0));
                    sb.append(s.charAt(0));
                }
            }
            System.out.println(sb);
        }
    }
}
