package com.AOU.ACPC.T2019;

import java.awt.*;
import java.util.ArrayDeque;
import java.util.Scanner;

public class D {
    static Org[][] map ;
    static boolean found = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] starts = new int[][]{{2,2} , {9,2} , {2,9} , {9,9} };
        int[][] blocks = new int[][]{{5,5} , {5,6} , {6,5} , {6,6} , {8,1} , {8,2} , {9,1} , {8,9} , {8,10} , {9,10} };
        char[] letters = new char[]{'D','R','L','U'};
        int[] dx = new int[]{1,0,0,-1};
        int[] dy = new int[]{0,1,-1,0};

        map = new Org[12][12];
        for(int i = 0 ; i < 12;i++)
            for(int j = 0 ; j < 12 ; j++)
                map[i][j] = new Org(-1,-1,(char) 0);
        int T = sc.nextInt();
        while (T-->0)
        {
            boolean flag = false;
            for(int i = 0 ; i < 12;i++)
                for(int j = 0 ; j < 12 ; j++)
                {
                    map[i][j].cx = -1;
                    map[i][j].cy = -1;
                    map[i][j].letter = ' ';
                    map[i][j].visited = false;
                }
            found = false;
            for(int i = 0 ; i  < starts.length ; i++)
            {
                map[starts[i][0]][starts[i][1]].letter = '*';
            }
            for(int i = 0 ; i  < blocks.length ; i++)
            {
                map[blocks[i][0]][blocks[i][1]].letter = '.';
            }
            ArrayDeque<Point> p =new ArrayDeque<>();
            int aa = sc.nextInt()-1;
            int bb = sc.nextInt()-1;
            map[aa][bb] . visited = true;
            p.add(new Point(aa,bb));
            int last_x=0 , last_y =0;

            StringBuilder b = new StringBuilder();
            while (!p.isEmpty())
            {
                Point current_p = p.remove();
                if(map[current_p.x][current_p.y].letter == '*')
                {
                    System.out.println(0);
                    System.out.println();
                    flag = true;
                    break;
                }
                for(int i = 0 ; i < 4 ; i++)
                {
                    int nx = current_p.x + dx[i];
                    int ny = current_p.y + dy[i];

                    if(nx >=12 || ny >= 12 || nx < 0 || ny < 0)
                        continue;
                    if(map[nx][ny].letter == '.')
                        continue;
                    if(map[nx][ny].visited)
                        continue;

                    map[nx][ny].cx = current_p.x;
                    map[nx][ny].cy = current_p.y;
                    map[nx][ny].visited = true;
                    if(map[nx][ny].letter == '*')
                    {
                        last_x = nx ;
                        map[nx][ny].letter = letters[i];
                        last_y = ny;
                        p.clear();
                        break;
                    }
                    map[nx][ny].letter = letters[i];
                    p.add(new Point(nx,ny));
                }
            }
            if(!flag)
            {
                while (map[last_x][last_y].cx != -1)
                {
                    b.append(map[last_x][last_y].letter);
                    Org n = map[last_x][last_y];
                    last_x = n.cx;
                    last_y = n.cy;

                }
                System.out.println(b.length());
                System.out.println(b.reverse().toString());
            }


        }

    }
    static class Org{
        int cx , cy;
        char letter ;
        boolean visited = false;
        public Org(int cx , int cy , char d)
        {
            this.letter = d;
            this.cx = cx;
            this.cy = cy;
        }
    }
}
