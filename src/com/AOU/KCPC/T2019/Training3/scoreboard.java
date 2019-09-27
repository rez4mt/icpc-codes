//package com.AOU.KCPC.T2019.Training3;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class scoreboard {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("smallest.in"));
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            HashMap<Integer , Integer> past = new HashMap<>();
            HashMap<Integer , Integer> news = new HashMap<>();
            for(int i = 0 ; i < N ; i++)
                past.put(sc.nextInt() ,i+1);
            for(int i = 0 ; i < N ; i++)
                news.put(sc.nextInt(),i+1);
            for(int i = 1 ; i <= N ; i ++)
            {
                int old = past.get(i);
                int newpos = news.get(i);
                if(old == newpos)
                {
                    System.out.printf("team %d stayed at %s position\n" , i ,getP(newpos));
                }else
                    System.out.printf("team %d moved from %s position to %s position\n",i , getP(old) , getP(newpos));
            }
        }
    }
    static String getP(int i)
    {

        int c = i % 10;
        if(i<20)
            c = i;
        if( c == 1)
            return i+"st";
        else if(c == 2)
            return i+"nd";
        else if(c == 3)
            return (i+"rd");
        else
        {
            return i+"th";
        }
    }
}
