package com.Judges.UVA;

import java.math.BigInteger;
import java.util.Scanner;

public class U392 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            StringBuilder b = new StringBuilder();
            for(int i = 0 ; i < 9 ; i ++)
            {
                BigInteger a = sc.nextBigInteger();
                if(a.compareTo(BigInteger.ZERO)==0)
                    continue;
                b.append(get(b.toString(),i,a));
            }
            if(b.length()==0)
            {
                System.out.println(0);
                continue;
            }
            b.deleteCharAt(0);
            if(Character.toString(b.charAt(0)).equals("+"))
            {
                b.deleteCharAt(1);
                b.deleteCharAt(0);
            }else
            {
                b.deleteCharAt(1);
            }
            System.out.println(b.toString());
        }
    }

    static String get(String current,int position,BigInteger num)
    {
        StringBuilder mb = new StringBuilder();
        if(num .compareTo(BigInteger.ZERO)>0)
        {
            mb.append(" + ");
            if(num.compareTo(BigInteger.ONE)!=0 || position==8)
                mb.append(num.toString());
        }else if( num.compareTo(BigInteger.ZERO) < 0)
        {
            mb.append(" - ");
            if(num.compareTo(BigInteger.valueOf(-1))!=0 || position==8)
                mb.append(num.abs());
        }
        else
            return "";

        if(position < 7)
        {
            mb.append("x^");
            mb.append(8-position);
        }else if(position == 7)
        {
            mb.append("x");
        }

        return mb.toString();
    }
}
