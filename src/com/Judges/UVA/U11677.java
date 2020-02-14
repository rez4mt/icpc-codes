package com.Judges.UVA;

import java.util.Scanner;

public class U11677 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();
            if(h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0)
                break;
            int hdiff = h2 - h1;
            if(hdiff <0 || hdiff==0 && m2 < m1)
            {
                while (hdiff <= 0)
                    hdiff+=24;
            }

            int mdiff = m2 - m1;
            System.out.println(mdiff + (hdiff*60L));
        }
    }
}
