package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class U11094 {
    public static void main(String[] args) throws IOException {
        FR fr = new FR();
        while (true)
        {

            int a = fr.nextInt();
            int b = fr.nextInt();
            char[][] map = new char[a][b];
            for(int i = 0 ; i < a ; i++)
            {
                String d = fr.nextLine();
                for(int j = 0 ; j < b ; j++)
                {
                    map[i][j] = d.charAt(j);
                }
            }
            int x = fr.nextInt();
            int y = fr.nextInt();

        }
    }

    static class FR{
        BufferedReader br ;
        StringTokenizer st;
        public FR()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() throws IOException
        {
            if(st == null || !st.hasMoreTokens())
            {
                st = new StringTokenizer(br.readLine());
                return next();
            }

            return st.nextToken();
        }
        public int nextInt() throws IOException
        {
            return Integer.parseInt(next());
        }
        public String nextLine() throws IOException
        {
            st = null;
            return br.readLine();
        }
    }
}
