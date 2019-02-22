package com.Judges.UVA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class U1727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        HashMap<String,Integer> map = new HashMap<>();
        map.put("SUN",0);
        map.put("MON",1);
        map.put("TUE",2);
        map.put("WED",3);
        map.put("THU",4);
        map.put("FRI",5);
        map.put("SAT",6);

        map.put("JAN",0);
        map.put("FEB",1);
        map.put("MAR",2);
        map.put("APR",3);
        map.put("MAY",4);
        map.put("JUN",5);
        map.put("JUL",6);
        map.put("AUG",7);
        map.put("SEP",8);
        map.put("OCT",9);
        map.put("NOV",10);
        map.put("DEC",11);

        int[] days_count = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

        while (T-->0)
        {
            String mth = sc.next();
            String day = sc.next();
            int count = map.get(mth);
            int start = map.get(day);

            int wends = 0;
            for(int i = 0 ; i < days_count[count];i++)
            {
                int mod = (start+i) % 7;
                if(mod == 6 || mod == 5)
                    wends ++;

            }
            System.out.println(wends);
        }
    }
}
