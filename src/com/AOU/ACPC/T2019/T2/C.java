package com.AOU.ACPC.T2019.T2;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder org = new StringBuilder();
        StringBuilder inp = new StringBuilder();

        while (N-->0) {
            org.append(sc.next() + " ");
        }
        org.deleteCharAt(org.length() - 1);
        boolean caps = false;
        int M = sc.nextInt();
        while (M-->0) {
            String input = sc.next();
            switch (input) {
                case "CapsLock":
                    caps = !caps;
                    break;
                case "Backspace":
                    if (inp.length() > 0) {
                        inp.deleteCharAt(inp.length() - 1);
                    }
                    break;
                case "Space":
                    inp.append(" ");
                    break;
                default:
                    inp.append(caps ? input.toUpperCase() : input.toLowerCase());
                    break;
            }
        }
        System.out.println(org.toString().equals(inp.toString()) ? "Correct" : "Incorrect");
    }
}
