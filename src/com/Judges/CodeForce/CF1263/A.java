package com.Judges.CodeForce.CF1263;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int[] list = new int[3];
            for(int i = 0 ; i < 3 ; i++)
            {
                list[i] = sc.nextInt();
            }
            Arrays.sort(list);
            int ans = 0 ;
            if(list[0] + list[1] <= list[2])
            {
                ans = (list[0] + list[1]);
            }
            else {
                if (list[0] == list[1] && list[1] == list[2]) {
                    ans = list[0] + (list[1]/2);
                } else {
                    ans = list[2] + ((list[0]+list[1] - list[2] )/ 2);
                }
            }
            System.out.println(ans);
        }
    }

    public static void main2(String[] args) {
        int[] list = new int[3];
        Scanner  sc = new Scanner(System.in);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < 3; i++) pq.offer(sc.nextInt());
        int ans = 0 ;

        while (pq.size()>1)
        {
            int p1 = pq.poll();
            int p2 = pq.poll();
            p1 -- ;
            p2 -- ;
            if(p1!= 0)
                pq.offer(p1);
            if(p2!=0)
                pq.offer(p2);
            ans++;
        }
        System.out.println(ans);

    }
}
