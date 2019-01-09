package com.Judges.UVA;

import java.util.Scanner;

class U12149 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ,s ;
        while (true)
        {
            s = 0;
            n = sc.nextInt();
            if (n == 0 )
                break;
            for (int i = 1 ; i<= n;i++)
            {
                 s+= Math.pow(i,2);
            }
            System.out.println(s);
        }
    }

}

