package com.Judges.UVA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class U1048 {

    public static void main(String[] args) {
        Map<Integer,Integer> m;
        m = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int pos;
        while (sc.hasNext())
        {
            m.put(m.size(),sc.nextInt());
            resort(m);
            if(m.size()%2 == 0 )
            {
                //even
                pos = m.size()/2;
                System.out.println((m.get(pos)+m.get(pos-1))/2);
            }else
            {

                pos = m.size()/2;
                System.out.println(m.get(pos));
            }
        }

    }

    static void resort(Map<Integer,Integer> m)
    {
        int[] d = new int[m.size()];
        for(int i = 0 ; i < m.size();i++)
        {
            d[i] = m.get(i);
        }
        m.clear();
        Arrays.sort(d);
        for(int i = 0 ; i < d.length;i++)
        {
            m.put(i,d[i]);
        }
    }

}
