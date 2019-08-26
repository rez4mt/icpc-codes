package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class U12504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while (N-->0)
        {
            String first = br.readLine();
            first = first.substring(1,first.length()-1);
            StringTokenizer st = new StringTokenizer(first,",");
            HashMap<String,String> map = new HashMap<>();
            while (st.hasMoreTokens())
            {
                String[] t = st.nextToken().split(":");
                map.put(t[0],t[1]);
            }
            String second= br.readLine();
            second = second.substring(1,second.length()-1);
            TreeSet<String> added , removed , changed ;
            added = new TreeSet<>();
            changed = new TreeSet<>();
            st = new StringTokenizer(second,",");
            while (st.hasMoreTokens())
            {
                String[] t = st.nextToken().split(":");
                if(map.containsKey(t[0]))
                {
                    if(!map.get(t[0]).equals(t[1]))
                        changed.add(t[0]);
                }else
                {
                    //added
                    added.add(t[0]);
                }
                map.remove(t[0]);
            }

            removed = new TreeSet<>(map.keySet());

            if(added.size() == 0 && changed.size() == 0 && removed.size() == 0)
            {
                System.out.println("No changes");
            }else {
                StringBuilder sb = new StringBuilder();
                if(added.size()!=0)
                {
                    sb.append("+");
                    for (String K :
                            added) {
                        sb.append(K + ",");
                    }
                    sb.deleteCharAt(sb.length()-1);
                    sb.append("\n");
                }
                if(removed.size()!=0)
                {
                    sb.append("-");
                    for (String K :
                            removed) {
                        sb.append(K + ",");
                    }
                    sb.deleteCharAt(sb.length()-1);
                    sb.append("\n");
                }
                if(changed.size()!=0)
                {
                    sb.append("*");
                    for (String K :
                            changed) {
                        sb.append(K + ",");
                    }
                    sb.deleteCharAt(sb.length()-1);
                    sb.append("\n");
                }

                System.out.print(sb.toString());
            }

            System.out.println();
        }

    }
}
