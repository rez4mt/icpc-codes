package com.Judges.UVA;

import java.util.Scanner;

public class U621 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String temp;
        for(int i = 0 ; i < n ; i++)
        {
            temp = sc.next();
            if(temp.equals("1") || temp.equals("4") || temp.equals("78"))
                System.out.println("+");
            else if(temp.substring(temp.length()-1).equals("5") && temp.substring(temp.length()-2,temp.length()-1).equals("3"))
                System.out.println("-");
            else if(temp.substring(0,1).equals("9") && temp.substring(temp.length()-1).equals("4"))
                System.out.println("*");
            else if(temp.substring(0,3).equals("190"))
                System.out.println("?");
        }
    }
}
