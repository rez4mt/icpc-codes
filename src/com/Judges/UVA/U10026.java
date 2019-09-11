package com.Judges.UVA;

import java.util.Arrays;
import java.util.Scanner;

public class U10026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {

            int N = sc.nextInt();

            JOB[] jobs = new JOB[N];
            for(int i = 0; i< N ;i++)
                jobs[i] = new JOB(i+1,sc.nextInt(),sc.nextInt());
            Arrays.sort(jobs);
            StringBuilder b = new StringBuilder();
            for(int i = 0 ; i < N ; i++)
            {
                b.append(jobs[i].id+" ");
            }
            b.deleteCharAt(b.length()-1);
            System.out.println(b.toString());
            if(T!=0)
                System.out.println();

        }
    }
    static class JOB implements Comparable<JOB>{
        @Override
        public int compareTo(JOB o) {
            if(o.ratio == ratio)
                return id-o.id;
            return Double.compare(ratio,o.ratio);
        }

        int id , t , s;
        double ratio = 0 ;
        public JOB(int id , int t , int s)
        {
            this.id = id ;
            this.t = t;
            this.s = s;
            ratio = t / (double) s;

        }
    }
}
