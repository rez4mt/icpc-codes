package com.Judges.uri;

import java.util.Scanner;

public class P1151 {
    public static void main(String[] args) {
        new P1151();
    }
    public P1151() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int last = 0,sum = 1,temp = 0;
        System.out.printf("%d %d",last,sum);
        for(int i = 2 ; i <num;i++)
        {
            temp = last +sum;
            System.out.printf(" %d",temp);
            last = sum;
            sum = temp;

        }
    }
}
