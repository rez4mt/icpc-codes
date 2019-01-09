package com.Judges.uri;

import java.util.Scanner;

public class P1094 {
    public static void main(String[] args) {
        new P1094();
    }
    public P1094()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),temp = 0;
        int c_count =0,r_count =0, s_count =0;
        for(int i = 0 ; i < n ; i++)
        {
            temp = sc.nextInt();
            switch (sc.next())
            {
                case "C":
                    c_count += temp;
                    break;
                case "R":
                    r_count += temp;
                    break;
                case "S":
                    s_count += temp;
                    break;
            }

        }
        int count = c_count+r_count+s_count;
        System.out.printf("Total: %d cobaias\n",count);
        System.out.printf("Total de coelhos: %d\n",c_count);
        System.out.printf("Total de ratos: %d\n",r_count);
        System.out.printf("Total de sapos: %d\n",s_count);
        System.out.printf("Percentual de coelhos: %.2f %%\n",((double)c_count)/((double)count)*100);
        System.out.printf("Percentual de ratos: %.2f %%\n",((double)r_count)/((double)count)*100);
        System.out.printf("Percentual de sapos: %.2f %%\n",((double)s_count)/((double)count)*100);
    }
}
