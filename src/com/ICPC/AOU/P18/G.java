package com.ICPC.AOU.P18;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-->0)
        {
            String s = sc.nextLine();
            int sum = 0;
            int missing = -1;
            for(int i = 0 ; i < s.length();i++)
            {
                switch (s.charAt(i))
                {
                    case 'X':
                        sum+= (i+1)*10;
                        break;
                    case '?':
                        missing = i+1;
                        continue;
                    default:
                        sum += (i+1)*Integer.valueOf(String.valueOf(s.charAt(i)));
                        break;
                }
            }

            for(int i = 0 ; i < 11;i++)
            {
                if((sum + (i*missing)) % 11 == 0)
                {
                    System.out.println(i==10?"X":i);
                }
            }
        }
    }
}
