package com.Judges.CodeForce.CF1285;

import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> list = new ArrayList<>();
        long A = sc.nextLong();
        int sqrt =(int) Math.sqrt(A);

        for(int i = 1 ; i<= sqrt ; i++)
        {
            if(A%i == 0)
            {
                list.add((A/i));
                list.add((long)i);
            }
        }
        Collections.sort(list);
        int r = list.size()%2 == 0?list.size()/2 - 1:list.size()/2;
        int l = list.size()/2;
        //bf((int)A);

        while(l<list.size())
        {
            long a = list.get(l);
            long b = list.get(r);
            l++;
            r--;
            if(a==b && a!=1)
                continue;
            if((A == lcm(a,b)))
            {
                System.out.println(b+" "+a);
                break;
            }

        }
    }

    static int bf(int n)
    {
        int a =1, b=n;
        for(int i = 1 ;i <  n ;i++)
        {
            for(int j = i+1 ; j< n ;j++)
            {
                if(lcm(i , j) == n)
                {
                    if(Math.max(a,b) > Math.max(i,j))
                    {
                        a = i ;
                        b = j;
                    }
                }
            }
        }
        System.out.println(a +" "+b);
        return 0 ;
    }
    public static long lcm(long number1, long number2) {
        if (number1 == 0 || number2 == 0) {
            return 0;
        }
        long absNumber1 = Math.abs(number1);
        long absNumber2 = Math.abs(number2);
        long absHigherNumber = Math.max(absNumber1, absNumber2);
        long absLowerNumber = Math.min(absNumber1, absNumber2);
        long lcm = absHigherNumber;
        while (lcm % absLowerNumber != 0) {
            lcm += absHigherNumber;
        }
        return lcm;
    }
}
