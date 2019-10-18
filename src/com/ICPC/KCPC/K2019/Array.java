package com.ICPC.KCPC.K2019;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class Array {
    public static void pq(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            int sum = 0 ;
            for(int i = 0 ; i < N ;i++)
            {
                int current = sc.nextInt();
                sum+=current;

                while (!pq.isEmpty() && pq.peek()>current)
                {
                    int peek = pq.peek();
                    pq.poll();
                    sum-=current;
                }
                pq.add(current);
            }
            System.out.println(sum);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            Stack<Integer> pq = new Stack<>();
            int sum = 0 ;
            for(int i = 0 ; i < N ;i++)
            {
                int current = sc.nextInt();
                sum+=current;

                while (!pq.isEmpty() && pq.peek()>current)
                {
                    pq.pop();
                    sum-=current;
                }
                pq.add(current);
            }
            System.out.println(sum);

        }
    }
   /* public static void bf(String[] args) {
        //it was fast reader..
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            int[] largest = new int[N];
            int[] vals = new int[N];
            boolean[] changed = new boolean[N];
            vals[0] = sc.nextInt();
            largest[0] = vals[0];
            long sum = vals[0];
            for(int i = 1 ; i < N ; i++)
            {
                vals[i] = sc.nextInt();
                sum+=vals[i];
                largest[i] = Math.max(largest[i-1] , vals[i]);
            }
            for(int i = 1 ; i < N ;i++)
            {
                for(int j = i - 1 ; j>=0 ; j--)
                {
                    if(changed[j])
                        continue;
                    if(largest[j] < vals[i] || vals[i] == 0)
                        break;
                    if(vals[j] > vals[i])
                    {
                        sum-=vals[i];
                        changed[j] = true;
                    }
                }
            }
            pw.println(sum);
        }
        pw.flush();
    }*/
}
