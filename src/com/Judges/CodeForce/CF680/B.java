package com.Judges.CodeForce.CF680;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt()-1;
        boolean[]  isC = new boolean[n];
        for(int i = 0 ; i < n ; i++)
            isC[i] = sc.nextInt() == 1;
        int crim = isC[b]?1:0;
        for(int i = 1 ; i+b < isC.length || b-i >=0;i++)
        {
            if(i+b < isC.length)
            {
                if(b-i<0)
                    crim += isC[i+b]?1:0;
                else crim+= isC[i+b] && isC[b-i]?2:0;
            }else if(b-i>=0)
            {
                crim+= isC[b-i]?1:0;
            }
        }
        System.out.println(crim);
    }
}
