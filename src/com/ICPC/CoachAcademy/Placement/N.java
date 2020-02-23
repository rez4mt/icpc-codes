package com.ICPC.CoachAcademy.Placement;

import java.util.Scanner;
import java.util.TreeSet;

public class N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < (1<<n); i++)
        {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++)

                if ((i & (1 << j)) != 0)
                    sb.append(s.charAt(j));
                //
            boolean flag = true;
            for(int j = 0 ; j < sb.length();j++)
            {
                if(sb.charAt(j)!=sb.charAt(sb.length()-1-j))
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
                set.add(sb.toString());
        }
        System.out.println(set.last());
    }
}
