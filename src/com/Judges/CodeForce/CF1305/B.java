package com.Judges.CodeForce.CF1305;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class B {
    static String s ;
    static int ops = 0 ;
    static boolean[] removed;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder finalS = new StringBuilder();
        s=sc.next();
        removed = new boolean[s.length()];
        while(s.length()!=0 && can())
        {
            ops++;
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            int r = s.length()-1;
            int l = 0 ;
            while(r>l)
            {
                if(removed[r]||removed[l])
                {
                    if(removed[r])
                        r--;
                    if(removed[l])
                        l++;
                    continue;
                }
                if(s.charAt(r)==')' && s.charAt(l)=='(')
                {
                    removed[r] = true;
                    removed[l] = true;
                    pq.add(r+1);
                    pq.add(l+1);
                    l++;
                    r--;
                }else if(s.charAt(r)==')')
                {
                    l++;
                }else if(s.charAt(l)=='(')
                    r--;
                else {
                    r--;
                    l++;
                }
            }
            finalS.append(pq.size()+"\n");
            while(!pq.isEmpty())
            {
                finalS.append(pq.poll()+ " ");
            }
            finalS.deleteCharAt(finalS.length()-1);
            finalS.append("\n");
        }

        System.out.println(ops);
        System.out.print(finalS);
    }
    static boolean can()
    {
        int r = s.length()-1;
        int l = 0;
        while(l<r)
        {
            if(removed[r]||removed[l])
            {
                if(removed[r])
                    r--;
                if(removed[l])
                    l++;
                continue;
            }
            if(s.charAt(r) ==')' && s.charAt(l)=='(')
                return true;
            if(s.charAt(r) == ')')
                l++;
            else if(s.charAt(l)=='(')
                r--;
            else {
                r--;
                l++;
            }
        }
        return false;
    }
}
