package com.Judges.CodeForce.CF659;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        Teams[][] teams = new Teams[m][4];
        for(int i = 0 ; i < n ; i++)
        {
            int r,p;
            String name = sc.next();
            r = sc.nextInt();
            p = sc.nextInt();
            teams[r-1][3] = new Teams(name,p);
            Arrays.sort(teams[r-1], new Comparator<Teams>() {
                @Override
                public int compare(Teams o1, Teams o2) {
                    if(o1 == null && o2 == null)
                        return 0;
                    if(o1 == null)
                        return 1;
                    if(o2 == null)
                        return -1;
                    return o2.compareTo(o1);
                }
            });
        }
        for(int i = 0 ; i < m ; i++)
        {

            if(teams[i][0].points!=teams[i][1].points)
            {
                if(teams[i][2] == null || teams[i][1].points != teams[i][2].points)
                {
                    System.out.printf("%s %s\n",teams[i][0].name,teams[i][1].name);
                    continue;
                }
            }
            System.out.println("?");
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
