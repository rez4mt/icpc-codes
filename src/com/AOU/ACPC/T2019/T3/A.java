package com.AOU.ACPC.T2019.T3;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String first = sc.next();
        String second = sc.next();
        int cmp = first.compareTo(second);
        if(cmp == 0)
        {
            System.out.println("NO");
        }else
        {
            if(cmp > 0)
            {
                //first > second
                for(int i  = 1 ; i < N ; i++)
                {
                    //swap 1 with another
                    if(second.charAt(i)<first.charAt(i))
                    {
                        System.out.println("YES");
                        System.out.println(1+" "+(i+1));
                        return;
                    }
                }
                System.out.println("NO");
            }else
            {
                //cmp > 0

            }
        }
    }
}
