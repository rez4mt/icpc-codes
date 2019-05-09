package com.ICPC.GPC.P19;

import java.util.ArrayList;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A==0 && B == 0)
                break;
            if(palin(A,B))
            {
                System.out.println("Yes");
            }else System.out.println("No");
        }
    }

    private static boolean palin(int num,int B)
    {
        ArrayList<Integer> list = new ArrayList<>();
        while(num!=0)
        {
            list.add(num%B);
            num /= B;
        }
        int r = list.size()-1;
        int l = 0;
        while(l<r)
        {
            if(!list.get(r).equals(list.get(l)))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
