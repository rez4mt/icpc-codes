package com.Judges.uri;

import java.math.BigInteger;
import java.util.Scanner;

public class P1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            String a = sc.next();
            String b = sc.next();
            if(a.equals("0") && b.equals("0"))
                break;
            b=b.replace(a,"");
            if(b.isEmpty())
                b = "0";
            System.out.println(new BigInteger(b).toString());
        }

    }
}
