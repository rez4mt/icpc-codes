package com.Judges.CodeForce.CF230;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        int s,n;
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        n = sc.nextInt();
        DRG[] d = new DRG[n];
        for(int i = 0; i < n ; i++)
            d[i] = new DRG(sc.nextInt(),sc.nextInt());
        Arrays.sort(d);
        for(int i = 0 ; i < n ; i ++)
        {
            if(d[i].st < s)
            {
                s += d[i].bo;
            }else
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    static class DRG implements Comparable<DRG>{
        int st,bo;
        @Override
        public int compareTo(DRG o) {
            return this.st - o.st;
        }
        public DRG(int s,int b)
        {
            st= s;
            bo = b;
        }

        @Override
        public String toString() {
            return String.format("\n{%s %s},",st,bo);
        }
    }
}
