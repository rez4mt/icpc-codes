package com.Judges.uri;

import java.util.Scanner;

public class P1219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        while (sc.hasNext())
        {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            double p = (a+b+c) * 0.5;
            double triangleArea = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            double rSmall = Math.sqrt(((p-a)*(p-b)*(p-c))/p);
            double smallArea = Math.PI * Math.pow(rSmall,2);
            //double rLarge = (a*b*c)/Math.sqrt((a+b+c)*(a+b-c)*(a+c-b)*(b+c-a));
            double rLarge = (a*b*c)/(4*triangleArea);
            double largeArea =  (Math.PI * Math.pow(rLarge,2));
            System.out.printf("%.4f %.4f %.4f\n",largeArea-triangleArea,triangleArea-smallArea,smallArea);
        }


    }


}
