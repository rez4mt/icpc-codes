package com.Judges.uri;

import java.util.Scanner;

public class P1074 {
    public P1074()
    {
        Scanner sc = new Scanner(System.in);
        int l =sc.nextInt();
        int num ;
        String str;
        for(int i = 0 ; i < l; i++)
        {
            str = "";
            num = sc.nextInt();
            if(num == 0){
                System.out.println("NULL");
                continue;
            }
            if(num%2 == 0)
                str += "EVEN ";
            else
                str += "ODD ";
            if(num > 0)
                str += "POSITIVE";
            else
                str += "NEGATIVE";
            System.out.println(str);
        }

    }

    public static void main(String[] args) {
        new P1074();
    }
}
