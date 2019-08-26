package com.Judges.UVA;

import java.util.Scanner;

public class U10703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int w, h, n;
            w = sc.nextInt();
            h = sc.nextInt();
            n = sc.nextInt();
            if(w == h && h == n && n == 0)
                break;
            boolean[][] marked = new boolean[w+1][h+1];
            while (n-- > 0) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int x2 = sc.nextInt();
                int y2 = sc.nextInt();
                for (int i = Math.min(x,x2) ; i <= Math.max(x,x2); i++)
                    for (int j = Math.min(y,y2) ; j <= Math.max(y,y2); j++)
                        marked[i][j] = true;
            }
            int count = 0;
            for (int i = 1; i <= w; i++)
                for (int j = 1; j <= h; j++)
                    count += marked[i][j] ? 0 : 1;
            //
            if(count == 0)
            {
                System.out.println("There is no empty spots.");
            }else if(count == 1)
            {
                System.out.println("There is one empty spot.");
            }else
                System.out.println("There are "+count+" empty spots.");
        }
    }

}
