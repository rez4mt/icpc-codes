package com.Judges.UVA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class U10008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character,Integer> map;
        int T = sc.nextInt();
        sc.nextLine();
        map = new HashMap<>();
        while (T-->0)
        {
            String line = sc.nextLine();
            for(int i = 0 ; i < line.length() ; i++)
            {
                char c =Character.toUpperCase(line.charAt(i));
                if(Character.isAlphabetic(c))
                {
                    if(map.containsKey(c))
                        map.put(c,map.get(c)+1);
                    else map.put(c,1);
                }
            }

        }
        Words[] w = new Words[map.size()];
        int n = 0;
        for (Character k :
                map.keySet()) {
            w[n] = new Words(k,map.get(k));
            n++;
        }
        Arrays.sort(w);
        for(int i = 0 ; i < w.length ; i ++ )
            System.out.printf("%s %d\n",w[i].word,w[i].count);

    }

    static class Words implements Comparable<Words>
    {
        int count = 0;
        Character word;
        @Override
        public int compareTo(Words o) {
            if(o.count - count == 0 )
                return o.word.compareTo(word) > 0? -1 : 1;

            return o.count - count;
        }
        public Words(Character k , int c)
        {
            count = c;
            word = k;
        }
    }
}
