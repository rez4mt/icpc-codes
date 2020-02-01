package com.Judges.kattis;

import java.util.*;

public class narrowartgallery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int N = sc.nextInt();
            int K = sc.nextInt();
            if(N == 0 && K ==0)
                break;
            boolean[][] closed = new boolean[N][2];
            int[][] list = new int[N][2];
            PriorityQueue<pair> pq = new PriorityQueue<>();
            int[] dx = new int[]{ 0,0, 1,1,-1,-1};
            int[] dy = new int[]{-1,1,-1,1, 1,-1};
            int sum = 0 ;
            for(int i = 0 ; i < N ;i++)
            {
                list[i][0]  = sc.nextInt();
                list[i][1]  = sc.nextInt();
                pq.add(new pair(i,0,list[i][0]));
                pq.add(new pair(i,1,list[i][1]));
                sum+=list[i][0];
                sum+=list[i][1];
            }
            if(K == N)
            {
                int lsum = 0 ;
                int rsum  = 0;
                for(int i = 0; i <  N ;i++)
                {
                    lsum+=list[i][0];
                    rsum += list[i][1];
                }
                System.out.println(Math.max(lsum,rsum));
                continue;
            }
            int removed = 0 ;

            while (!pq.isEmpty() && removed<K)
            {
                pair p = pq.remove();
                boolean flag = true;
                for(int i = 0 ; i  < dx.length ;i++)
                {
                    //check if we can remove it
                    int nx = p.x + dx[i];
                    int ny = p.y + dy[i];
                    if(nx<0 || nx>=N)
                        continue;
                    if(ny<0 || ny>=2)
                        continue;
                    if(closed[nx][ny])
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag)
                {
                    sum-= p.v;
                    closed[p.x][p.y] = true;
                    removed++;
                }
            }
            System.out.println(sum);

        }

    }
    static class pair implements Comparable<pair>{
        @Override
        public int compareTo(pair o) {
            return Integer.compare(v , o.v);
        }

        int x , y  , v;
        public pair(int x , int y , int v)
        {
            this.x = x;
            this.y = y;
            this.v = v ;
        }
    }

}
