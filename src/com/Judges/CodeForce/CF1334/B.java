package com.Judges.CodeForce.CF1334;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int count = 0 ;
            long sum = 0 ;
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for(int i =  0; i < n ; i++)
            {
                int a = sc.nextInt();
                if(a >= x)
                {
                    sum+=a;
                    count++;
                }else
                {
                    pq.add(a);
                }
            }

            while (!pq.isEmpty())
            {
                int a = pq.remove();
                if((sum+a) / (count+1)>=x)
                {
                    sum+=a;
                    count++;
                }else break;
            }
            System.out.println(count);
        }
    }
}
