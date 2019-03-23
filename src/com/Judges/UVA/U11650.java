package com.Judges.UVA;

import java.util.Arrays;
import java.util.Scanner;

public class U11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-->0)
        {
            String[] time = sc.nextLine().split(":");
            int[] t = {Integer.valueOf(time[0]),Integer.valueOf(time[1])};
            int[] nt = {12-t[0]%12,(60-t[1])% 60};
            if(nt[1]!=0)
                nt[0]--;
            if(nt[0] == 0)
                nt[0] = 12;
            System.out.printf("%02d:%02d\n",nt[0],nt[1]);

        }
    }
}
