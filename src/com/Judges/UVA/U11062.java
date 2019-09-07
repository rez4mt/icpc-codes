package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class U11062 {
    public static void main(String[] args) throws IOException{
        mFR sc = new mFR();
        TreeSet<String> set = new TreeSet<>();
        StringBuilder b = new StringBuilder();
        PrintWriter pw = new PrintWriter(System.out);
        while (sc.hasNext())
        {
            String temp = sc.next().toLowerCase();
            if(temp.isEmpty())
                continue;
            if(temp.charAt(temp.length()-1) == '-')
                b.append(temp.substring(0,temp.length()-1));
            else b.append(temp+" ");
        }
        StringBuilder out = new StringBuilder();
        for(int i = 0 ; i < b.length() ; i++)
        {
            char c = b.charAt(i);
            if(c >='a' && c <='z' || c == '-')
            {
                out.append(c);
            }else
            {
                if(out.length()!=0)
                    set.add(out.toString());

                out = new StringBuilder();
            }
        }
        for(String K : set)
            pw.println(K);
        pw.flush();
    }
    static class mFR{
        BufferedReader br ;
        StringTokenizer st ;
        public mFR()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        private String next() throws IOException {
            if(st == null || !st.hasMoreTokens())
            {
                String l = br.readLine();
                st = new StringTokenizer(l);
                return next();
            }
            return st.nextToken();
        }
        public boolean hasNext() throws IOException {
            if(st == null || !st.hasMoreTokens())
            {
                String l = br.readLine();
                if(l == null)
                    return false;
                st = new StringTokenizer(l);
                return hasNext();
            }
            return st.hasMoreTokens();
        }
    }

}
