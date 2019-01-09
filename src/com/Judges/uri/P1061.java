package com.Judges.uri;

import java.util.Scanner;

public class P1061 {
    public static void main(String[] args) {
        new P1061();
    }
    public P1061()
    {

        Scanner sc = new Scanner(System.in);
        sc.next();
        int[] start = new int[4];
        start[0] = sc.nextInt();
        start[1] = sc.nextInt();;
        sc.next();
        start[2] = sc.nextInt();
        sc.next();
        start[3] = sc.nextInt();
        sc.next();
        int[] end = new int[4];
        end[0] = sc.nextInt();
        end[1] = sc.nextInt();
        sc.next();
        end[2] = sc.nextInt();
        sc.next();
        end[3] = sc.nextInt();
        int days = end[0] - start[0];
        int hours = end[1] - start[1];
        int minutes = end[2] - start[2];
        int seconds = end[3] - start[3];
        if(seconds < 0)
        {
            seconds += 60;
            minutes--;
        }
        if(minutes < 0)
        {
            minutes += 60;
            hours --;
        }
        if(hours < 0)
        {
            hours += 24;
            days --;
        }
        System.out.printf("%d dia(s)\n",days);
        System.out.printf("%d hora(s)\n",hours);
        System.out.printf("%d minuto(s)\n",minutes);
        System.out.printf("%d segundo(s)\n",seconds);
    }
}
