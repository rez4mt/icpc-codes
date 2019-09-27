package com.Judges.CodeForce.CF1215;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a1 = sc.nextInt(); // first team
        int a2 = sc.nextInt(); // second team
        int k1 = sc.nextInt(); // max y count team 1
        int k2 = sc.nextInt(); // max y count team 2
        int n = sc.nextInt();  // y showed
        if((a1*k1) + (a2*k2) == n )
        {
            System.out.println((a1+a2) +" "+(a1+a2));
            return ;
        }
        //for min count
        //a1 * (k1-1) , consumed y cards
        //a2 * (k2-1) , consumed y cards
        // if still there is a yellow card , output az min
        int min = n-((a1*(k1-1))+(a2*(k2-1)));
        if(min<=0)
            min = 0;
        int max;
        if(k1>k2)
        {
            int max_drop = n/k2;
            if(max_drop>a2)
            {
                max = a2;
                n-= a2*k2;
            }else
            {
                max = n/k2;
                n -= max*k2;

            }
            if(n>=k1)
                max+= n/k1;
        }else
        {
            int max_drop = n/k1;
            if(max_drop>a1)
            {
                max = a1;
                n-= a1*k1;
            }else
            {
                max = n/k1;
                n -= max*k1;

            }
            if(n>=k2)
                max+= n/k2;
        }
        System.out.println(min+" "+max);
    }
}
