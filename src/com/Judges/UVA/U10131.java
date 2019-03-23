package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class U10131 {
    static List<mKey> al;

    public static void main(String[] args) throws IOException {
        FastReader fr  = new FastReader();
        TreeMap<mKey,Integer> map = new TreeMap<>();
        while (fr.hasNext())
            map.put(new mKey(fr.nextInt(),fr.nextInt()),map.size()+1);
        //find lis
        System.out.println(map);
        LIS(map);
        System.out.println(al);
        for (mKey m :
                al) {
            System.out.println(map.get(m));
        }
    }
    static class mKey implements Comparable<mKey>{
        int W,S;

        @Override
        public String toString() {
            return W + " "+ S;
        }

        public mKey(int W, int S)
        {
            this.W = W;
            this.S = S;
        }
        @Override
        public int compareTo(mKey o) {
            if(W == o.W)
            {
                if(S == o.S)
                    return 0;
                return o.S > S?1:-1;
            }
            return W>o.W ? -1:1;
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
            String s = null;
            s = br.readLine();
            if (s == null) return false;
            st = new StringTokenizer(s);
            return true;
        }
    } //end FastReader

    public static int LIS(TreeMap<mKey,Integer> map) {
        if (map == null || map.size() == 0) {
            return 0;
        }
        al = new ArrayList<>();
        for (mKey num : map.keySet()) {
            if (al.isEmpty() || num.S < al.get(al.size() - 1).S) {
                al.add(num);
            } else {
                int i = 0;
                int j = al.size() - 1;

                while (i < j) {
                    int mid = (i + j) / 2;
                    if (al.get(mid).S < num.S) {
                        i = mid + 1;
                    } else {
                        j = mid;
                    }
                }

                al.set(j, num);
            }
        }

        return al.size();
    }

}
