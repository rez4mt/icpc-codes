package com.Judges.UVA;

import java.util.HashMap;
import java.util.Scanner;

public class U12439 {
    public static void main(String[] args) {
        String[] min = new String[]{"January", "February", "March", "April", "May", "June", "July",
"August", "September", "October", "November" , "December"};
        HashMap<String , Integer> months = new HashMap<>();
        for(int i = 0 ; i < min.length ; i++)
            months.put(min[i] , i+1);
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int start_month = months.get(sc.next());
            int start_day = Integer.valueOf(sc.next().replace(",",""));
            int start_year = sc.nextInt();
            int end_month = months.get(sc.next());
            int end_day = Integer.valueOf(sc.next().replace(",",""));
            int end_year = sc.nextInt();
            /*if(start_month <=2 && start_year%4==0 && (start_day%100!=0 || start_year%400 == 0))
                leap_days_count ++;
            if(end_month >2 && end_day<=31 && start_year%4==0 && (start_day%100!=0 || start_year%400 == 0))
                leap_days_count ++;*/
            int next_leap = 4 - (start_year % 4) ;
            int next_unleap = 100 - (start_year % 100);
            int next_unleapleap =  400 - (start_year % 400);

            int leap_count = end_year - start_year ;
            leap_count /= 4;

            int distance = end_year - start_year;

            leap_count += distance / 400;
            leap_count -= distance / 100;
            System.out.println(leap_count);

        }

    }
    static boolean isLeap(int year){
        return year%4 == 0 && (year%100!=0 || year%400 == 0);
    }
}
