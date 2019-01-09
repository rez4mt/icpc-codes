package com.Judges.UVA;

import java.util.Scanner;

public class U10035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            String a = sc.next();
            String b = sc.next();
            if(a.equals("0") && b.equals("0"))
                break;
            int len = Math.min(a.length(),b.length());
            int last_carry = 0;
            int carry_count = 0;
            for(int i = 0 ; i < len ; i ++)
            {
                int aa = Integer.valueOf(a.substring(a.length()-i-1,a.length()-i));
                int bb = Integer.valueOf(b.substring(b.length()-i-1,b.length()-i));
                if(aa+bb + last_carry > 9)
                {
                    last_carry = 1;
                    carry_count ++;
                }else
                {
                    last_carry = 0;
                }
            }
            if(a.length() != b.length() && last_carry > 0)
            {
                String w = a.length()>b.length()?a:b;
                for(int i = len; i < w.length() && last_carry != 0;i++)
                {
                    //last_carry = 0;
                    int val = Integer.valueOf(w.substring(w.length()-i-1,w.length()-i));
                    if(val + last_carry <= 9)
                        last_carry = 0;
                    else
                        carry_count++;

                }
            }
            if(carry_count<=1)
            {
                if(carry_count == 0)
                    System.out.println("No carry operation.");
                else if(carry_count == 1)
                {
                    System.out.println("1 carry operation.");
                }
            }else
            {
                System.out.printf("%d carry operations.\n",carry_count);
            }

        }
    }
}
