package com.Judges.UVA;


import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class U10776 {
    static char[] list ;
    static int N ;
    static int r ;
    static char[] ans ;
    static TreeSet<String> set ;
    public static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter(System.out);
        //Scanner sc = new Scanner(new File("src/in2"));
        Scanner sc = new Scanner(System.in);
        list = new char[32];
        ans = new char[32];
        set = new TreeSet<>();
        while(sc.hasNext())
        {
            String s = sc.next();
            r = sc.nextInt();
            N = s.length();
            for(int i = 0 ; i  < N ; i++)
                list[i] = s.charAt(i);
            Arrays.sort(list, 0, N);
            bt(0,0);
            for(String a : set)
                pw.println(a);
            set.clear();
        }
        pw.flush();
    }

    private static void bt(int len,int idx)
    {
        if(len == r)
        {
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < r; i++)
                sb.append(ans[i]);
            set.add(sb.toString());
            return;
        }
        if(r - len  > N-idx)
            return;
        for(int i = idx ; i < N ; i++)
        {
            ans[len] = list[i];
            bt(len+1,i+1);
            while( i < N && list[i] == list[i+1])
                i++;
        }
    }
}