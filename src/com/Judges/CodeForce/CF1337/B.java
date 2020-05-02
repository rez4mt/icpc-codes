package com.Judges.CodeForce.CF1337;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0) {
            int x = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();
            while (x > 20 && n > 0){
                x/=2;
                x+=10;
                n--;
            }
            if(x- (m*10)<=0)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
