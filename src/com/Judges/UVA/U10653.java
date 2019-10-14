package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.StringTokenizer;

public class U10653 {

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


    public static void main(String[] args)throws Exception {
        FastReader fr = new FastReader();
        //int T = fr.nextInt();
        int[] move_x = new int[]{0,0,1,-1};

        int[] move_y = new int[]{1,-1,0,0};
        while (true)
        {

            int N = fr.nextInt();
            int M = fr.nextInt();
            if(N == 0 && M==0)
                break;
            int[][] grid = new int[N][M];
            boolean[][] visited = new boolean[N][M];
            int[][] dist_to = new int[N][M];
            ArrayDeque<Pair> deque = new ArrayDeque<>();
            int R = fr.nextInt();
            for(int i = 0 ; i < R ; i++)
            {
                int r_number = fr.nextInt();
                int b_count = fr.nextInt();
                while (b_count-->0)
                {
                    int c = fr.nextInt();
                    visited[r_number][c] = true;
                }
            }
            int start_x = fr.nextInt();
            int start_y = fr.nextInt();
            deque.add(new Pair(start_x , start_y));

            int _x = fr.nextInt(), _y = fr.nextInt();
            dist_to[start_x][start_y] = 0;
            while (!deque.isEmpty())
            {
                Pair current = deque.remove();
                for(int i = 0 ; i < 4 ;i++)
                {
                    int next_x = current.x + move_x[i];
                    int next_y = current.y + move_y[i];
                    if(next_x<0 || next_y<0)
                        continue;
                    if(next_x>=N || next_y>=M)
                        continue;

                    if(!visited[next_x][next_y]) {
                        visited[next_x][next_y] = true;
                        dist_to[next_x][next_y] = dist_to[current.x][current.y] + 1;
                        deque.add(new Pair(next_x,next_y));
                    }
                }
            }
            if(visited[_x][_y])
                System.out.println(dist_to[_x][_y]);


        }
    }
    static class Pair{
        int x , y;
        public Pair(int x , int y)
        {
            this.x = x;
            this.y = y;
        }
    }
}
