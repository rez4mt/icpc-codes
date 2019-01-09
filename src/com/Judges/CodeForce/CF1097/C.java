package com.Judges.CodeForce.CF1097;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Map<Integer,char[]> m = new HashMap<>();
        int s = 0;
        for(int i = 0; i<T;i++)
        {
            char[] c = sc.next().toCharArray();
            m.put(i,c);
            s+=c.length;
        }
        if(s%2 !=0)
        {
            System.out.println(0);
            return;
        }

        int left_c = 0;
        int right_c = 0;
        for (char[] chars :
                m.values()) {
            for (int i = 0; i < chars.length; i++)
            {
                if(chars[i] == '(')
                    right_c++;
                else if(chars[i] == ')')
                    left_c++;
            }
        }
        if(left_c!=right_c) {
            System.out.println("0");
            return;
        }

    }
}
