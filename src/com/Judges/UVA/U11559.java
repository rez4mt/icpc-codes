package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class U11559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data ;
        PrintWriter pw = new PrintWriter(System.out);
        while ((data = br.readLine())!=null)
        {
            StringTokenizer st = new StringTokenizer(data);
            int people = Integer.parseInt(st.nextToken());
            int budget = Integer.parseInt(st.nextToken());
            int hn = Integer.parseInt(st.nextToken());
            int weeks = Integer.parseInt(st.nextToken());
            Hotels[] hotels = new Hotels[hn];

            for(int i = 0 ; i <  hn ; i ++)
            {
                hotels[i] = new Hotels(weeks);
                hotels[i].price = Integer.parseInt(br.readLine());
                st = new StringTokenizer(br.readLine());
                for(int j = 0 ; j < hotels[i].w ; j++)
                {
                    hotels[i].weeks[j] = Integer.parseInt(st.nextToken());
                }
            }
            Arrays.sort(hotels);
            int current_price = 0;
            int taken_people = 0 ;
            int lowest = Integer.MAX_VALUE ;
            for(int i = 0 ; i < weeks ; i++)
            {
                current_price   = 0;
                taken_people    = 0;

                for(int j = 0 ; j < hn && taken_people < people ; j++)
                {
                    int available_people = people - current_price;
                    if(hotels[j].weeks[i] < available_people)
                    {
                        taken_people += hotels[j].weeks[i];
                        current_price+= hotels[j].weeks[i] * hotels[j].price;
                    }else
                    {
                        taken_people += available_people ;
                        current_price+=available_people*hotels[j].price;
                        break;
                    }
                    if(current_price>budget)
                    {
                        current_price = Integer.MAX_VALUE;
                        break;
                    }
                }
                if(taken_people<people)
                    continue;
                lowest = Math.min(lowest,current_price);
            }
            if(lowest < budget)
                pw.println(lowest);
            else pw.println("stay home");
        }
        pw.flush();
    }
    static class Hotels implements Comparable<Hotels>{
        @Override
        public int compareTo(Hotels o) {
            return Integer.compare(price,o.price);
        }

        public Hotels(int w)
        {
            this.w = w;
            weeks = new int[w];
        }
        int price;
        int[] weeks;
        int w ;

        @Override
        public String toString() {
            return "P : "+price;
        }
    }
}
