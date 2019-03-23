package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class U11565 {
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

    public static void main(String[] args) throws IOException{
        FastReader fr = new FastReader();
        int T = fr.nextInt();
        int MAX = 10000;
        while (T-->0)
        {
            int A , B , C;
            A = fr.nextInt();
            B = fr.nextInt();
            C = fr.nextInt();
            if(A<3 ||  C <=3)
            {
                System.out.println("No solution.");
                continue;
            }
            boolean found = false;
            for(int i = 1; i < MAX && !found; i++)
            {
                for(int j = 1 ; j < MAX && !found; j++)
                {
                    int ij = i*j;
                    if(ij >= MAX)
                        break;
                    int z = A - (i+j);
                    int xyz = ij*z;
                    if(xyz <= MAX)
                    {
                        if(xyz == B && i*i + j*j + z*z == C)
                        {
                            found = true;
                            System.out.println(i+" "+j+" "+z);
                        }
                    }
                }
            }
            if(!found)
            {
                System.out.println("No solution.");
            }
        }
    }

}
