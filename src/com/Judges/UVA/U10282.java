package com.Judges.UVA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class U10282 {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String l ;
        String[] l2;
        boolean check = false;
        while (sc.hasNextLine())
        {
            l = sc.nextLine();
            if(!check && l.equals(""))
            {
                check = true;
                continue;
            }

            if(!check)
            {
                l2 = l.split(" ");
                m.put(l2[1],l2[0]);
            }else
                System.out.println(m.getOrDefault(l,"eh"));

        }
    }
}
