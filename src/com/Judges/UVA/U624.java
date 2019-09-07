package com.Judges.UVA;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class U624 {
    static LinkedList<Integer> best_list ;
    static boolean[] used;;
    static int[] discs;
    static int L ;
    static int N;
    static int min_dur;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        used = new boolean[20];
        discs = new int[20];
        best_list = new LinkedList<>();
        while (sc.hasNext())
        {
            StringBuilder b = new StringBuilder();
            N = sc.nextInt();
            L = sc.nextInt();
            best_list.clear();
            min_dur = 0;
            for(int i = 0 ; i<L ;i++)
            {
                discs[i] = sc.nextInt();
                used[i] = false;
            }

            check(0,0,new LinkedList<>());
            long sum = 0;
            for(Integer k : best_list)
            {
                sum+=k;
                b.append(k+" ");
            }
            b.append("sum:"+sum);
            System.out.println(b);
        }
    }
    private static void check(int duration,int pos,LinkedList<Integer> current)
    {
        if(duration>N)
            return ;
        if(duration>min_dur)
        {
            //add to list
            best_list =(LinkedList<Integer>) current.clone();
            min_dur = duration;
        }
        for(int i = pos ; i < L ;i++)
        {
            if(!used[i])
            {
                used[i] = true;
                current.add(discs[i]);
                check(duration+discs[i],i+1,current);
                used[i] = false;
                current.removeLast();
            }
        }
    }
}
