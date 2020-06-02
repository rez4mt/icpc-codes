package com.Judges.CodeForce. CF1352;
import java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(n < k)
            {
                System.out.println("No");
                continue;
            }
            if(n%2==1 && k%2==0)
            {
                System.out.println("No");
                continue;
            }
            if(n == k)
            {
                System.out.println("Yes");
                for(int i = 0 ; i < k ; i++)
                    System.out.print(1+" ");
                System.out.println();
                continue;
            }
            if(k%2==n%2)
            {
                System.out.println("Yes");

                for(int i = 0 ; i < k-1 ; i++)
                    System.out.print(1+" ");
                System.out.println(n-k+1);
                continue;
            }
            //8 5
            //1 1 1 1 1 3
            if(k%2==1 && n%2==0)
            {
                if(k*2 > n)
                    System.out.println("No");
                else{
                    System.out.println("Yes");

                    for(int i = 0 ; i < k-1;i++)
                        System.out.print(2+" ");
                    System.out.println(n-((k-1) *2));
                }
            }


        }
    }
}
