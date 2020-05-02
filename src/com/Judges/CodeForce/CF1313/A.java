package com.Judges.CodeForce.CF1313;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int n = 3;
        while(T-->0)
        {
            ArrayList<Integer> mlist = new ArrayList<>();
            int[] list = new int[3];
            for(int i = 0 ; i < 3 ; i++)
                mlist.add(sc.nextInt());
            Collections.sort(mlist, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return -Integer.compare(o1,o2);
                }
            });
            for(int i = 0 ; i < 3 ; i++)
            {
                list[i] = mlist.get(i);
            }
            int ans = 0 ;
            for(int i = 1 ; i < (1<<3);i++)
            {
                boolean flag = true;
                for(int j = 0 ; j < n ; j++)
                {
                    if ((i & (1 << j)) != 0)
                    {
                        if(list[j]==0)
                            flag = false;
                    }
                }
                if(flag)
                {
                    for (int j = 0 ; j < n ;j++)
                    {
                        if ((i & (1 << j)) != 0)
                            list[j]--;
                    }
                    ans++;
                }

            }
            System.out.println(ans);
        }
    }
}
