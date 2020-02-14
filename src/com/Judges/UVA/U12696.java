package com.Judges.UVA;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FE111-u10
 */
public class U12696 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sum = 0;
        while(t-->0) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double d = sc.nextDouble();
            if (a<=56 && b<=45 && c<=25 && d<=7 || a+b+c<=125 && d<=7) {
                System.out.println(1);
                sum++;
            }
            else {
                System.out.println(0);
            }
        }
        System.out.println(sum);
    }
}