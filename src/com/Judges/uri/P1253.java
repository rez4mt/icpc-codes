package com.Judges.uri;

import java.util.Scanner;

public class P1253 {
    public static void main(String[] args) {
        new P1253();

    }

    public P1253()
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(),sh;
        String str;
        int p;
        for(int i = 0 ; i < l ; i++)
        {
            sc.nextLine();
            str = sc.nextLine();
            sh = sc.nextInt();
            for(int j = 0 ; j< str.length();j++)
            {
                p = (int)str.charAt(j) - sh;
                if(p<65)
                    p+=26;

                System.out.print((char) p);

            }
            System.out.println();
        }
    }

}
