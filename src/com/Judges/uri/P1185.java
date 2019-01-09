package com.Judges.uri;

import java.util.Scanner;

public class P1185 {
    public static void main(String[] args) {
        new P1185();

    }
    public P1185()
    {
        Scanner sc = new Scanner(System.in);
        double[][] mat = new double[12][12];
        String op = sc.next();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++)
                mat[i][j] = Double.parseDouble(sc.next());
        }
        double sum = 0;
        int count = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++)
            {
                if(i+j == 11)
                    break;
                sum+= mat[i][j];
                count++;
            }
        }
        System.out.printf("%.1f\n",op.equals("S")?sum:sum/count);

    }
}
