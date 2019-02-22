package com.Judges.UVA;

import java.util.Scanner;

public class U471 {
    static long MAX = 100000000000L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {

            long a = sc.nextLong();
            for(int i = 1 ; i*a < MAX ; i++)
            {
                long num = i*a;
                if(isOk(i) && isOk(num))
                {
                    System.out.printf("%d / %d = %d\n",num,i,a);
                }
            }
            if(T!=0)
                System.out.println();
        }
    }

    static boolean isOk(long num)
    {
        char[] count = new char[10];
        String n = String.valueOf(num);
        for(int i = 0 ; i<n.length() ; i++)
        {
            int pos = n.charAt(i)-'0';
            count[pos]++;
            if(count[pos]>1)
                return false;
        }
        return true;
    }
}
