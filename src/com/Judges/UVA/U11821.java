package com.Judges.UVA;

import java.math.BigDecimal;
import java.util.Scanner;

public class U11821 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            BigDecimal d = BigDecimal.ZERO;
            while (true)
            {
                BigDecimal temp = sc.nextBigDecimal();
                if(temp.equals(BigDecimal.ZERO))
                {

                    char[] data = d.toString().toCharArray();
                    int length = data.length - 1;
                    while (length >= 0 && data[length]=='0')
                        length--;
                    if(length >= 0 && data[length] == '.')
                        length --;
                    for(int i = 0 ; i <= length; i ++)
                    {
                        System.out.print(data[i]);
                    }
                    System.out.println();
                    break;
                }
                d = d.add(temp);
            }
        }
    }
}
