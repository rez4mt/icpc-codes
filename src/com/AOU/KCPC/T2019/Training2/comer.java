package com.AOU.KCPC.T2019.Training2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class comer {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] dx = new int[]{0,0,1,-1};
        int[] dy = new int[]{1,-1,0,0};
        while (T-->0)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();
            char[][] map = new char[N][];
            HashMap<Character , ArrayList<Pair>> hashmap = new HashMap<Character, ArrayList<Pair>>();
            for(int i = 0 ; i < N ; i++)
            {
                map[i] = sc.next().toCharArray();
                for(int j = 0 ; j < M ;j++)
                {
                    if(Character.isAlphabetic(map[i][j]))
                    {
                        //hashmap.computeIfAbsent(map[i][j],);
                        if(hashmap.get(map[i][j]) == null)
                            hashmap.put(map[i][j],new ArrayList<>());

                        ArrayList<Pair> pairs = hashmap.get(map[i][j]);
                        pairs.add(new Pair(i,j));
                        hashmap.put(map[i][j],pairs);
                    }
                }
            }
        //
            boolean[][] visited = new boolean[N][M];
            int[][] dist_to = new int[N][M];
            ArrayDeque<Pair> p = new ArrayDeque<>();
            Pair start = hashmap.get('S').get(0);
            visited[start.x][start.y] = true;
            p.add(start);
            int tx , ty;
            Pair end = hashmap.get('T').get(0);
            tx = end.x;
            ty = end.y;
            while (!p.isEmpty() && !visited[tx][ty])
            {
                Pair current = p.remove();
                for(int i = 0 ; i < 4 ; i++)
                {
                    int _x = current.x + dx[i], _y = current.y+dy[i];
                    if(_x <0 || _y <0)
                        continue;
                    if(_x>=N || _y >=M)
                        continue;
                    if(!visited[_x][_y] && map[_x][_y]!='*')
                    {
                        if(Math.abs(map[_x][_y] - map[current.x][current.y]) <=1)
                        {
                            visited[current.x][current.y] = true;
                            dist_to[_x][_y] = dist_to[current.x][current.y];
                            p.add(new Pair(_x,_y));

                        }else
                        {
                            visited[_x][_y] = true;
                            dist_to[_x][_y] = dist_to[current.x][current.y]+1;
                            p.add(new Pair(_x,_y));
                        }
                        if(Character.isAlphabetic(map[_x][_y]))
                        {
                            for (Pair np :
                                    hashmap.get(map[_x][_y])) {
                                if(visited[np.x][np.y])
                                    continue;
                                dist_to[np.x][np.y] = dist_to[_x][_y];
                                visited[np.x][np.y] = true;
                                p.add(np);
                            }
                            if(hashmap.get((char)(map[_x][_y]+1))!= null)
                            {
                                for (Pair np :
                                        hashmap.get((char)(map[_x][_y]+1))) {
                                    if(visited[np.x][np.y])
                                        continue;
                                    dist_to[np.x][np.y] = dist_to[_x][_y];
                                    visited[np.x][np.y] = true;
                                    p.add(np);
                                }
                            }
                        }
                    }

                }
            }

            /*System.out.println();
            print(dist_to);
            System.out.println();*/
            System.out.println(visited[tx][ty]?dist_to[tx][ty]:-1);
        }
    }
    static class Pair{
        int x, y;
        public Pair(int x,int y)
        {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("[x:%d,y:%d]", x , y);
        }
    }
    private static void print(boolean[][] map)
    {
        for(int i = 0 ; i < map.length ;i++)
        {
            for(int j = 0 ; j < map[i].length;j++)
                System.out.print((map[i][j]?"1":"0")+" ");
            System.out.println();
        }
    }
    private static void print(int[][] map)
    {
        for(int i = 0 ; i < map.length ;i++)
        {
            for(int j = 0 ; j < map[i].length;j++)
                System.out.printf("%3d ",map[i][j]);
            System.out.println();
        }
    }
}
