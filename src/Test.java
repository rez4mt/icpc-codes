
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.util.*;
public class Test {
    public static void main(String[] args) throws Exception {
        FR sc = new FR();
        int n = sc.nextInt();
        double ans = 0 ;
        for(int i = 1 ; i <= n ; i++)
            ans += 1d/i;
        System.out.printf("%.12f\n",ans);
    }


    static class FR{
        BufferedReader br;
        StringTokenizer st;
        public FR()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        public String next() throws Exception
        {
            if(st == null || !st.hasMoreTokens())
            {
                st = new StringTokenizer(br.readLine());
                return next();
            }
            return st.nextToken();
        }
        public String nextLine() throws IOException {
            st = null;
            return br.readLine();
        }
        public int nextInt() throws Exception
        {
            return Integer.parseInt(next());
        }
        public double nextDouble() throws Exception
        {
            return Double.parseDouble(next());
        }
    }

}