package com.Judges.CodeForce. CF1365;
import java.util.*;
import java.io.*;

public class A{
    static PrintWriter pw ;
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
    static int[][] map;
    static int n,m;

    public static void main(String[] args) throws Exception{
        FastReader sc = new FastReader();
        int T = sc.nextInt();
        pw = new PrintWriter(System.out);
        map = new int[51][51];
        while (T-->0)
        {
            n = sc.nextInt();
            m = sc.nextInt();
            int[][] map = new int[n][m];
            HashSet<Integer> rows = new HashSet<>(n);
            HashSet<Integer> cols = new HashSet<>(m);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    map[i][j] = sc.nextInt();
                    if (map[i][j] == 1) {
                        rows.add(i);
                        cols.add(j);
                    }
                }
            }

            boolean ash = false;

            LOOP:
            while (rows.size()!=n && cols.size()!=m) {
                int row = 0;
                int col = 0;
                while (rows.contains(row))
                    row++;
                while (cols.contains(col))
                    col++;
                for (int i = row; i < n; i++) {
                    for (int j = col; j < m; j++) {
                        if (map[i][j]==0) {
                            rows.add(i);
                            cols.add(j);
                            for (int k = 0; k < m; k++)
                                map[i][k] = 1;
                            for (int k = 0; k < n; k++)
                                map[k][j] = 1;
                            ash = !ash;
                            continue LOOP;
                        }
                    }
                }
            }
            if(ash)
                System.out.println("Ashish");
            else
                System.out.println("Vivek");
        }
        pw.flush();
    }

    static boolean canMove(int i , int j )
    {
        if(i!=0 && map[i-1][j]==1)
            return false;
        if(i <n-1 && map[i+1][j]==1)
            return false;
        if(j!=0 && map[i][j-1]==1)
            return false;
        if(j <m-1 && map[i][j+1]==1)
            return false;
        return true;
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
