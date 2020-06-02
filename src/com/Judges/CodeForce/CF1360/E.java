package com.Judges.CodeForce.CF1360;


import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n  = sc.nextInt();
            char[][] list = new char[n][];
            for(int i = 0 ; i < n ; i++)
                list[i] = sc.next().toCharArray();
            boolean flag = true;
            for(int i = 0 ; i < n && flag ;i++)
            {
                for(int j = 0 ; j < n && flag ;j++)
                {
                    if(list[i][j] == '1')
                    {
                        if(i == n-1 || j == n-1)
                            continue;
                        if(list[i][j+1] =='0' && list[i+1][j] == '0')
                        {
                            flag = false;
                            break;
                        }
                    }
                }
            }
            System.out.println(flag?"YES":"NO");

        }
    }
}
