package com.Judges.UVA;

import java.util.Scanner;

public class U10339 {
    static long MIN_SEC = 60;
    static long HOUR_SEC =3600;
    static long HALF_DAY_SEC = 43200;
    static long FULL_DAY_SEC = 86400;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int k = sc.nextInt();
            int m = sc.nextInt();
            int diff = Math.abs(k-m);
            if(diff == 0)
            {
                System.out.printf("%d %d %02d:%02d\n",k,m,12,0);
                continue;
            }

            long seconds = (HALF_DAY_SEC *
                    (FULL_DAY_SEC-k)/diff)
                    % 43200 +30;
            long min = (seconds / HOUR_SEC) % 12;
            System.out.printf("%d %d %02d:%02d\n",k,m,min==0?12:min,(seconds / MIN_SEC) % 60);
        }
    }

}
