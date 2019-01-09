package com.Judges.uri;

import java.util.Scanner;

public class P1160 {
    public static void main(String[] args) {
        new P1160();
    }
    public P1160()
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double pa,pb;
        double ga,gb;
        int counts = 0;
        for(int i = 0 ; i < t ; i++)
        {
            counts = 0;
            pa = sc.nextInt();
            pb = sc.nextInt();
            ga = Double.parseDouble(sc.next());
            gb = Double.parseDouble(sc.next());

            while(pa <= pb)
            {
                //pa += (int) (pa * (ga/100));
                //pb += (int) (pb * (gb/100));
                pa = (int) (pa * (1.0+(ga/100)));
                pb = (int) (pb * (1.0+(gb/100)));
                if(counts > 100)
                    break;
                counts ++;
            }
            if(counts > 100)
            {
                System.out.print("Mais de 1 seculo.\n");
                continue;
            }
            System.out.printf("%d anos.\n",counts);
        }

    }
}
