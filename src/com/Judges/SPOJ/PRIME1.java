package com.Judges.SPOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;
import java.util.Scanner;

public class PRIME1 {
    static int MAX = 1000000001;
    static BitSet bset;

    public static void main(String[] args) throws IOException {
        bset = new BitSet(MAX);
        bset.set(2);
        bset.set(3);
        int sqrt = (int) Math.sqrt(MAX);
        for (int i = 3; i <= sqrt; i+=2) {
            boolean p = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    p = false;
                    break;
                }
            }

            if (p)
                bset.set(i);

        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-->0)
        {

            int n , m;
            String[] l = br.readLine().split(" ");
            n = Integer.parseInt(l[0]);
            m = Integer.parseInt(l[1]);
            if(m<2)
                m = 2;

            for(int i = n ; i<=m ; i++)
            {
                if(bset.get(i))
                    System.out.println(i);
            }
        }

    }

}
