package com.Judges.UVA;

import java.util.Scanner;

public class U913 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long num;
        while(in.hasNext()){
            num = in.nextLong();
            long line = (num+1)/2;
            long last = ((line * line) * 2 )-1;
            System.out.println(3*last-6);
        }
    }
}
