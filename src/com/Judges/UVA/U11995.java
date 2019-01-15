package com.Judges.UVA;

import java.util.*;

public class U11995 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        Stack<Integer> stack = new Stack<>();
        LinkedList<Integer> queue = new LinkedList<>();

        while (sc.hasNext())
        {
            boolean isPq = true,isStack = true,isQueue = true;
            pq.clear();
            stack.clear();
            queue.clear();
            int T = sc.nextInt();

            while(T-->0)
            {
                int o = sc.nextInt();
                int n = sc.nextInt();
                if(o == 1)
                {
                    if(isPq)
                        pq.offer(n);
                    if(isStack)
                        stack.add(n);
                    if(isQueue)
                        queue.add(n);
                }else {
                    if(isPq && (pq.isEmpty() || pq.poll() != n))
                        isPq = false;
                    if(isQueue && (queue.isEmpty() || queue.poll()!=n))
                        isQueue = false;
                    if(isStack && (stack.isEmpty() || stack.pop() != n ))
                        isStack = false;
                }
            }

            if(isPq && !isStack && !isQueue)
            {
                System.out.println("priority queue");
            }else if(!isPq && isStack && !isQueue)
            {
                System.out.println("stack");
            }else if(!isPq && !isStack && isQueue)
            {
                System.out.println("queue");
            }else if(!isPq && !isStack && !isQueue)
            {
                System.out.println("impossible");
            }else
            {
                System.out.println("not sure");
            }

        }

    }

}
