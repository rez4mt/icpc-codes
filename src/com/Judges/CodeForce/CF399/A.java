package com.Judges.CodeForce.CF399;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<String> pages = new ArrayList<>(100);
        int start_point = Math.max(P-k,1) ;

        for(int i = start_point ; i < P ; i++)
        {
            pages.add(i+"");
        }
        pages.add("("+P+")");
        for(int i = P+1 ; i <=Math.min(P+k,N);i++ )
            pages.add(i+"");
        StringBuilder b = new StringBuilder();
        if(!pages.get(0).equals(1+"") && !pages.get(0).equals("("+P+")"))
            b.append("<< ");
        for (String a :
                pages) {
            b.append(a+" ");
        }
        if(!pages.get(pages.size()-1).equals(N+"") && !pages.get(pages.size()-1).equals("("+P+")"))
        {
            b.append(">> ");
        }
        b.deleteCharAt(b.length()-1);
        System.out.println(b);
    }
}
