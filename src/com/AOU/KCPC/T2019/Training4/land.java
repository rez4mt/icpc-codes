package com.AOU.KCPC.T2019.Training4;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class land {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(new File("land.in"));
        int T = sc.nextInt();
        while (T-->0)
        {
            ps[] p = new ps[2];
            p[0] = new ps(sc.nextInt(), sc.nextInt());
            p[1] = new ps(sc.nextInt(), sc.nextInt());
            Arrays.sort(p,0 , 2);
            if(p[0].r >= p[1].l || p[0].l >= p[1].r)
                System.out.println("War");
            else System.out.println("Peace");
        }

    }
    static class ps implements Comparable<ps>{
        @Override
        public int compareTo(ps o) {
            int cmp = Integer.compare( l , o.l );
            return cmp ;
        }

        int l , r ;

        @Override
        public String toString() {
            return String.format("[%d %d]",l , r );
        }

        public ps(int l , int r)
        {
            this.l = l ;
            this.r = r;
        }
    }
}
