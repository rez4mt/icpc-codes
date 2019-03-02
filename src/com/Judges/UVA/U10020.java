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
            int m = sc.nextInt();
            ArrayList<S> list = new ArrayList<>();
            while(true)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(a==0 && b==0)
                    break;
                list.add(new S(a,b));
            }
            int i=1;
            int dist_r = Integer.MAX_VALUE,dist_l = Integer.MAX_VALUE;
            Collections.sort(list);
            Stack<S> stack = new Stack<>();
            int current_l = 0;
            while (dist_r < m)
            {
                int L = current_l;

                int f = 0;
                for(;i<list.size();i++)
                {
                    if(list.get(i).L>current_l)
                        break;
                    else if(list.get(i).R>= L)
                    {
                        L = list.get(i).R;
                        f=i;
                    }
                }
                if(f==0)
                    break;
                stack.push(list.get(i));
                current_l = dist_r =  L;
            }
            if(dist_r>=m)
            {
                System.out.println(stack.size());
                while (!stack.empty())
                {
                    S t = stack.pop();
                    System.out.printf("%d %d\n",t.L,t.R);
                }
            }else
            {
                System.out.println(0);
            }
        }
    }
    static class S implements Comparable<S>{
        @Override
        public int compareTo(S o) {
            if(o.L==L)
                return 0;
            return L < o.L?1:-1;
        }

        int L,R;
        public S(int L,int R)
        {
            this.L = L;
            this.R = R;
        }

    }
}
