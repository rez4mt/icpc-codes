package com.ICPC.CoachAcademy.Placement;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[N];
        for(int i = 0 ; i < N ; i++)
        {
            list[i] = sc.nextInt();
        }
        int l = 0 ;
        int r = N-1;
        int fsum = 0 ;
        int lsum = 0 ;
        boolean turn = false;
        while (l!=r)
        {
            if(turn)
            {
                if(list[r]>list[l])
                {
                    fsum+=list[r--];
                }else
                {
                    fsum+=list[l++];
                }
            }else
            {
                if(list[r]>list[l])
                {
                    lsum+=list[r--];
                }else
                {
                    lsum+=list[l++];
                }
            }
            turn = !turn;
        }
        if(turn)
        {
            fsum+=list[r];
        }else
        {
            lsum+=list[r];
        }
        System.out.println(lsum+" "+fsum);
    }
}
