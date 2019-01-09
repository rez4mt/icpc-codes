package com.Judges.UVA;

import java.util.Scanner;

public class U11498 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n,m,x,y,K;
        while (sc.hasNextInt())
        {
            K = sc.nextInt();
            if(K == 0)
                break;
            n = sc.nextInt();
            m = sc.nextInt();
            for(int i = 0; i<K;i++)
            {
                x = sc.nextInt();
                y = sc.nextInt();
                if(x == n || m == y)
                {
                    System.out.println("divisa");
                }else if(x>n)
                {
                    if(y>m)
                        System.out.println("NE");
                    else
                        System.out.println("SE");
                }else
                {
                    if(y>m)
                        System.out.println("NO");
                    else
                        System.out.println("SO");
                }
            }
        }

    }
}
