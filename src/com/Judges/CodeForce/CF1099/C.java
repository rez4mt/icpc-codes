package com.Judges.CodeForce.CF1099;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C {
    static StringBuilder mb;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int target_length = sc.nextInt();
        String repStr = s.replace("*","").replace("?","");
        StringBuilder b = new StringBuilder(s);
        if(repStr.length() == target_length)
        {
            System.out.println(repStr);
        }else if(target_length>repStr.length())
        {
            if(s.contains("*"))
            {
                int index = s.indexOf("*")-1;
                if(index>=0)
                {
                    char ch = s.charAt(index);
                    int p = target_length - repStr.length();
                    for(int i = 0 ; i < p ; i++)
                        b.insert(index,String.valueOf(ch));
                    System.out.println(b.toString().replace("*","").replace("?",""));
                }
            }else
            {
                System.out.println("Impossible");
            }
        }else
        {
            b = new StringBuilder(s);
            while (s.contains("?") && s.replace("?", "").replace("*","").length() != target_length) {
                int index = s.indexOf("?");
                b.deleteCharAt(index-1);
                b.deleteCharAt(index-1);
                s = b.toString();
            }
            while (s.contains("*") && s.replace("?", "").replace("*","").length() != target_length) {
                int index = s.indexOf("*");
                b.deleteCharAt(index-1);
                b.deleteCharAt(index-1);
                s = b.toString();
            }
            if (s.replace("?", "").replace("*","").length() != target_length) {
                System.out.println("Impossible");
            } else {
                System.out.println(s.replace("?", "").replace("*",""));
            }
        }
    }

}
