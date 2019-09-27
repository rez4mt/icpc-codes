package com.AOU.KCPC.T2019.Training2;

import java.io.File;
import java.util.Scanner;

public class best {
    public static void main(String[] args)  throws Exception {
        Scanner sc = new Scanner(new File("best.in"));
        //Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            long r , l ;
            r = sc.nextLong();
            l = sc.nextLong();
            long sum = 0;
            int sqrt =(int) Math.sqrt(r);
            for(int i = 2 ; i < 60; i++)
            {
                double root = Math.pow(l , 1d / i);
                if(root<2)
                    break;
                int floor = (int) root;
                sum += (floor-1)*i;
                double root2 = Math.pow(r , 1d / i);
                int floor2 = (int)root2;
                sum-=(floor2-1) * i;
                if(Math.abs(root2-floor2)<10e-9)
                    sum+=i;
            }

            System.out.println(sum);
        }
    }
}
