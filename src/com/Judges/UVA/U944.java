package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.BitSet;
import java.util.HashMap;
import java.util.StringTokenizer;

public class U944 {
    static HashMap<Integer,Integer> map;
    static int MAX = 99999+1;
    public static void main(String[] args) throws IOException{
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        map = new HashMap<>();
        for(int i = 1 ; i < MAX;i++)
        {
            int number = i,counts = 1;
            while (number>=10)
            {
                counts++;
                int c = 0;
                while (number!=0)
                {
                    int temp = number%10;
                    c+= Math.pow(temp,2);
                    number/=10;
                }
                number = c;
            }
            if(number==7)
                counts+=5;
            if(number==1 || number==7)
                map.put(i,counts);

        }        int c = 0;
        while (true)
        {

            String line = fr.nextLine();
            if(line == null || line.equals(""))
                break;
            StringTokenizer st = new StringTokenizer(line," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(c!=0)
            {
                pw.println();
            }else c++;
            for(int i = a;i<=b;i++)
            {
                if(map.containsKey(i))
                    pw.printf("%d %d\n",i,map.get(i));
            }

        }
        pw.flush();
    }

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
}
