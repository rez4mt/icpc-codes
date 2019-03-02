package com.Judges.UVA;

import java.util.Scanner;

public class U11958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int cases = 1;
        while (T-->0)
        {
            int n = sc.nextInt();
            String[] s = sc.next().split(":");
            int nowH = Integer.valueOf(s[0]);
            int nowM = Integer.valueOf(s[1]);
            int min = Integer.MAX_VALUE;
            int curr_sec = (nowH * 60) + nowM;
            while (n-->0)
            {
                s = sc.next().split(":");
                int hour  =Integer.valueOf(s[0]);
                int minute = Integer.valueOf(s[1]);
                int time = sc.nextInt();
                int end_sec = (hour*60)+minute;
                if(end_sec < curr_sec)
                    curr_sec+=1440;
                end_sec += time;
                min = Math.min(min,end_sec);
            }

            System.out.printf("Case %d: %d\n",cases++,min-curr_sec);
        }
    }
}
