package com.Judges.UVA;

import java.io.PrintWriter;
import java.util.*;

public class U574 {
    static int SUM = 0 ;
    static int LENGTH = 0;
    static int[] LIST ;
    static boolean[] used ;
    static StringBuilder b ;
    static HashSet<ArrayList<Integer>> added ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LIST = new int[12];
        used = new boolean[12];
        added = new HashSet<>();
        while (true)
        {

            b = new StringBuilder();
            SUM = sc.nextInt();
            LENGTH = sc.nextInt();
            if(SUM == 0 && LENGTH == 0)
                break;
            for(int i = 0 ; i < LENGTH ;i++)
            {
                used[i] = false;
                LIST[i] = sc.nextInt();
            }
            b.append("Sums of "+SUM+":");
            check(0,0,new LinkedList<>());
            if(b.charAt(b.length()-1) == ':')
                b.append("\nNONE");
            System.out.println(b.toString());

        }

    }
    private static void check(int index , int sum,LinkedList<Integer> list )
    {
        if(sum> SUM)
            return ;

        if(sum == SUM)
        {
            // add list items to pw
            ArrayList<Integer> lst = new ArrayList<>(list);
            Collections.sort(lst);
            if(added.contains(lst))
                return ;
            else added.add(lst);
            b.append("\n");
            for(Integer k: list)
            {
                b.append(k);
                b.append("+");
            }
            b.deleteCharAt(b.length()-1);
            return;
        }

        for(int i = index ; i < LENGTH ; i++)
        {
            if(!used[i])
            {
                used[i] = true;
                list.add(LIST[i]);
                check(index+1,sum+LIST[i],list);
                list.removeLast();
                used[i] = false;
            }
        }
    }
}
