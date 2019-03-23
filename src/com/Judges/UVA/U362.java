package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class U362 {
    public static void main(String[] args)  throws Exception{
        FastReader fr = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        int TC = 0;
        while (true)
        {
            int N = fr.nextInt();
            if(N == 0)
                break;
            int current = 0;
            int mCount = 0;
            int mTemp = 0;
            pw.printf("Output for data set %d, %d bytes:\n",++TC,N);
            while (current<N)
            {
                mCount++;
                int temp = fr.nextInt();
                current+=temp;
                mTemp+=temp;
                if(mCount % 5 == 0)
                {
                    //output the rem time
                    //speed
                    double transferRate = mTemp*.20d;
                    String out ;
                    if(transferRate == 0)
                    {
                        out = "stalled";
                    }else
                    {
                        double d = (N-current)/transferRate;
                        int remSec = (int) d;
                        if(remSec < d)
                            remSec++;
                        out = remSec+" seconds";
                    }
                    pw.printf("   Time remaining: %s\n",out);
                    mTemp = 0;
                }
            }
            pw.printf("Total time: %d seconds\n",mCount);
            pw.println();
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
