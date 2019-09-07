package com.Judges.UVA;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class U1203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Q> queue = new PriorityQueue<>();
        while (sc.hasNext())
        {
            String data = sc.nextLine();

            if(data.charAt(0) =='#')
                break;
            StringTokenizer st = new StringTokenizer(data);
            st.nextToken();
            queue.offer(new Q(st.nextToken(),st.nextToken()));
        }
        int K = sc.nextInt();
        for(int i = 0 ; i < K ; i++)
        {
            Q q = queue.poll();
            System.out.println(q);
            q.order += q.period;
            queue.offer(q);
        }
    }
    static class Q implements Comparable<Q>{
        @Override
        public int compareTo(Q o) {
            if(o.order == order)
                return -Integer.compare(o.id,id);
            return -Long.compare(o.order,order);
        }

        int id = 0;
        long order = 0;
        long period = 0;
        public Q(String id , String period)
        {
            this.period = order = Long.valueOf( period );
            this.id = Integer.valueOf(id);
        }

        @Override
        public String toString() {
            return id+"";
        }
    }
}
