package com.Judges.UVA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class U10020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int M = sc.nextInt();
            int current_l = Integer.MIN_VALUE,distance = Integer.MAX_VALUE;
            while (true)
            {
                int l,r;
                l = sc.nextInt();
                r = sc.nextInt();
                if(l==0 && r==0)
                    break;
                if(l<=0 && (distance>r-l && r>=M ))
                {
                    if(distance > r-l)
                    {
                        current_l = l;
                        distance = r-l;
                    }
                }

            }
            if(current_l+(distance)<M)
            {
                System.out.println(0);
            }else
            {
                System.out.println(current_l+" "+(distance-current_l));
            }

            if(T!=0)
                System.out.println();
        }
    }
    static class S{

        int L,R;
        public S(int L,int R)
        {
            this.L = L;
            this.R = R;
        }

    }
}
