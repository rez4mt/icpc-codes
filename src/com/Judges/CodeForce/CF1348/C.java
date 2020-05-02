package com.Judges.CodeForce.CF1348;

import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            char[] s = sc.next().toCharArray();
            Arrays.sort(s);
            if(s[0]!=s[k-1])
                System.out.println(s[k-1]);
            else
            {
                System.out.print(s[0]);
                if(k>=n || s[k]!=s[n-1])
                {
                    for(int i = k ; i <  n ; i++)
                        System.out.print(s[i]);
                    System.out.println();
                }else{
                    for (int i=0;i<(n-k+k-1)/k;i++)
                        System.out.print(s[n-1]);
                    System.out.println();
                }
            }

        }

    }
}
