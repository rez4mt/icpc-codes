package com.AOU.ACPC.T2019.T1;

import java.util.Scanner;

public class I {
    static int i = 0 ;
    static String line;
    static int[] list;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        list = new int[N+1];
        line = sc.next();
        if(line.isEmpty())
        {
            System.out.println();
            return;
        }
        //System.out.println(readInt());
        create(0);
        StringBuilder b = new StringBuilder();

        for(int i = 1 ; i <= N ;i++)
            b.append(list[i]+" ");
        if(!b.toString().isEmpty())
            b.deleteCharAt(b.length()-1);
        System.out.println(b.toString());
    }
    private static void create(int parent)
    {
        int new_p = parent;
        if(line.charAt(i)!='(' || line.charAt(i)!=')')
        {
            new_p = readInt();
            list[new_p] = parent;
        }

        if(i<line.length() && line.charAt(i) == '(')
        {
            while (i < line.length() && line.charAt(i)!=')')
            {
                i++;
                create(new_p);
                if(i < line.length() && line.charAt(i) == ')')
                    i++;
            }


        }



    }
    private static int readInt()
    {
        int val = 0;
        boolean is = i < line.length();
        while (i < line.length() && line.charAt(i)!='(' && line.charAt(i)!=')')
        {

            val*= 10;
            val+=(line.charAt(i) - '0');
            i++;
        }
        return val;
    }
}
