package com.Judges.UVA;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class U10140 {
    static ArrayList<Integer> primes;
    private static void sieve(int n)
    {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        sieve(Integer.MAX_VALUE);
        System.out.println("init done");
        while (sc.hasNext())
        {
            int L = sc.nextInt();
            int U = sc.nextInt();
            if(L == U)
            {pw.println("There are no adjacent primes.");
                continue;
            }
            int minDistance = Integer.MAX_VALUE,maxDistance = Integer.MIN_VALUE;

            int[] min = new int[2];
            int[] max = new int[2];
            boolean found = false;
            if(false)
            {
                pw.println("There are no adjacent primes.");
                break;
            }
            for(int i = 0 ; i < Integer.MAX_VALUE ; i++)
            {


            }
            if(found)
                pw.printf("%d,%d are closest, %d,%d are most distant.\n",max[0],max[1],min[0],min[1]);
            else pw.print("There are no adjacent primes.\n");
        }
        pw.flush();
    }
}
