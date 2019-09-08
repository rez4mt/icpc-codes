//package com.AOU.KCPC.T2019;

import java.io.File;
import java.util.Scanner;

public class kepler {

    static boolean check(String str1, String str2){
        int j = 0;
        for(int i = 0; i < str2.length(); i++){
            if(str1.charAt(j) == str2.charAt(i)){
                ++j;
            }
            if(j == str1.length()){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("kepler.in"));
        int T = sc.nextInt();
        while (T-->0)
        {
            String s1 = sc.next();
            String s2 = sc.next();
            boolean flag = false;
            if(s1.length()> s2.length())
            {
                flag = check(s2,s1);
            }else
            {
                flag = check(s1,s2);
            }
            if(flag)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
