package com.Judges.kattis;

import java.util.*;

public class welcomeeasy {
    static String line ;
    static String req = "welcome to code jam";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        int k = 1;
        while (T-->0)
        {
            line = sc.nextLine();
            System.out.printf("Case #%d: %04d\n",k++,count(0,0)%10000);

        }
    }
    static int count(int a , int count)
    {
        if(count == req.length())
            return 1;
        if(a == line.length())
            return 0 ;
        int mc = 0;
        mc += count(a+1 , count);
        if(line.charAt(a)==req.charAt(count))
            mc += count(a+1 , count +1 );
        return mc ;
    }

}