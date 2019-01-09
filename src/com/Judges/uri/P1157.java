package com.Judges.uri;

import java.util.Scanner;

public class P1157 {
    public static void main(String[] args) {
        new P1157();
    }
    public P1157()
    {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1 ; i <= num ; i++)
        {
            if(num % i == 0)
                System.out.print(i+"\n");
        }

    }
}
