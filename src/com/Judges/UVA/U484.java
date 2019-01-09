package com.Judges.UVA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class U484 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
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
        }
    }
}
