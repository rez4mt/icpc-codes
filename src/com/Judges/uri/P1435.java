package com.Judges.uri;

import java.util.Scanner;

public class P1435 {
    public static void main(String[] args) {
        new P1435();
    }
    public P1435()
    {
        Scanner sc = new Scanner(System.in);
        int s,from,to,current = 1;
        int loops = 0;
        int[][] mat ;
        for(;;)
        {
            s = sc.nextInt();
            //2

            if(s == 0)
                break;
            from = 0;
            to = s;
            current = 1;
            loops = 0;
            mat = new int[s][s];
            while(loops < (s/2)+1)
            {
                for(int i = from ; i < s - from ; i++)
                {

                    for(int j = from ; j < s - from ; j++)
                    {
                        mat[i][j] = current;
                    }
                }
                from++;
                loops++;
                current++;
            }

            for(int i = 0 ;i < s;i++ )
            {
                for(int j = 0 ; j < s ; j++)
                {
                    if( j == 0)
                        System.out.printf("%3d",mat[i][j]);
                    else
                        System.out.printf(" %3d",mat[i][j]);

                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
