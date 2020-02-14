package com.Judges.UVA;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class U10132 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        sc.nextLine();
        String s;
        while(t-->0) {
            List<String> input = new ArrayList<String>();
            int numberLength = 0;
            while(true) {
                if(!sc.hasNextLine())
                    break;
                s = sc.nextLine();
                if(s.length() == 0)
                    break;
                input.add(s);
                numberLength += s.length();
            }
            numberLength /= input.size()/2;
            Set<String> ans = new HashSet<String>();
            for (int i = 1; i < input.size(); i++) {
                String s1 = input.get(0);
                String s2 = input.get(i);

                if (s1.length()+s2.length()==numberLength) {
                    ans.add(s1+s2);
                    ans.add(s2+s1);
                }
            }
            for (int i = 1; i < input.size(); i++) {
                Set<String> tempSet = new HashSet<String>();
                for (int j = 0; j < input.size(); j++) {
                    if (i==j) {
                        continue;
                    }
                    String s1 = input.get(i);
                    String s2 = input.get(j);
                    if (s1.length() + s2.length() == numberLength) {
                        tempSet.add(s1 + s2);
                        tempSet.add(s2 + s1);
                    }
                }
                ans.retainAll(tempSet);
            }
            for (String an : ans) {
                System.out.println(an);
                break;
            }
            if(t!=0)
                System.out.println("");
        }
    }
}