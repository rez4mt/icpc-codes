package com.Judges.CodeForce.CF102;

import java.math.BigInteger;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long count = 0;
        while (s.length()>1)
        {
            count++;
            BigInteger current_sum = BigInteger.ZERO;
            for(int i = 0 ; i< s.length() ; i++)
            {
                current_sum = current_sum.add(BigInteger.valueOf(Character.digit(s.charAt(i),10)));
            }
            s = current_sum.toString();
        }
        System.out.println(count);

    }
}
