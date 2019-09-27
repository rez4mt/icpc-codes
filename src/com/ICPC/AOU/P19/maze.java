package com.ICPC.AOU.P19;

import java.util.ArrayDeque;
import java.util.Scanner;

public class maze {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T  =sc.nextInt();
        int[] dx =new int[] {-1, 1, 0, 0}, dy = new int[]{0, 0, -1, 1};;
        while (T-->0)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] visited = new int[N][M];
            char[][] mat = new char[N][];
            int end_x =-1, end_y =-1;
            int start_x = -1 , start_y =-1;
            for(int i = 0 ; i < N ; i++)
            {
                mat[i] = sc.next().toCharArray();
                for(int j = 0 ; j < M ; j++)
                {

                    if( mat[i][j] == 'S')
                    {
                        start_x = i ;
                        start_y = j ;
                    }else if(mat[i][j] == 'E')
                    {
                        end_x = i ;
                        end_y = j ;
                    }
                }

            }
            ArrayDeque<inf> deq = new ArrayDeque<>();
            deq.push(new inf(start_x , start_y , 1));
            visited[start_x][start_y] = 1;
            while (visited[end_x][end_y] ==0 &&  !deq.isEmpty())
            {
                inf cur = deq.remove();
                for(int d = 0 ; d < 4 ; d++)
                {
                    inf next = cur.clone();
                    int nx = next.x + dx[d];
                    int ny = next.y + dy[d];
                    if (nx < 0 || ny < 0 || nx == N || ny == M)
                        continue;
                    next.move++;
                    switch(mat[nx][ny]) {
                        case 'E':
                            visited[end_x][end_y] = next.move;

                            break;
                        case 'a':
                        case 'b':
                        case 'c':
                            next.keys |= 1 << ((mat[nx][ny] - 'a') + 1) ;
                            if(should(visited[nx][ny],next.keys))
                            {
                                visited[nx][ny] = next.keys;
                                deq.add(next);
                            }
                            break;
                        case '.':
                        case 'S':
                            next.keys |= 1;
                            if (should(visited[nx][ny],next.keys)) {
                                visited[nx][ny] = next.keys;
                                deq.add(next);
                            }
                            break;
                        case 'A':
                        case 'B':
                        case 'C':
                            if ((next.keys & (1 << ((visited[nx][ny] - 'A') + 1)))!=0 && should(visited[nx][ny], next.keys)) {
                                visited[nx][ny] = next.keys;
                                deq.add(next);
                            }
                            break;
                    }
                }
            }
            if(visited[end_x][end_y] != 0)
            {
                System.out.println(visited[end_x][end_y]);
            }else System.out.println("-1");

        }

    }
    static boolean  should(int gate , int key)
    {
        return (gate | key) != gate;
    }
    static class inf{
        int move = 0 ;
        int x , y ;
        int keys = 0;
        public inf(int x , int y , int key)
        {
            this.x = x;
            this.y = y;
            keys = key;
        }
        public inf(int x , int y , int key,int mv)
        {
            this.x = x;
            this.y = y;
            keys = key;
            move = mv;
        }

        @Override
        protected inf clone() {
            return new inf(x,y,keys,move);
        }
    }
}
