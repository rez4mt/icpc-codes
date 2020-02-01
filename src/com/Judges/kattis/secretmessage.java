package com.Judges.kattis;

import java.util.*;

public class secretmessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            String s = sc.next();
            int N = s.length();
            int pad = (int)Math.ceil(Math.sqrt(1d*N));
            char[][] map = new char[pad][pad];
            int current = 0 ;
            for(int i = 0 ; i <  pad ; i++)
            {
                for(int j = 0 ; j <  pad ; j++)
                    map[i][j] = current>=N?'*': s.charAt(current++);
            }
            StringBuilder bw = new StringBuilder();
            for(int j = 0 ; j < pad ; j++)
            {
                for(int i = pad-1; i >= 0 ;i--)
                {
                    bw.append(map[i][j]=='*'?"":map[i][j]);
                }
            }
            System.out.println(bw.toString());
        }
    }
}
