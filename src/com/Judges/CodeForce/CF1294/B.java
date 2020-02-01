package com.Judges.CodeForce.CF1294;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            obj[] list = new obj[N];
            for(int i = 0 ; i < N ; i++)
            {
                list[i] = new obj();
                list[i].x = sc.nextInt();
                list[i].y = sc.nextInt();
            }
            StringBuilder bw = new StringBuilder();
            Arrays.sort(list);
            int x = 0 , y = 0 ;
            boolean flag = true;
            for(int i = 0 ; i < N ; i++)
            {
                if(list[i].y < y)
                {
                    flag = false;
                    break;
                }
                if(list[i].x>x)
                {
                    for(int j = 0 ; j <list[i].x-x ;j++)
                        bw.append("R");
                    x = list[i].x;
                }
                if((list[i].y>=y))
                {
                    for(int j = 0 ; j <list[i].y-y ;j++)
                        bw.append("U");
                    y = list[i].y;
                }

            }
            if(!flag)
            {
                System.out.println("NO");
            }else
            {
                System.out.println("YES");
                System.out.println(bw);
            }
        }
    }
    static class obj implements Comparable<obj>
    {
        int x,  y;

        @Override
        public int compareTo(obj o) {
            int cmp = Integer.compare(x,o.x);
            if(cmp == 0)
            {
                return Integer.compare(y,o.y);
            }
            return cmp;
        }

        @Override
        public String toString() {
            return x+" "+y;
        }
    }
}
