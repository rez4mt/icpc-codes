package com.Judges.UVA;

import java.util.PriorityQueue;
import java.util.Scanner;

public class P10954 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int n = sc.nextInt();
            if(n == 0 )
                break;
            PriorityQueue<Long> queue = new PriorityQueue<>();

            for(int i = 0 ; i < n ; i ++)
            {
                queue.offer(sc.nextLong());
            }
            long sum = 0 ;
            while (queue.size()>1)
            {
                long l = queue.remove() + queue.remove();
                sum+=l;
                queue.add(sum);
            }
            System.out.println(sum);
        }
    }
}
