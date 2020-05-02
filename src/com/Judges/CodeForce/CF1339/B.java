package com.Judges.CodeForce.CF1339;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            ArrayList<Integer> list = new ArrayList<>();
            int N = sc.nextInt();
            for(int i = 0 ; i < N ; i++)
                list.add(sc.nextInt());
            Collections.sort(list);
            int r = N-1;
            int l = 0;
            int idx = 0 ;
            int[] rearr = new int[N];
            while (r>=l)
            {

                rearr[idx++] = list.get(r);
                if(r!=l)
                rearr[idx++] = list.get(l);
                r--;
                l++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = N-1 ; i>=0 ;i--)
                sb.append(rearr[i]+" ");
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb);
        }

    }
}
