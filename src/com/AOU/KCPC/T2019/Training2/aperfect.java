//package com.AOU.KCPC.T2019.Training2;

import java.io.File;
import java.util.Scanner;

public class aperfect {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("aperfect.in"));
        //Scanner sc = new Scanner(System.in);
        String line = "Sun Mon Tue Wed Thr Fri Sat";
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            int start = sc.nextInt()-1;
            System.out.println(line);
            for(int i = 0 ; i < start ; i++)
                System.out.printf("%-3s " , "*");

            int current = 1 ;
            for(int i = 1 ; i <= 7 - start ; i++)
                System.out.printf(i == 7 - start ? "%-3d" :"%-3d " , current++);
            System.out.println();

            int count = (N - (7-start));
            int lines = (count / 7) ;
            if(count%7 != 0)
                lines ++;
            for(int i = 0 ; i< lines ;i++)
            {
                for(int j = 1 ; j <= 7 ;j++)
                {
                    if(current<=N)
                        System.out.printf(j == 7 ? "%-3d" :"%-3d ",current++);
                    else System.out.printf(j == 7 ?"%-3s":"%-3s ","*");
                }
                System.out.println();
            }


        }
    }
}
