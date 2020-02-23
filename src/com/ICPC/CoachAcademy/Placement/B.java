package com.ICPC.CoachAcademy.Placement;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        System.out.println(Math.abs(sc.nextInt()+sc.nextInt()));
    }
}
