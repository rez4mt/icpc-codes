package com.Judges.UVA;

import java.util.Scanner;

public class U12342 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int c = 0;
        while (T-->0)
        {
            c++;
            long income = sc.nextLong();
            double topay = 0 ;
            System.out.printf("Case %d: ",c);
            if(income < 180000)
            {
                System.out.println("0");
                continue;

            }
            income -= 180000;

            if(income > 0)
            {
                topay += (income >=300000 ? 300000 : income) * 0.1;
                income -= 300000;
            }
            if(income > 0)
            {
                topay += (income >= 400000 ? 400000: income) * .15;
                income -= 400000;

            }

            if(income > 0)
            {
                topay += (income >=300000 ? 300000 : income) * 0.2;
                income -= 300000;
            }

            if(income > 0)
            {
                topay += income * .25;
            }


            if(topay > 0 && topay <2000)
                System.out.println("2000");
            else System.out.printf("%.0f\n",Math.ceil(topay));
        }
    }
}
