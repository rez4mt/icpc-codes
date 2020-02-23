package com.ICPC.CoachAcademy.Placement;

import java.io.PrintWriter;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        PrintWriter pw = new PrintWriter(System.out);
        while (T-->0)
        {
            int N = sc.nextInt();
            StringBuilder current = new StringBuilder(N);
            current.setLength(N);
            for(int i = 0 ; i < N ;i++)
                current.setCharAt(i,' ');
            for(int i = 0 ; i < N/2 ;i++)
            {
                current.setCharAt(i,'*');
                current.setCharAt(N-i-1 , '*');
                pw.println(current);
            }
            current.setCharAt(N/2,'*');
            pw.println(current);
            for(int i = (N/2) ; i >0 ;i--)
            {
                current.setCharAt(i,' ');
                current.setCharAt(N-i-1 , ' ');
                pw.println(current);
            }
        }
        pw.flush();
    }
}
