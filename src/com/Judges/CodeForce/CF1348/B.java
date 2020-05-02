package com.Judges.CodeForce.CF1348;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] list = new int[n];
            TreeSet<Integer> dups = new TreeSet<>();
            for(int i = 0 ; i < n ; i++)
            {
              list[i] = (sc.nextInt());
                dups.add(list[i]);
            }
            if(dups.size()>k)
                System.out.println("-1");
            else
            {
                /*if(n == k || dups.size()==1)
                {
                    System.out.println(n);
                    for(int i = 0; i< n ; i++)
                        System.out.print(list[i]+" ");
                    System.out.println();
                    continue;
                }
                int[] pre = new int[n];
                pre[0] = list[0];
                for(int i = 1 ; i < n ; i++)
                {
                    pre[i] = list[i] + pre[i-1];
                }
                int sum = pre[k-1];
                boolean flag = true;
                for(int i =1 ; i < n-k+1 ; i++)
                {
                    if(sum != pre[i+k-1]-pre[i-1])
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag)
                {
                    System.out.println(n);
                    for(int i = 0; i< n ; i++)
                        System.out.print(list[i]+" ");
                    System.out.println();
                    continue;
                }*/
                //if k == dup.size ! -> print dups
                // k < dup.size
                //else go from k!
                StringBuilder sb = new StringBuilder();
                if(dups.size()!=k)
                {
                    for(int i =1; i <= n ; i++)
                    {
                        dups.add(i);
                        if(dups.size()==k)
                            break;
                    }
                }
                System.out.println(n*dups.size());
                for(int i = 0 ; i < n ; i++)
                {
                    for(int j : dups)
                    {
                        sb.append(j);
                        sb.append(" ");
                    }
                }
                System.out.println(sb);
            }
        }
    }
}
