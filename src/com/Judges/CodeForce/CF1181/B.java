package com.Judges.CodeForce.CF1181;

import java.math.BigInteger;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println(get(new StringBuilder(sc.nextLine()),new StringBuilder()));
    }
    private static BigInteger get(StringBuilder num1,StringBuilder num2)
    {
        if(num1.length() == 1)
            return BigInteger.valueOf(Long.MAX_VALUE);
        num2.append(num1.charAt(0));
        num1.deleteCharAt(0);
        if((num1.charAt(0) == '0' || num2.charAt(0) == '0'))
        {
            return get(num1,num2);
        }

        BigInteger sum = new BigInteger(num1.toString()).add(new BigInteger(num2.toString()));
        BigInteger min = get(num1,num2);
        if(min.equals(BigInteger.valueOf(-1)))
            return sum;
        else return sum.min(min);
    }
}
