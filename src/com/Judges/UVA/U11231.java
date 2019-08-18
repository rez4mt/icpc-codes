package com.Judges.UVA;

import java.util.Scanner;

public class U11231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int n , m , c;
            n = sc.nextInt();
            m = sc.nextInt();
            c = sc.nextInt();
            if(n == 0 && m == 0 && c == 0)
                break;
            long x = ((n - 7) * (m - 7)) + c;
            x /= 2;
            System.out.println(x);

        }
    }
}
