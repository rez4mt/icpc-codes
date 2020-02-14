package com.Judges.kattis;
import com.ICPC.KCPC.K2019.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class cookieselection {

    static PriorityQueue<Integer> bottomPq;
    static PriorityQueue<Integer> topPq;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        topPq = new PriorityQueue<>();
        bottomPq = new PriorityQueue<>(Collections.reverseOrder());
        while (sc.hasNext())
        {
            String s = sc.next();
            if(s.equals("#"))
            {
                //print something
                //check if answers are equal
                System.out.println(get());
            }else
            {
                //add to pq
                add(s);
            }
        }
    }
    private static int get()
    {
        if(topPq.size() == bottomPq.size())
        {

           return (topPq.size()!=0?topPq.poll():bottomPq.poll());
        }
        else {
            return (bottomPq.size()!=0?bottomPq.poll():topPq.poll());
        }
    }
    private static void add(String n2)
    {
        int n = Integer.parseInt(n2);
        topPq.add(n);
        while (topPq.size() > bottomPq.size())
            bottomPq.add(topPq.poll());
        if(topPq.size()!=0 && topPq.peek()<bottomPq.peek())
        {
            int top = topPq.poll();
            int bottom = bottomPq.poll();
            bottomPq.add(top);
            topPq.add(bottom);
        }
    }

}
