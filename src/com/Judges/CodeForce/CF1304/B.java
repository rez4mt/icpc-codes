package com.Judges.CodeForce.CF1304;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        HashSet<String> revs = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < M ; i++)
            sb.append(" ");
        boolean addedOnce = false;
        StringBuilder ans = new StringBuilder();
        String once ="";
        for(int i = 0 ; i < N ; i++)
        {
            String s = sc.next();
            //if it is pal add it
            if(!addedOnce)
            {
                boolean flag = true;
                for(int j = 0 ; j < M/2;j++)
                {
                    if(s.charAt(j)!=s.charAt(M-j-1))
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag)
                {
                    addedOnce = true;
                    once = s;
                    continue;
                }
            }


            if(revs.contains(s))
            {
                ans.append(s);
                revs.remove(s);
            }else
            {
                for(int j = 0 ;  j < M ; j++)
                    sb.setCharAt(j,s.charAt(M-j-1));
                revs.add(sb.toString());
            }
        }
        int l = ans.length();
        if(l==0)
        {
            if(addedOnce)
            {
                System.out.println(once.length());
                System.out.println(once);
            }else {
                System.out.println(0);
                System.out.println();
            }
        }else
        {
            ans.append(once);
            for(int i = 0 ; i < l  ; i++)
            {
                ans.append(ans.charAt(l-i-1));
            }
            System.out.println(ans.length());
            System.out.println(ans);

        }
    }
}
