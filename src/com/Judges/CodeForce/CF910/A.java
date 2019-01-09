//package com.Judges.CodeForce.CF910;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        char[] path = sc.next().toCharArray();
        int count = 0;
        for(int i = 0 ; i < n-1 ;)
        {
            if(i+d>=n)
            {
                System.out.println(++count);
                return;
            }
            if(path[i+d] == '1')
            {
                i +=d;
                count++;
            }else
            {
                for(int j = d-1;j>0;j--)
                {
                    if(i+j>n)
                        continue;
                    if(path[i+j]=='1')
                    {
                        i+=j;
                        count++;
                        break;
                    }else if(j == 1 && path[i+j] == '0')
                    {
                        System.out.println("-1");
                        return;
                    }
                }

            }
        }
        System.out.println(count);
    }
}
