package com.Judges.CodeForce.CF394;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sticks = sc.nextLine();
        int[] ss = new int[3];
        ss[0] = sticks.indexOf("+");
        ss[1] = sticks.indexOf("=") - sticks.indexOf("+") - 1 ;
        ss[2] = sticks.substring(sticks.indexOf("=")).length()-1;
        if(ss[0]+ss[1] == ss[2])
        {
            System.out.println(sticks);
            return;
        }else if(ss[0]+ss[1]+2 == ss[2])
        {
            //need change
            ss[2]--;
            ss[0]++;
            printIt(ss);
        }else if(ss[0]+ss[1] == ss[2]+2)
        {
            //need change
            if(ss[0]==1)
                ss[1]--;
            else ss[0]--;
            ss[2]++;
            printIt(ss);

        } else System.out.println("Impossible");

    }

    public static void printIt(int[] counts)
    {
        String s = "";
        for(int i = 0 ; i< 3;i++)
        {
            for(int j = 0 ; j< counts[i];j++)
            {
                s+="|";
            }
            if(i==0)
                s+="+";
            else if(i == 1)
                s+="=";
        }
        System.out.println(s);
    }
}
