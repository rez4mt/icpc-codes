package com.Judges.CodeForce.CF1328;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            int[] t = new int[N+1];
            for(int i = 0 ; i <  N ; i++)
                t[i] = sc.nextInt();
            t[N] = t[0];
            HashMap<Integer , Integer> colors = new HashMap<>();
            int flag = 0;
            for(int i = 1 ; i <= N ; i++)
            {
                if(t[i] != t[i-1])
                {
                    flag = 1;
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            if(flag == 0 )
            {
                System.out.println(1);
                for(int i = 0 ; i < N ; i++)
                    sb.append(1+" ");
                sb.deleteCharAt(sb.length()-1);
                System.out.println(sb);
                continue;
            }else
            {
                //check if they are all different values..
                for(int i = 1 ; i<= N ; i++)
                    if(t[i] == t[i-1])
                    {
                        flag = 2;
                        break;
                    }
                if(flag == 1 || N%2==0)
                {
                    //they are all different.
                    if(N%2==0)
                    {
                        System.out.println(2);
                        for(int i = 0 ; i < N ; i++)
                            sb.append((i&1) +1+" ");
                        sb.deleteCharAt(sb.length()-1);
                        System.out.println(sb);
                    }else
                    {
                        System.out.println(3);
                        for(int i = 0 ; i < N-1 ; i++)
                        {
                            sb.append((i&1) +1+" ");
                        }
                        sb.append("3");
                        System.out.println(sb);
                    }
                }else
                {
                    System.out.println(2);
                    boolean colored = false;
                    sb.append("1 ");
                    for(int i = 1 ; i < N ; i++)
                    {
                        if(!colored && t[i] == t[i-1])
                        {
                            sb.append(((i-1)&1) +1+" ");
                            colored = true;
                            continue;
                        }
                        sb.append(((colored?i-1:i)&1) +1+" ");
                    }
                    sb.deleteCharAt(sb.length()-1);
                    System.out.println(sb);
                }
            }
        }
    }
}