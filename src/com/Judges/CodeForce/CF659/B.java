package com.Judges.CodeForce.CF659;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        Teams[][] teams = new Teams[m][4];
        PriorityQueue<Teams>[] q = (PriorityQueue<Teams>[]) new PriorityQueue[m];
        for(int i = 0 ; i < m ;i++)
            q[i] = new PriorityQueue<>();
        for(int i = 0 ; i < n ; i++)
        {
            int r,p;
            String name = sc.next();
            r = sc.nextInt();
            p = sc.nextInt();
            q[r-1].add(new Teams(name,p));
        }
        for(int i = 0 ; i < m ; i++)
        {
           if(q[i].size() == 2)
           {
               System.out.printf("%s %s\n",q[i].poll().name,q[i].poll().name);
           }else{
               Teams[] tea = new Teams[3];
               tea[0] = q[i].poll();
               tea[1] = q[i].poll();
               tea[2] = q[i].poll();
               if(tea[1].points == tea[2].points)
               {
                   System.out.println("?");
                   continue;
               }
               System.out.printf("%s %s\n",tea[0].name,tea[1].name);
           }
        }
    }

    static class Teams implements Comparable<Teams>{
        String name;
        int points;
        Teams(String n,int p)
        {
            points = p;
            name = n;
        }
        @Override
        public int compareTo(Teams o) {

             if(o.points == points )
                return 0;
             return o.points > points ? 1 : -1;
        }
        @Override
        public String toString() {
            return String.format("{%s %s}",name,points);
        }
    }
}
