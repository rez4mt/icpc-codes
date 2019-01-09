package com.Judges.UVA;

import java.util.Scanner;

public class U1185 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        for (int i = 0; i < numCases; i++) {
            int n = sc.nextInt();
            double numDigits = 0;
            for (int j = n; j > 1; j--) {
                numDigits += Math.log10(j);
            }

            numDigits = Math.floor(numDigits) + 1;
            System.out.println((int) numDigits);
        }
    }
}
