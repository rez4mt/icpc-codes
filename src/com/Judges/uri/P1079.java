package com.Judges.uri;

import java.util.Scanner;

public class P1079 {
    public P1079()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++)
        {
            System.out.printf("%.1f\n",((sc.nextFloat()*2)+(sc.nextFloat()*3)+(sc.nextFloat()*5))/10);
        }

    }
    public static void main(String[] args) {
        new P1079();
    }
}
