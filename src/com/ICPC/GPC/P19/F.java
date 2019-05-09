package com.ICPC.GPC.P19;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class F {

    static class FastReader {
            BufferedReader br;
            StringTokenizer st;
            FastReader(File f) throws Exception
            {
                this(new FileReader(f));
            }FastReader(String f) throws Exception
        {
            this(new File(f));
        }
            FastReader() { // To read from the standard input
                this(new InputStreamReader(System.in));
            }
            FastReader(InputStreamReader sr)
            {
                br = new BufferedReader(sr);
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
    static boolean[][] visited ;
    static int[][] moves = new int[][]{{1,0},{1,-1},{1,1},{0,1},{0,-1},{-1,0},{-1,1},{-1,-1}};
    static char[][] matrix;
    static int count = 0;
    static long MAX = Long.MIN_VALUE;
    static int A;
    public static void main(String[] args) throws Exception {
        Scanner fr = new Scanner(new File("input/fruit.in"));
        while (true)
        {
            A = fr.nextInt();
            if(A==0)
                break;
            int B = fr.nextInt();
            matrix = new char[A][A];
            visited = new boolean[A][A];
            MAX = Long.MIN_VALUE;
            count = 0;

            HashMap<Character,Integer> map = new HashMap<>();
            for(int i = 0 ; i < A ; i++)
                for(int j = 0 ; j<A;j++)
                    matrix[i][j] = fr.next().charAt(0);
                //
            fr.nextLine();
            String data = fr.nextLine();
            Scanner sc2 = new Scanner(data);
            while (sc2.hasNext())
                map.put(sc2.next().charAt(0),sc2.nextInt());

            for(int i = 0 ; i < A ; i++)
                for(int j = 0 ; j<A ;j++)
                {
                    if(visited[i][j])
                        continue;
                    count = 0;
                    dfs(i,j,matrix[i][j]);
                    int val =  map.containsKey(matrix[i][j])?map.get(matrix[i][j]):map.get('#');
                    if(count <=3)
                        count = 0;
                    MAX = Math.max(MAX,1l * val * count);
                }
                //
            //

            System.out.println(MAX);

        }

    }
    private static void dfs(int i,int j,char ch)
    {
        visited[i][j] = true;
        count++;
        for (int[] m:
                moves) {
            if(!isSafe(i,j,m[0],m[1]) || visited[i+m[0]][j+m[1]])
                continue;
            if(matrix[i][j] == matrix[i+m[0]][j+m[1]])
                dfs(i+m[0],j+m[1],ch);
        }
    }

    private static boolean isSafe(int cx,int cy,int x,int y)
    {
        return cx+x<A && cy+y<A && cy+y>=0 && cx+x>=0;
    }

}
