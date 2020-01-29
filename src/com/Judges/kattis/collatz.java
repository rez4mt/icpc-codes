package com.Judges.kattis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       while (sc.hasNext())
       {
           long A = sc.nextLong();
           long B = sc.nextLong();
           long initialA = A;
           long initialB = B;
           if(A == 0 && B==0)
               break;
           int Acount = 0 ;
           int Bcount = 0 ;
           HashMap<Long , Integer> avals = new HashMap<>();
           while (A!=1)
           {
               avals.put(A , Math.min(avals.getOrDefault(A , Integer.MAX_VALUE),Acount));
               if(A%2==0)
               {
                   A/=2 ;
               }else {
                   A = (3L*A)+1;
               }
               Acount++;
           }
           while(B!=1)
           {
               if(avals.containsKey(B))
               {
                   Acount = avals.get(B);
                   A = B;
                   break;
               }
               if(B%2==0)
               {
                   B/=2;
               }else
               {
                   B =(3L*B)+1;
               }
               Bcount++;
           }
           System.out.printf("%d needs %d steps, %d needs %d steps, they meet at %d\n",initialA , Acount, initialB, Bcount, A);
       }

    }

}
