package com.Judges.UVA;

import java.util.BitSet;
import java.util.Scanner;

public class U10235 {
    static BitSet bset;
    static int MAX = 1000001;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bset = new BitSet(MAX);
        bset.set(2); //list.add(2);
        for (int j = 3; j < MAX; j+=2) bset.set(j);
        int sqrt = (int) Math.sqrt(MAX);
        for (int i = 3; i < sqrt; i+=2)
            if (bset.get(i)) {
                for (int j = i*i; j < MAX; j+=2*i) bset.clear(j);
                //list.add(i);
            }
        //

        while (sc.hasNext())
        {
            int n = sc.nextInt();
            if(bset.get(n))
            {
                int n2 = Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
                if(n2!=n && bset.get(n2))
                {
                    System.out.printf("%d is emirp.\n",n);
                }else
                {
                    System.out.printf("%d is prime.\n",n);
                }
            }else
            {
                System.out.printf("%d is not prime.\n",n);
            }
        }
    }
}
