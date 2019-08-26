package com.Judges.UVA;

import java.util.PriorityQueue;
import java.util.Scanner;

public class U10954 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int n = sc.nextInt();
            if(n == 0 )
                break;
            PriorityQueue<Long> queue = new PriorityQueue<>();

            for(int i = 0 ; i < n ; i ++)
                queue.offer(sc.nextLong());

            long sum = 0 ;
            while (queue.size()>1)
            {
                long a = queue.poll();
                long b = queue.poll();
                long l = a + b;
                sum+=l;
                queue.offer(l);
            }
            System.out.println(sum);
        }
    }
}
