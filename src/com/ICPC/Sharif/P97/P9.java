package com.ICPC.Sharif.P97;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P9 {
    static Map<String,Integer> m = new HashMap<String,Integer>();
    public static void main(String[] args) {
        m.put("1",0);
        m.put("2",1);
        m.put("3",2);
        m.put("up",3);
        m.put("4",4);
        m.put("5",5);
        m.put("6",6);
        m.put("down",7);
        m.put("7",8);
        m.put("8",9);
        m.put("9",10);
        m.put("-",11);
        m.put("0",12);
        Scanner sc = new Scanner(System.in);
        int[] keys = new int[14];
        for(int i = 0 ; i< 13;i++)
        {
            keys[i] = sc.nextInt();
        }

        int from,to;
        String s_from,s_to;
        from = sc.nextInt();
        to = sc.nextInt();
        s_from = String.valueOf(from);
        s_to = String.valueOf(to);
        if(from == to)
        {
            System.out.println(0);
        }else if(s_to.length()==1 )
        {
            if(m.get(s_to) == 1)
            {
                System.out.println(1);
            }else
            {
                //check for prev or next button

            }
        }



    }
}
