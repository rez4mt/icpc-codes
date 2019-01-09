package com.Judges.uri;

import java.util.Scanner;

public class P1009 {
    public P1009()
    {
        Scanner sc = new Scanner(System.in);
        sc.next(); // ignore name;
        double s = Double.parseDouble(sc.next());
        double bonus = (Double.parseDouble(sc.next()))/100 * 15;
        System.out.printf("TOTAL = R$ %.2f\n",s+bonus);

    }
    public static void main(String[] args) {
        new P1009();
    }
}

