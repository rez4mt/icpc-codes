package com.Judges.UVA;

import java.util.Scanner;
public class U161 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mins = 5 * 60 * 60;
        while (true) {
            int[] list = new int[101];
            int N = 0;
            int start_time = Integer.MAX_VALUE;
            while (true) {
                list[N++] = sc.nextInt();

                if (list[N - 1] == 0)
                {
                    N--;
                    break;
                }else start_time = Math.min(start_time , list[N-1]);
            }
            if(list[0] == 0 && list[1] == 0 && list[2] == 0)
                break;
            boolean isOk = false;
            int time = 0 ;
            for (int t = start_time; t <= mins; t++) {
                int count = 0 ;
                for (int i = 0; i < N; i++) {
                    if( t % (list[i]*2) < list[i]-5)
                    {
                        count++;
                    }
                }
                if(count == N)
                {
                    isOk = true;
                    time = t;
                    break;
                }
            }
            if(!isOk)
            {
                System.out.println("Signals fail to synchronise in 5 hours");
            }else
            {
                //print time..
                int h = time / 3600   ;
                time %= 3600;
                int m = time / 60;
                time %= 60;
                System.out.printf("%02d:%02d:%02d\n",h,m,time);

            }

        }
    }
}