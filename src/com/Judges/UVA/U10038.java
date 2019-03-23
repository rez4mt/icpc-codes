package com.Judges.UVA;

import java.util.Arrays;
import java.util.Scanner;

public class U10038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int N = sc.nextInt();
            boolean flag = true;
            for(int i = 0 ; i < N ; i ++)
            {
                int n = sc.nextInt();
                if(n <= 0 || n>N)
                {
                    flag = false;
                }
            }
            System.out.println(flag?"Jolly":"Not jolly");

        }
    }
}
