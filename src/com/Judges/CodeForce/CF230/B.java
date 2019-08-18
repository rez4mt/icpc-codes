package com.Judges.CodeForce.CF230;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B {

    private static boolean isT(long n)
    {

        HashMap<Long,Integer> map  = new HashMap<>();
        long sqrt = (int) Math.sqrt(n);
        for(long i = 2 ; i <= sqrt;i++)
        {
            if(n%i == 0)
            {
                while (n%i == 0)
                {
                    if(map.containsKey(i))
                        map.put(i,map.get(i)+1);
                    else map.put(i,1);
                    n /= i;

                }
            }
        }
        long count = 1;
        for (int v :
                map.values()) {
            count *= v+1;
        }
        return count == 3;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (N-->0)
        {
            if(isT(Long.parseLong(st.nextToken())))
                pw.println("YES");
            else pw.println("NO");
        }
        pw.flush();
    }
}
