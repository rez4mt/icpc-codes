package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class U11340 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine()),k,m;
        int price;
        HashMap<Character,Integer> list;
        for(int i = 0 ; i < n ; i++)
        {
            price = 0;
            list = new HashMap<>();
            k = Integer.parseInt(bf.readLine());
            for(int j = 0 ; j < k;j++)
            {
                String d = bf.readLine();

                list.put(d.charAt(0),Integer.parseInt(d.substring(2).trim()));
            }
            m = Integer.valueOf(bf.readLine());
            for(int j = 0 ;j<m;j++)
            {
                char c;
                while ((c=(char) bf.read())!='\n')
                {
                    price += list.getOrDefault(c,0);
                }
            }
            System.out.printf("%.2f$\n",((double)price/100));
        }
    }
}
