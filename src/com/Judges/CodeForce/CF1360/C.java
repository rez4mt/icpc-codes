package com.Judges.CodeForce.CF1360;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int[] list = new int[n];
            for(int i = 0 ; i < n ; i++)
                list[i] = sc.nextInt();
            Arrays.sort(list);
            int even_c = 0 ;
            int odd_c = 0 ;
            for(int i = 0 ; i < n ;i++)
                if(list[i]%2 == 0)
                    even_c++;
                else odd_c++;
                //
            if(even_c%2==0 && odd_c%2==0)
            {
                System.out.println("YES");
                continue;
            }
            if(even_c%2==odd_c%2)
            {
                //check u can find |a-b| =1
                for(int i = 1 ; i < n ;i++)
                {
                    if(Math.abs(list[i]-list[i-1])==1)
                    {
                        odd_c--;
                        even_c--;
                        break;
                    }
                }
                if(even_c%2==0 && odd_c%2==0)
                {
                    System.out.println("YES");
                    continue;
                }else System.out.println("NO");
                continue;
            }

            System.out.println("NO");
        }
    }
}
