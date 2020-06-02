package com.Judges.CodeForce. CF1355;
import java.io.PrintWriter;
import java.util.*;
public class D {
    static PrintWriter pw ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int T = 1;
        while (T-->0)
        {
            int n = sc.nextInt();
            int s = sc.nextInt();
            if (s-n+1>n) {
                pw.println("YES");
                for (int i = 0; i < n-1; i++)
                    pw.print("1 ");
                pw.println(s-n+1);
                pw.println(s-n);
            }
            else
                pw.println("NO");

            pw.println();
        }

        pw.flush();
    }

    private static void print(Object o)
    {
        pw.print(o);
    }
    private static void println(Object o)
    {
        pw.println(o);
    }
}
