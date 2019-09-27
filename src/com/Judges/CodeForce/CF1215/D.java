package com.Judges.CodeForce.CF1215;

import java.util.Scanner;

public class D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String ch = sc.next();
        int rsum = 0,lsum = 0;
        int tr = 0 , tl = 0 ;
        for(int i = 0 ; i < T ; i++)
        {
            if(ch.charAt(i) == '?')
            {
                if(i<T/2)
                    tl+=9;
                else tr+=9;
            }else
            {
                if(i<T/2)
                    lsum += Integer.parseInt(ch.charAt(i)+"");
                else
                    rsum += Integer.parseInt(ch.charAt(i)+"");
            }
        }

        if(lsum+tl>rsum+tr)
            System.out.println("Monocarp");
        else if(rsum>lsum)
        {
            System.out.println("Monocarp");
        }else System.out.println("Bicarp");

    }

}
