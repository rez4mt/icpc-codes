package com.Judges.CodeForce.CF330;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ways = 0;
        int a ,b;
        a = sc.nextInt();
        b = sc.nextInt();
        sc.nextLine();
        int rows = 0;
        boolean filled[] = new boolean[b];
        for(int i = 0; i < a; i ++)
        {
            String line = sc.nextLine();
            if(!line.contains("S"))
            {
                ways+=b;
                rows++;
                continue;
            }
            for(int j = 0 ; j < b;j++)
            {
                if(filled[j])
                    continue;
                if(line.charAt(j) == 'S')
                    filled[j] = true;
            }
        }
        for(int i = 0 ; i<b;i++)
        {
            if(!filled[i])
            {
                ways += (a - rows);
            }
        }

        System.out.println(ways);
    }
}
