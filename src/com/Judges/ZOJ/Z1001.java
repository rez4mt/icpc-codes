package com.Judges.ZOJ;

import java.util.Scanner;

public class Z1001 {
    public Z1001()
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt())
            System.out.println(sc.nextInt()+sc.nextInt());

    }

    public static void main(String[] args) {
        new Z1001();
    }
}
