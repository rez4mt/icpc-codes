package com.Judges.uri;

import java.util.Scanner;

public class P1038 {
    public P1038()
    {
        double[] price = new double[]{0,4.0,4.5,5.0,2.0,1.5};
        Scanner sc = new Scanner(System.in);
        System.out.printf("Total: R$ %.2f\n",price[sc.nextInt()] * sc.nextInt());

    }
    public static void main(String[] args) {
        new P1038();
    }
}
