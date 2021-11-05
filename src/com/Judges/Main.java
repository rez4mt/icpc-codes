package com.Judges;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        if(x < 1200){
            System.out.println("ABC");
        }else{
            System.out.println("ARC");
        }
    }
}
