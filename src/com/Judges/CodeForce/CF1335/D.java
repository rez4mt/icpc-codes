package com.Judges.CodeForce.CF1335;

import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
        sc.nextLine();
        int[] map = new int[]{0,3,6,1,4,7,2,5,8};
        while (T-->0)
        {
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < 9 ; i++) {
                String line = sc.nextLine();
                StringBuilder ms = new StringBuilder(line);
                int idx  = map[i];
                ms.setCharAt(idx, (char) ('0' + (line.charAt(idx) - '0' +(line.charAt(idx)=='9'?-1:1))));
                  /*  ms.setCharAt(3, (char) ('0' + (line.charAt(3) - '0' +(line.charAt(3)=='9'?-1:1))));
                    ms.setCharAt(6, (char) ('0' + (line.charAt(6) - '0' +(line.charAt(6)=='9'?-1:1))));*/
                sb.append(ms);
                sb.append("\n");
                //sb.append(line);
                //sb.append("\n");
            }
            System.out.print(sb);
        }
    }
}
