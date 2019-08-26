package com.Judges.CodeForce.CF147;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("([A-Za-z]+(,|\\s+,)|[A-Za-z]+|.)");
        Matcher m = p.matcher(sc.nextLine());

        StringBuilder b = new StringBuilder();

        while (m.find())
        {
            String find = m.group(0);
            if(find.charAt(0)==' ')
                continue;
            if(!Character.isAlphabetic(find.charAt(0)))
            {
                b.deleteCharAt(b.length()-1);
                b.append(find);
                b.append(" ");
            }else{
                b.append(m.group(0).replace(" ",""));
                b.append(" ");
            }
        }
        b.deleteCharAt(b.length()-1);
        System.out.println(b.toString());

    }
}
