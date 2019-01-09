package com.Judges.uri;

import java.util.Scanner;

public class P1014 {
    public P1014()
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%.3f km/l\n",sc.nextInt()/Double.parseDouble(sc.next()));
    }

    public static void main(String[] args) {
        new P1014();
    }
}
