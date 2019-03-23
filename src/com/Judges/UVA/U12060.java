package com.Judges.UVA;

import java.math.BigInteger;
import java.util.Scanner;

public class U12060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = 1;
        while (sc.hasNext()) {
            int N = sc.nextInt();
            if (N == 0)
                break;
            System.out.println("Case " + (TC++) + ":");
            long sum = 0;
            for (int i = 0; i < N; i++)
                sum += sc.nextInt();
            int avg = (int) (sum / N);
            int rem = (int) sum % N;
            int gcd = rem == 0 ? 0 : BigInteger.valueOf(N).gcd(BigInteger.valueOf(rem)).intValue();


            if(rem == 0)
            {
                //no remaining print the avg
                if(sum < 0)
                {
                    System.out.printf("- %d\n",Math.abs(avg));
                }else
                    System.out.println(avg);
            }else
            {
                N /= gcd;
                rem/=gcd;
                //add rem length to it
                int length_count = sum<0?2:0;
                if(avg!=0)
                    length_count+= (Math.abs(avg)+"").length();
                length_count+= (Math.abs(N)+"").length();
                System.out.printf("%"+length_count+"d\n",Math.abs(rem));
                if(sum<0)
                    System.out.print("- "+String.format("%-"+(length_count-2)+"s\n",avg==0?"-":(Math.abs(avg)+"")).replace(" ","-"));
                else
                    System.out.print(String.format("%-"+(length_count)+"s\n",avg==0?"-":(avg+"")).replace(" ","-"));
                System.out.printf("%"+length_count+"d\n",N);
            }
        }
    }
}
