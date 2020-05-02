package com.Judges.CodeForce.CF1335;

import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int[] list = new int[n];
            int[] frq = new int[n+1];
            HashSet<Integer> duplicates = new HashSet<>();
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0 ; i < n ; i++)
            {
                list[i] = sc.nextInt();
                frq[list[i]]++;
                set.add(list[i]);
                if(frq[list[i]]>1)
                    duplicates.add(list[i]);
            }
            if(n==2)
            {
                System.out.println(1);
            }else if(n < 2) {
                System.out.println(0);
            }else if(duplicates.size() == 0)
            {
                System.out.println(1);
            }else{
                int maxSize = 0 ;
                boolean flag = false;
                for (int d : duplicates) {
                    if(frq[d]==n)
                    {
                        flag = true;
                        System.out.println(1);
                        break;
                    }
                    maxSize = Math.max(maxSize , Math.min(frq[d] , set.size()-1));
                    if(set.size()-1 - frq[d] <= -2)
                    {
                        if(frq[d]-1 >= set.size())
                            maxSize = Math.max(maxSize , set.size());
                    }
                }
                if(!flag)
                    System.out.println(maxSize);
            }
        }
    }
}
