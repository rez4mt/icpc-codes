package com.ICPC.Sharif.P97;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int max = 0 ,current = 0;
        for(int i = 0 ; i < s.length();i++)
        {
            if(s.charAt(i) == "0".charAt(0))
            {
                current++;
            }else if(s.charAt(i) == "1".charAt(0))
            {
                if(current>max)
                    max = current;
                current = 0;
            }
        }

        System.out.println(Math.max(current,max));
    }
}
