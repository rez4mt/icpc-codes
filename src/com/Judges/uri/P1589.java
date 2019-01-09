package com.Judges.uri;

import java.util.Scanner;

public class P1589 {
    public static void main(String[] args) {
        new P1589();
    }
    public P1589()
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ; i < t ; i ++)
        {

            System.out.printf("%d\n",sc.nextInt()+sc.nextInt());
        }
    }

}
