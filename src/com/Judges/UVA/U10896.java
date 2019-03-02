package com.Judges.UVA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class U10896 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-->0)
        {
            String[] l = sc.nextLine().split(" ");
            String s = sc.nextLine();
            SortedSet<Character> set = new TreeSet<>();
            for (String dec :
                    l) {
                if (l.length != s.length())
                    continue;

                int c = (dec.charAt(0)-s.charAt(0));


                System.out.println(c);
            }
        }
    }
}
