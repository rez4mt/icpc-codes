package com.ICPC.GPC.P16;

import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int  i = 1;
        while (T-->0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long diff = b-a;
            //next leap year
            long count = 0;
            if(a%400 == 0 || (a%4 == 0 && a%100!=0))
            {
                long nextUnLeap = 100 - (a%100);
                long nextLeap400 = 400 - (a%400);
                count += diff/4;
                if(nextUnLeap <= diff)
                {
                    count--;
                    count-= (diff-nextUnLeap)/100;
                }
                if(nextLeap400 <= diff)
                {
                    count++;
                    count+= (diff-nextLeap400)/400;
                }

                System.out.printf("%d. %d\n",i++,count);

            }else
            {
                System.out.printf("%d. %s\n",i++,"Not a leap year!");
            }
        }
    }
}
