package com.Judges.CodeForce.CF1315;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T  = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            int[] list = new int[N+1];
            HashSet<Integer> set = new HashSet<>();
            for(int i =1  ; i <= N;i++)
            {
                list[i] = sc.nextInt();
                set.add(list[i]);
            }
            int[] finalList = new int[2*(N+1)];
            Arrays.fill(finalList , -1);
            for(int i =  1 ; i <= 2*N ; i+=2)
            {
                int idx = (int)(Math.ceil(i/2d));
                finalList[i] = list[idx];
            }
            boolean flag = true;
            for(int i = 1 ; i <= N ; i++)
            {
                int bi = list[i];
                int min = Math.min(finalList[2*i],finalList[(2*i)-1]);
                if(min>bi)
                {
                    flag = false;
                    break;
                }
                //find the number
                for(int k = Math.max(Math.max(finalList[2*i],finalList[(2*i)-1]) , 0) ;k<=2*N;k++)
                {
                    //
                    if(!set.contains(k))
                    {
                        //bzrsh too
                        finalList[2*i] = k;
                        set.add(k);
                        break;
                    }
                }
            }
            if(!flag)
                System.out.println(-1);
            else
            {
                StringBuilder sb = new StringBuilder();
                for(int i = 1; i <= 2*N ; i++)
                {
                    if(finalList[i] == -1)
                    {
                        flag = false;
                        System.out.println(-1);
                        break;
                    }
                    sb.append(finalList[i]+" ");
                }
                if(flag)
                {
                    sb.deleteCharAt(sb.length()-1);
                    System.out.println(sb.toString());
                }
            }

        }
    }
}
