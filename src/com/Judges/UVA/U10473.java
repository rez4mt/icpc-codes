package com.Judges.UVA;

import java.math.BigInteger;
import java.util.Scanner;

public class U10473 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            String data = sc.next();
            if(data.charAt(0) == '-')
                break;
            if(data.contains("0x"))
            {
                //is hex
                System.out.println(new BigInteger(data.substring(2),16).toString());
            }else
            {
                System.out.println("0x"+new BigInteger(data).toString(16).toUpperCase());
            }
        }
    }
}
