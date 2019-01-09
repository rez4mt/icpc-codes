package com.Judges.CodeForce.CF157;

import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] radii = new int[l];
        for(int i = 0 ; i < l ;i++)
        {
            radii[i] = sc.nextInt();
        }

        Arrays.sort(radii);
        double sum =0.0;
        for(int i = 0 ; i< l;i ++)
        {
            if(i%2==0)
                sum+= Math.PI * Math.pow(radii[i],2);
            else
                sum-= Math.PI * Math.pow(radii[i],2);
        }
        System.out.printf("%.10f\n",Math.abs(sum));

    }
}
