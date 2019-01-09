package com.Judges.UVA;

import java.util.Scanner;

public class U11461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b , sum;
        double temp;
        while (true)
        {
            sum =0;
            a = sc.nextInt();
            b = sc.nextInt();
            if(a == 0  && b == 0 )
                break;
            for(int i = a;i<=b;i++)
            {
                temp = Math.sqrt(i);
                if(temp == (int)temp)
                    sum++;
            }
            System.out.println(sum);
        }
    }
}
