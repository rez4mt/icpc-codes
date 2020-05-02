package com.CodeJam20;

import java.util.ArrayList;
import java.util.Scanner;

public class Pattern_Matching {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            ArrayList<String> list = new ArrayList<>();
            for(int i = 0 ; i < N ; i++)
                list.add(sc.next());
            String ans = "*";
            for(int i = 0 ; i < N ; i++)
            {
                for(int j = i+1 ; j < N;j++)
                {

                }
            }
        }
    }

}
