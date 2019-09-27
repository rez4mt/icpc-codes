package com.Judges.CodeForce.CF96;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] list = sc.next().toCharArray();
        int current  = list[0];
        int count = 1;
        for(int i = 1 ; i < list.length;i++)
        {
            if(list[i] == current)
                count++;
            else {
                current = list[i];
                count = 1 ;
            }
            if(count == 7)
            {
                System.out.println("YES");
                return ;
            }
        }
        System.out.println("NO");

    }
}
