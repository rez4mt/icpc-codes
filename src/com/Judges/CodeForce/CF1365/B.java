package com.Judges.CodeForce. CF1365;
import java.util.*;
import java.io.*;

public class B {
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
    public static void main(String[] args) throws Exception{
        FastReader sc = new FastReader();
        int T = sc.nextInt();
        pw = new PrintWriter(System.out);
        while (T-->0)
        {
            /*int n ,a[] ,b[];

            n = sc.nextInt();
            a = new int[n];
            b = new int[n];
            HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();
            for (int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
                if(map.get(a[i])==null)
                    map.put(a[i],new ArrayList<>());
                map.get(a[i]).add(i);
            }
            HashSet<Integer>[] set = new HashSet[100000+5];
            for (int i = 0; i < n; i++)
            {
                b[i] = sc.nextInt();
                if(set[a[i]]==null)
                    set[a[i]] = new HashSet<>();
                set[a[i]].add(b[i]);

            }
            boolean yes = true;
            for (int i = 0; i < n-1 && yes; i++) {
                for (int j = i+1; j < n; j++) {
                    if (a[j]<a[i] && b[i]!=b[j]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                        b[i] = (b[i]+1)%2;
                        b[j] = (b[j]+1)%2;
                        map.get(a[i]).add(j);
                        map.get(a[j]).add(i);
                    }else if(b[i]==b[j])
                    {
                        if(set[a[i]].size() == 2)
                        {
                            for (int p : map.get(a[i])) {
                                if(a[i] == a[p] && b[p]!=b[j])
                                {
                                    b[p] = (b[p]+1)%2;
                                    b[i] = (b[i]+1)%2;
                                    j--;
                                    break;
                                }
                            }
                        }else if(set[a[j]].size()==2)
                        {
                            for (int p : map.get(a[j])) {
                                if(a[j] == a[p] && b[p]!=b[j])
                                {
                                    b[p] = (b[p]+1)%2;
                                    b[j] = (b[j]+1)%2;
                                    j--;

                                    break;
                                }
                            }
                        }

                    }
                }
            }
            if(yes)
            {
                for (int i = 0; i < n-1; i++) {
                    if (a[i+1]<a[i]) {
                        yes = false;
                        break;
                    }
                }
            }
            System.out.println(yes? "Yes" : "No");*/
            int n = sc.nextInt();
            int[] list = new int[n];
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0 ; i < n ; i++)
                list[i] = sc.nextInt();
            for(int i = 0 ; i <n ; i++)
                set.add(sc.nextInt());
            if(set.size() == 2)
                System.out.println("YES");
            else
            {
               boolean yes = true;
                for (int i = 0; i < n-1; i++) {
                    if (list[i+1]<list[i]) {
                        yes = false;
                        break;
                    }
                }
                if(yes)
                    System.out.println("YES")
                            ;
                else System.out.println("NO");
            }
        }
        pw.flush();
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
