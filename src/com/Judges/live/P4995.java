package com.Judges.live;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P4995 {

    static class FastReader {
            BufferedReader br;
            StringTokenizer st;
            FastReader() { // To read from the standard input
                br = new BufferedReader(new InputStreamReader(System.in));
            }
            // You can add a constructor to read from a file
            /////
            String next() throws IOException {
                while (st == null || !st.hasMoreTokens())
                    st = new StringTokenizer(br.readLine());
                return st.nextToken();
            }
            String nextLine() throws IOException { return br.readLine(); }
            int nextInt() throws IOException { return Integer.parseInt(next()); }
            //You can add nextDouble() etc...
            boolean hasNext() throws IOException { // if input is terminated by EOF
                String s = br.readLine();
                if (s == null) return false;
                st = new StringTokenizer(s);
                return true;
            }
        } //end FastReader

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader();
        int C = 1;
        while (fr.hasNext())
        {
            String s = fr.next();
            if(s.equals("#"))
                break;
            System.out.print("Case "+C+++": ");
            switch (s)
            {
                case "HELLO":
                    System.out.println("ENGLISH");
                    break;
                case "HOLA":
                    System.out.println("SPANISH");
                    break;
                case "HALLO":
                    System.out.println("GERMAN");
                    break;
                case "BONJOUR":
                    System.out.println("FRENCH");
                    break;
                case "CIAO":
                    System.out.println("ITALIAN");
                    break;
                case "ZDRAVSTVUJTE":
                    System.out.println("RUSSIAN");
                    break;
                default:
                    System.out.println("UNKNOWN");
            }
        }
    }
}
