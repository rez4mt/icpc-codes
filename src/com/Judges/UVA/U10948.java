package com.Judges.UVA;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Scanner;

public class U10948 {
    static BitSet bset;
    static int MAX = 10000001;
    public static void main(String[] args) {
        bset = new BitSet(MAX);
        bset.set(2); //list.add(2);
        for (int j = 3; j < MAX; j+=2) bset.set(j);
        int sqrt = (int) Math.sqrt(MAX);
        for (int i = 3; i < sqrt; i+=2)
            if (bset.get(i)) {
                for (int j = i*i; j < MAX; j+=2*i) bset.clear(j);
                //list.add(i);
            }
            //
            //
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int a = sc.nextInt();
            if(a==0)
                break;
            boolean f = false;
            for(int i = 2 ; i < a;i++ )
            {
                if(bset.get(i) && bset.get(a-i))
                {
                    f = true;
                    System.out.printf("%d:\n%d+%d\n",a,i,a-i);
                    break;
                }
            }
            if(!f)
            {
                System.out.printf("%d:\nNO WAY!\n",a);
            }
        }
    }

}
