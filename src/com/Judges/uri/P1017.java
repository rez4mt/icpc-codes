package com.Judges.uri;

import java.util.Scanner;

public class P1017 {
    public P1017()
    {
        int time,avg ;
        Scanner sc = new Scanner(System.in);
        time = sc.nextInt();
        avg = sc.nextInt();
        int distance = time*avg;
        double fuel = distance / 12.0;
        System.out.printf("%.3f\n",fuel);
    }

    public static void main(String[] args) {
        new P1017();
    }
}
