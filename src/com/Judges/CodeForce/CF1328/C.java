package com.Judges.CodeForce.CF1328;


import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            char[] first,second;
            first = new char[n];
            second = new char[n];
            int larger = 0;
            char[] num = sc.next().toCharArray();
            for(int i = 0 ; i < n ; i++)
            {
                if(num[i] == '0' )
                {
                    first[i] = '0';
                    second[i] = '0';
                    continue;
                }
                if(num[i] == '2')
                {
                    if(larger == 0)
                    {
                        first[i] = '1';
                        second[i] = '1';
                    }else
                    {
                        second[i] = '0';
                        first[i] = '2';
                    }
                }else
                {
                    if(larger== 0)
                    {
                        larger = -1;
                        second[i] = '1';
                        first[i] = '0';
                    }else
                    {
                        second[i] = '0';
                        first[i] = '1';
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < n ; i++)
                sb.append((char)first[i]);
            System.out.println(sb.toString());
            sb = new StringBuilder();
            for(int i = 0 ; i < n ; i++)
                sb.append((char)second[i]);
            System.out.println(sb.toString());
        }
    }
}