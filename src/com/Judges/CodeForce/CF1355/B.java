package com.Judges.CodeForce. CF1355;
import java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int[] list  = new int[n];
            for(int i = 0 ; i < n ; i++)
                list[i] = sc.nextInt();
            Arrays.sort(list);
            int cnt  = 0;
            int rem = 0 ;
            int current_count = 0 ;
            for(int i = 0 ; i < n ; i++)
            {
                if(rem == 0)
                {
                    rem = list[i];
                    current_count =1 ;

                }
                else{
                    rem = Math.max(rem , list[i]);
                    current_count++;
                }
                if(rem == current_count)
                {
                    cnt++;
                    rem = 0 ;
                }
            }
            System.out.println(cnt);
        }
    }
}
