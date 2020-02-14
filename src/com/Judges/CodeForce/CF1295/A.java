package com.Judges.CodeForce.CF1295;

import java.util.Scanner;
import java.util.TreeMap;

public class A {
    public static void main(String[] args) {
        TreeMap<Integer , Integer> map = new TreeMap<>();
        int[] v = {6,2,5,5,4,5,6,3,7,6};
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            int ones = N/2;
            boolean has7 = N%2!=0;
            if(has7)
                ones--;
            if(has7)
                sb.append("7");
            for(int i= 0 ; i < ones ; i++)
            {
                sb.append("1");
            }

            System.out.println(sb);
        }
    }
}
