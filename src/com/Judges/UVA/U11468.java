package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class U11468 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            StringBuilder b = new StringBuilder();
            int a = Integer.valueOf(br.readLine().trim());
            if(a == 0)
                break;
            int[] arr = new int[a];
            String line = br.readLine();
            String[] parts = line.split(" ");
            for(int i = 0 ; i < a ; i++)
            {
                arr[i] = Integer.valueOf(parts[i]);
            }
            Arrays.sort(arr);
            for(int i = 0 ; i < a ; i++)
            {
                b.append(arr[i]+" ");
            }

            b.deleteCharAt(b.length()-1);
            System.out.println(b);
        }
    }
}
