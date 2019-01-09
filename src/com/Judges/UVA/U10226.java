package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class U10226 {
    public static void main(String[] args) throws IOException {
        int n;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        bf.readLine();
        String name ;
        while (n-->0)
        {
            long total = 0;
            HashMap<String,Integer> map = new HashMap<>();
            ArrayList<String> sort = new ArrayList<>();
            StringBuilder b = new StringBuilder();
            while ((name = bf.readLine())!=null && !name.isEmpty())
            {
                name = name.trim();
                total++;
                if(map.containsKey(name))
                {
                    map.put(name,map.get(name)+1);
                }else {
                    map.put(name,1);
                    sort.add(name);
                }
            }
            Collections.sort(sort);
            for (String n2 :
                    sort) {
                b.append(String.format("%s %.4f\n",n2,map.get(n2)*100d/total));
            }
            if(n>=1)
                System.out.println(b);
            else System.out.print(b);
        }


    }
}
