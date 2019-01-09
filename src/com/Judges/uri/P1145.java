package com.Judges.uri;

import java.util.Scanner;

public class P1145 {
    public P1145()
    {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int l = sc.nextInt();
        for(int i = 1 ; i <= l ; i+=s)
        {
            for(int j = 0; j<s ; j++)
            {
                if(j == 0)
                    System.out.printf("%d",i+j);
                else
                    System.out.printf(" %d",i+j);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new P1145();
    }
}
