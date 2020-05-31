package com.Judges.CodeForce. CF1353;
import java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            PriorityQueue<Integer> a = new PriorityQueue<>();
            PriorityQueue<Integer> b = new PriorityQueue<>(Collections.reverseOrder());
            for(int i = 0 ; i < n ; i++)
                a.add(sc.nextInt());
            for(int i = 0 ; i < n ; i++)
                b.add(sc.nextInt());
            while (k-->0)
            {
                int la = a.peek();
                int lb = b.peek();
                if(la>=lb)
                    break;
                a.poll();
                a.add(b.poll());
            }
            long ans = 0 ;
            while (!a.isEmpty())
                ans+=a.poll();
            System.out.println(ans);
        }
    }
}
