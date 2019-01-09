package com.Judges.UVA;

import java.util.Scanner;

public class U12577 {
    public U12577() {

        Scanner sc = new Scanner(System.in);
        String val ;
        int c = 0;
        while (sc.hasNext())
        {
            c++;
            val = sc.next();
            if(val.equals("*"))
                break;
            if(val.equals("Hajj"))
            {
                System.out.printf("Case %d: Hajj-e-Akbar\n",c);
            }else
                System.out.printf("Case %d: Hajj-e-Asghar\n",c);
        }
    }

    public static void main(String[] args) {
        new U12577();
    }
}
