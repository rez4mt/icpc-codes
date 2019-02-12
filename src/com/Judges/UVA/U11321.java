package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class U11321 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String[] info = br.readLine().split(" ");
            int N = Integer.parseInt(info[0]);
            int M = Integer.parseInt(info[1]);
            if(N == 0 && M == 0)
                break;
            System.out.println(N+" "+M);
            Nums.MOD = M;
            PriorityQueue<Nums> arr = new PriorityQueue<Nums>();
            for (int i = 0; i < N; i++) {
                int res = Integer.parseInt(br.readLine());
                Nums x = new Nums(res);
                arr.add(x);
            }
            while (!arr.isEmpty()) {
                System.out.println(arr.poll().num);
            }
        }
        System.out.println("0 0");
    }
    static class Nums implements Comparable<Nums>{
        @Override
        public int compareTo(Nums o) {
            int A = Long.compare(lv,o.lv);
            if(A == 0)
            {
               boolean AA = !even;
               boolean BB = !o.even;
               if(AA && BB)
               {
                   return - Long.compare(num,o.num);
               }else if(!AA && !BB)
               {
                   return Long.compare(num,o.num);
               }
               else if(AA)
               {
                    return -1;
               }else
               {
                    return 1;
               }
            }
            return A;
        }

        static long MOD;

        long num;
        long lv;
        boolean even = false;
        public Nums(long num)
        {
            this.num = num;
            lv = num % MOD;
            even = num % 2 == 0;
        }

        @Override
        public String toString() {
            return String.format("%d",num);
        }
    }
}
