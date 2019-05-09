package com.ICPC.GPC.P14;

import java.util.Scanner;

public class H {
    static int L,W;
    static int bX,bY;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            L = sc.nextInt();
            W = sc.nextInt();
            Player[] players = new Player[22];

            for(int i = 0 ; i < 11;i++)
            {
                players[i] = new Player(sc.nextInt(),sc.nextInt(),true);
            }

            for(int i = 11 ; i < 22;i++)
            {
                players[i] = new Player(sc.nextInt(),sc.nextInt(),false);
            }
            int p = sc.nextInt();
            bX = players[p-1].x;
            bY = players[p-1].y;

            Player closest_right,closest_left;

        }
    }
    static class Player{
        boolean first = false;
        int x,y;

        boolean offsidePosition = false;

        public Player(int x,int y,boolean first)
        {
            this.x = x;
            this.y = y;
            this.first = first;

        }

        public void offside()
        {
            offsidePosition = true;
        }

    }
}
