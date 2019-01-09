package com.Judges.CodeForce.CF38;

import java.util.Scanner;

public class B {


    public static void main(String[] args) {
        int[][] chess = new int[8][8];

        Scanner sc = new Scanner(System.in);
        String rock,knight ;

        rock = sc.next();
        knight = sc.next();
        int ka,kb;
        kb = Integer.parseInt(knight.substring(1))-1 ;
        ka = knight.charAt(0) - 97 ;
        int ra,rb;
        rb = Integer.parseInt(rock.substring(1))-1 ;
        ra = rock.charAt(0) - 97 ;

        chess[ka][kb] = 1;
        chess[ra][rb] = 1;

        for(int i =0 ; i < 8;i++)
        {
            chess[i][rb] = 1;
            chess[ra][i] = 1;
        }
        fillMoves(chess, ka, kb);
        fillMoves(chess, ra, rb);
        int sum = 0;
        for(int i = 0 ; i < 8 ; i ++)
        {
            for(int j = 0 ; j < 8 ; j++)
            {
                sum+= chess[i][j] == 0?1:0;
            }
        }
        System.out.println(sum);
        //printChess(chess);

    }

    private static void fillMoves(int[][] chess, int a, int b) {
        int[][] k_moves = new int[][]{{1,2},{1,-2},{-1,2},{-1,-2},{2,1},{2,-1},{-2,1},{-2,-1}};
        int am;
        int bm;
        for (int[] m :
                k_moves) {
            am = a +m[0];
            bm = b +m[1];
            if(am>=0 && bm>=0 && am<8 && bm<8)
                chess[am][bm] = 1;
        }
    }

   /* private static void printChess(int[][] chess)
    {
        for(int i = 0 ; i < 8 ; i++)
        {
            for(int j = 0 ; j < 8 ;j++)
            {
                System.out.printf("%d ",chess[i][j]);
            }
            System.out.println();
        }
    }*/

}
