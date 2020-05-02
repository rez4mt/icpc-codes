package com.Judges.CodeForce.CF1328;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            StringBuilder sb =new StringBuilder();
            for(int i = 0; i < a; i++)
                sb.append("a");
            ArrayList<String> list = new ArrayList<>();
            int ans = 0 ;
            for(int i = a-2 ; i >= 0 ; i--)
            {
                sb.setCharAt(i , 'b');
                if(ans+(a - 1 - i)<b)
                {
                    ans+=(a - 1 - i);
                    sb.setCharAt(i , 'a');
                    continue;
                }else
                {
                    int l = b - ans;
                    sb.setCharAt(a-1-(l-1),'b');
                    System.out.println(sb);
                    break;
                }

            }

        }
    }
}