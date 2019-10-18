package com.ICPC.KCPC.K2019;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0) {

            int l = sc.nextInt();
            ArrayList<Points> pp = new ArrayList<>(), np = new ArrayList<>(), pn = new ArrayList<>(), nn = new ArrayList<>();
            for (int i = 0; i < l; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (x >= 0 && y >= 0) {
                    pp.add(new Points(x, y));
                } else if (x >= 0) {
                    pn.add(new Points(x, y));
                } else if (y >= 0) {
                    np.add(new Points(x, y));
                } else{
                    nn.add(new Points(x, y));
                }

                Collections.sort(pp);
                Collections.sort(np);
                Collections.sort(pn);
                Collections.sort(nn);

            }

            int t = sc.nextInt();
            for (int i = 0; i < t; i++)
            {
                int cx = sc.nextInt();
                int cy = sc.nextInt();
                int d = 0 ;

                System.out.println(d);
            }

        }
    }
    static int dist(Points p , int x , int y)
    {
        return Math.abs(p.x-x) + Math.abs(p.y-y);
    }
    static class Points implements Comparable<Points>{
        @Override
        public int compareTo(Points o) {
            return Integer.compare(o.distance , distance);
        }

        int x , y;
        int distance ;
        public Points(int x , int y)
        {
            this.x = x ;
            this.y = y ;
            distance = Math.abs(x)+Math.abs(y);
        }
    }
}
