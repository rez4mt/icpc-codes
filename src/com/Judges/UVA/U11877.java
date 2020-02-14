package com.Judges.UVA;

import java.util.Scanner;

public class U11877{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int N = sc.nextInt();
            if(N == 0)
                break;
            System.out.println(N/2);
        }
    }
}
