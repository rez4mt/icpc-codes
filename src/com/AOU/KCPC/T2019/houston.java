package com.AOU.KCPC.T2019;

import java.util.Scanner;

public class houston {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            points[] p = new points[N];
            points mid_point = new points(0,0,0);
            for(int i = 0 ; i < N ; i++)
            {
                p[i] = new points(sc.nextInt(),sc.nextInt(),sc.nextInt());
                mid_point.x += p[i].x;
                mid_point.y += p[i].y;
                mid_point.z += p[i].z;
            }

            double mx = mid_point.x/(double)N;
            double my = mid_point.y/(double)N;
            double mz = mid_point.z/(double)N;
            System.out.printf("%.4f\n",mx);
            System.out.printf("%.4f\n",my);
            System.out.printf("%.4f\n",mz);

        }
    }

    static class points{
        int x, y ,z ;
        public points(int x , int y , int z)
        {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}
