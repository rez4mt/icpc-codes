package com.Judges.uri;

import java.util.Scanner;

public class P1182 {
    public static void main(String[] args) {
        new P1182();
    }
    public P1182()
    {
        Scanner sc = new Scanner(System.in);
        double[][] mat = new double[12][12];
        int line = sc.nextInt();
        String op = sc.next();
        for (int i = 0 ; i < 12; i ++) {
            for (int j = 0; j < 12; j++)
                mat[i][j] = Double.parseDouble(sc.next());
        }
        double sum = 0 ;
        for(int i = 0 ; i < 12;i++)
        {
            sum += mat[i][line];
        }
        if(op.equals("S"))
        {
            //output sum
            System.out.printf("%.1f\n",sum);
        }else
        {
            //output average
            System.out.printf("%.1f\n",sum/12);
        }

    }
}
