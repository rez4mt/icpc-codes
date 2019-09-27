//package com.AOU.KCPC.T2019.Training2;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class kotsh {

    public static void main(String[] args) throws Exception{
        //Scanner s = new Scanner(System.in);
        Scanner s = new Scanner(new File("kotsh.in"));
        int T = s.nextInt();
        while (T-->0) {
            HashSet<Integer> rows = new HashSet<>();
            HashSet<Integer> cols = new HashSet<>();
            int N = s.nextInt();
            int R = s.nextInt();
            int C = s.nextInt();
            int whites = N * N;
            s.nextLine();
            for(int i = 0 ; i< R ; i++)
            {
                //int num = s.nextInt();
                rows.add(s.nextInt());
            }
            for(int i = 0 ; i< C ; i++)
            {
                //int num = s.nextInt();
                cols.add(s.nextInt());
            }

            whites -= rows.size() * N;
            whites -= cols.size() * (N - rows.size());

            System.out.println(whites);

        }
    }


}
