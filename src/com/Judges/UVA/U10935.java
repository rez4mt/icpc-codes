package com.Judges.UVA;

import java.util.Arrays;
import java.util.Scanner;

public class U10935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int n = sc.nextInt();
            if(n == 0)
                break;
            Kill[] list = new Kill[n];
            for(int i = 1 ; i <= n ; i ++)
                list[i-1] = new Kill(i,0);

            int killed = 0;
            boolean kill = true;
            for(int i = 0 ; killed < n-1 ; i ++)
            {

                if(list.length <= i)
                    i = 0;

                if(!list[i].killed)
                {
                    if(!kill)
                    {
                        kill = true;
                        continue;
                    }
                    killed ++;
                    list[i].kill(killed);
                    kill = false;
                }
            }
            Arrays.sort(list);
            System.out.print("Discarded cards:");
            for(int i = 1 ; i < n ; i ++)
            {
                if(i == 1)
                    System.out.printf(" %d",list[i].pos);
                else
                    System.out.printf(", %d",list[i].pos);
            }
            System.out.println();
            System.out.printf("Remaining card: %d\n",list[0].pos);

            //System.out.println(Arrays.toString(list));
        }
    }
    static class Kill implements Comparable<Kill>{
        int pos = 0,order = 0;
        boolean killed = false;
        private void kill(int order)
        {
            killed = true;
            this.order = order;
        }
        @Override
        public int compareTo(Kill o) {
            return order-o.order ;
        }
        public Kill(int pos,int order)
        {
            this.pos = pos;
            this.order = order;
        }

        @Override
        public String toString() {
            return String.format("{%d %d}",pos,order);
        }
    }
}
