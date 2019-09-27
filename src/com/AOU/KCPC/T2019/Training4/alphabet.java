package com.AOU.KCPC.T2019.Training4;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("strings.in"));
        //Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        HashMap<Character , Character> map = new HashMap<>();

        map.put('A','B');
        map.put('B', 'B');
        map.put('C', 'C');
        map.put('D', 'C');
        map.put('E', 'E');
        map.put('F', 'E');
        map.put('G', 'G');
        map.put('H', 'G');
        map.put('I', 'G');
        map.put('J', 'K');
        map.put('K', 'K');
        map.put('L', 'K');
        map.put('M', 'M');
        map.put('N', 'M');
        map.put('O', 'M');
        map.put('P', 'Q');
        map.put('Q', 'Q');
        map.put('R', 'Q');
        map.put('S', 'S');
        map.put('T', 'S');
        map.put('U', 'S');
        map.put('V', 'W');
        map.put('W', 'W');
        map.put('X', 'W');
        map.put('Y', 'W');
        map.put('Z', 'W');

        while (T-->0)
        {
            String s = sc.next();
            StringBuilder b = new StringBuilder();
            for(int i = 0 ; i < s.length() ;i++)
            {
               b.append(map.get(s.charAt(i)));
            }

            System.out.println(b.toString());
        }
    }
    static class mN{
        int idx ;
        char prev , next;
        public mN(int idx , char p , char N){
            this.prev = p ;
            this.idx = idx;
            next = N;
        }
    }
}
