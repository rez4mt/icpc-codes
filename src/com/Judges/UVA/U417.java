package com.Judges.UVA;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class U417 {
    static LinkedList<String> list ;
    static HashMap<String,Integer> index ;
    static int current = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        list = new LinkedList<String>();
        index = new HashMap<>();
        for(int i = 'a';i<='z';i++)
            list.offer(((char)i)+"");
        int k = 1 ;
        while (!list.isEmpty())
        {
            String c = list.remove();
            index.put(c,k++);

            if(c.length()<5)
            {
                for(int i = c.charAt(c.length()-1)+1 ; i <= 'z' ; i++)
                    list.add(c+((char)i) + "");

            }
        }
        while (sc.hasNext())
        {
            Object val = index.get(sc.next());
            if(val == null)
                System.out.println(0);
            else System.out.println(val);
        }
    }

}
