package com.Judges.UVA;

import java.util.Scanner;

public class U541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int x = -1;
            int y = -1;
            int n = sc.nextInt();
            if(n == 0)
                break;
            int[][] arr = new int[n][n];
            int sum = 0;
            boolean valid = true;
            for(int i = 0 ; i < n ; i++)
            {
                sum = 0;
                for(int j = 0 ; j < n ; j ++)
                {
                    arr[i][j] = sc.nextInt();
                    sum+= arr[i][j];
                }
                if(sum%2!=0)
                {
                    if(x==-1) {
                        x = i;
                    }else valid = false;
                }
            }
            for(int i = 0 ; i < n ; i ++)
            {
                sum = 0;
                for(int j = 0 ; j < n ; j++)
                {
                    sum+=arr[j][i];
                }
                if(sum%2!=0)
                {
                    if(y==-1) {
                        y = i;
                    }else valid = false;
                }
            }

            if(!valid || (x== -1 && y != -1) || (x != -1 && y == -1))
                System.out.println("Corrupt");
            else
            {
                if(x == -1)
                    System.out.println("OK");
                else System.out.printf("Change bit (%d,%d)\n",x+1,y+1);
            }

        }
    }
}
