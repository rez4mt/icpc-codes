package com.Judges.UVA;

import java.util.HashMap;
import java.util.Scanner;

public class U10916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Long> data = new HashMap<>();
        while (true)
        {
            int year  = sc.nextInt();
            if(year == 0)
                return;
            int bitCount = (int) Math.pow(2,2+(year-1960)/10);
            double sum = 0d;
            int i =0;
            while (sum<bitCount)
            {
                i++;
                sum+= Math.log(i)/Math.log(2);

            }
            System.out.println(--i);

        }
    }
}
