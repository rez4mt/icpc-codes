//package com.AOU.KCPC.T2019.Training2;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class cute {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("cute.in"));
        //Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        HashSet<Character> set = new HashSet<>();
        set.add('o');
        set.add('e');
        set.add('a');
        set.add('i');
        set.add('u');
        while (T-->0)
        {
            if(set.contains(sc.next().toLowerCase().charAt(0)))
                System.out.println("Vowel");
            else System.out.println("Consonant");
        }
    }
}
