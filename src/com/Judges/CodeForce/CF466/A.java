package com.Judges.CodeForce.CF466;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,a,b;
        n = sc.nextInt();
        m = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();

        int one_way_cost = n * a;
        int m_way_cost = n<m?1:((n/m)+(n%m!=0?1:0)) * b;
        if(one_way_cost< m_way_cost)
        {
            System.out.println(one_way_cost);
            return;
        }

        m_way_cost = n/m*b;
        int r = (n%m);
        if(b < r*a)
        {
            m_way_cost+=b;
        }else
        {
            m_way_cost += r*a;
        }
        System.out.println(m_way_cost);

    }
}
