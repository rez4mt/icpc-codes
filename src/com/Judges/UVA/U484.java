package com.Judges.UVA;

import java.util.*;

public class U484 {
    public static void main(String[] args) {
        test();
        /*HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Scanner sc = new Scanner(System.in);
        int val;
        List<Integer> l = new ArrayList<>();
        while (sc.hasNextInt())
        {
            val = sc.nextInt();
            if(map.containsKey(val))
                map.put(val,map.get(val)+1);
            else {
                l.add(val);
                map.put(val,1);
            }

        }

        for (Integer k :
                l) {
            System.out.printf("%d %d\n",k,map.get(k));
        }*/
    }

    private static  void test()
    {
        //3 1 2 2 1 3 5 3 3 2

        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        StringBuilder b = new StringBuilder();

        while (sc.hasNext())
        {
            int v = sc.nextInt();
            if(map.containsKey(v))
                map.put(v,map.get(v)+1);
            else
                map.put(v,1);

        }
        for (int k : map.keySet())
            b.append(String.format("%d %d\n",k,map.get(k)));
        System.out.print(b);
    }
}
