package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class U441 {
    public static void main(String[] args) throws IOException{
        FastReader fr = new FastReader();
        boolean first = true;
        while (true)
        {
            int N = fr.nextInt();
            if(N == 0)
                break;
            if(!first)
                System.out.println();
            else first = false;
            Integer[] list = new Integer[N];

            for(int i = 0 ; i < N ; i++)
                list[i] = fr.nextInt();

            Arrays.sort(list,new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2) {
                    return -Integer.compare(o1,o2);
                }
            });
            System.out.println(Arrays.toString(list));
            int pow = 1<<N;
            for(int i = pow-1 ; i >= 0 ; i--)
            {
                if(Integer.bitCount(i) == 6)
                {

                    StringBuilder b = new StringBuilder();
                    //go through them all add 1s
                    for(int j = N-1 ; j >=0 ; j--)
                    {
                        if(((1<<j)& i) != 0)
                        {
                            b.append(list[j]+" ");
                        }
                    }
                    b.deleteCharAt(b.length()-1);
                    System.out.println(b);
                }
            }
        }
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
