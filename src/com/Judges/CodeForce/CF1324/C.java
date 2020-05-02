package com.Judges.CodeForce.CF1324;

import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            String s = sc.next();
            SortedSet<Integer> set = new TreeSet<>();
            for(int i = 0 ; i < s.length() ; i++)
                if(s.charAt(i)=='R')
                    set.add(i);
                //
            if(set.size() == 0)
                System.out.println(s.length()+1);
            else if(set.size() == 1)
            {
                //dist from end
                System.out.println(Math.max(set.first()+1,s.length()-set.first()));
            }
            else
            {
                int last = -1 ;
                int max= 0 ;

                for (int e :
                        set) {
                    max= Math.max(Math.abs(e-last) ,max);
                    last = e;
                }
                System.out.println(Math.max(max , s.length() - last));
            }
        }
    }
}
