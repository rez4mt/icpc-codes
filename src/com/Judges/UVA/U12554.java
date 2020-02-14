package com.Judges.UVA;

import java.io.PrintWriter;
import java.util.Scanner;

public class U12554 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] ms = new String[]{"Happy","birthday","to","you","Happy","birthday"
                ,"to","you","Happy","birthday","to","Rujia","Happy","birthday","to","you"};
        int reps = (int)Math.ceil(N/(double)ms.length);
        String[] pp = new String[N];
        for(int i = 0 ; i < N  ; i++)
            pp[i] = sc.next();
        StringBuilder bw = new StringBuilder();
        PrintWriter pw = new PrintWriter(System.out);
        for(int i = 0 ; i <  reps*ms.length ; i++)
        {
            bw.append(pp[i%pp.length]);
            bw.append(": ");
            bw.append(ms[i%ms.length]);
            bw.append("\n");
        }
        pw.print(bw);
        pw.flush();
    }

}