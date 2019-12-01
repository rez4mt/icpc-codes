package com.Judges.CodeForce.CF1263;

import java.io.PrintWriter;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        PrintWriter pw = new PrintWriter(System.out);
        while (T-->0)
        {
            int n = sc.nextInt();
            String[] l = new String[n];
            for(int i = 0 ; i < n ; i++)
                l[i] = sc.next();
            int count = 0 ;
            for(int i = 0 ; i  < n ;i++)
            {
                boolean eq = false;
                for(int j = i+1 ; j < n ;j++)
                {
                    if(l[i].equals(l[j]))
                    {
                        eq = true;
                        break;
                    }
                }
                if(eq)
                {
                    StringBuilder sb = new StringBuilder(l[i]);
                    count++;
                    for(int j = '0' ; j <='9' ;j++)
                    {
                        sb.setCharAt(3 , (char) j);
                        l[i] = sb.toString();
                        boolean works = true;
                        for(int k = 0 ; k < n ; k++)
                        {
                            if(i == k)
                                continue;
                            if(l[i].equals(l[k]))
                            {
                                works = false;
                                break;
                            }
                        }
                        if(works)
                            break;
                    }
                }
            }
            pw.println(count);
            for(int i = 0 ; i < n ; i++)
                pw.println(l[i]);
        }
        pw.flush();
    }
}
