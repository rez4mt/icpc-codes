package com.Judges.uri;

import java.util.Scanner;

public class P1016 {
    public P1016()
    {
        int speedX = 60,speedY = 90;
        double speedMin = (speedY-speedX)/60.0;
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        System.out.printf("%d minutos\n",(int)(min/speedMin));
    }
    public static void main(String[] args) {
        new P1016();
    }
}
