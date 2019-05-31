package com.Judges.uri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P1607 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(bf.readLine());
        while (n-->0)
        {
            String[] line = bf.readLine().split(" ");
            long count = 0;
            for(int i = 0 ; i< line[0].length();i++)
            {
                int op =  line[1].charAt(i)-line[0].charAt(i);
                if(op < 0)
                    op += 26;
                count+=op;
            }
            System.out.println(count);

        }

    }
}
