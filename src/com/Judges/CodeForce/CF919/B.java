package com.Judges.CodeForce.CF919;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int s = 0 ;
        for(int i = 19 ; list.size()<10000 ; i+=9)
        {
            s = 0;
            for (int x = i; x > 0; x = x / 10)
                s = s + x % 10;
            if(s == 10)
                list.add(i);
        }
        System.out.println(list.get(k-1));
    }
}
