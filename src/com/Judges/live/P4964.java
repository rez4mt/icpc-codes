package com.Judges.live;

import java.util.Scanner;

class P4964 {
    public static void main(String[] args) {
        int[] n =new int[3];
        Scanner sc =  new Scanner(System.in);
        double subt;
        while (true)
        {
            n[0] = sc.nextInt();
            n[1] = sc.nextInt();
            n[2] = sc.nextInt();
            if(n[0] == 0 && n[1]==0 && n[2] == 0 )
                break;
            subt = (double)(n[1]-n[0]);
            if(n[1]+subt == n[2])
            {
                //AP
                System.out.printf("AP %.0f\n",n[2]+subt);
            }else
            {
                System.out.printf("GP %d\n",n[2]*(n[1]/n[0]));
            }
        }
    }
}
