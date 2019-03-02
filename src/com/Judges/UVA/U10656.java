package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;

public class U10656 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {

            int N = Integer.parseInt(br.readLine());
            if(N == 0)
                break;
            StringBuilder b = new StringBuilder();
            while (N-->0)
            {
                String d = br.readLine();
                if(d.equals("0"))
                    continue;
                b.append(d+" ");
            }
            if(b.length() == 0)
                b.append("0");
            else b.deleteCharAt(b.length()-1);
            pw.println(b);
        }
        pw.flush();
        pw.close();
    }
}
