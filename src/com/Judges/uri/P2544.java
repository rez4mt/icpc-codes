package com.Judges.uri;

import java.util.Scanner;

public class P2544 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
            System.out.println((int)(Math.log(sc.nextInt())/Math.log(2)));

    }
}
