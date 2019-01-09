package com.Judges.uri;

import java.util.Scanner;

public class P1150 {
    public static void main(String[] args) {
        new P1150();
    }
    public P1150(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int z = sc.nextInt();
        int nums = 1;
        while (z <= x)
            z = sc.nextInt();
        for ( int sum = x ; sum < z ; sum+=x)
        {
            x++;
            nums++;
        }
        System.out.printf("%d",nums);

    }
}
