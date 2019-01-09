package com.Judges.UVA;

import java.util.Scanner;

public class U11349 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        long[][] mat;
        int a ;
        boolean sym;
        for(int i = 0;i<n;i++)
        {
            sym = true;
            sc.next();
            sc.next();
            a = sc.nextInt();
            mat = new long[a][a];
            for(int x=0;x<a;x++)
            {
                for(int y = 0 ; y < a;y++)
                {
                    mat[x][y] = sc.nextLong();
                }
            }
            for(int x=0;x<a;x++)
            {
                for(int y = 0 ; y < a;y++)
                {
                    if(mat[x][y]<0 || mat[x][y]!=mat[(a-1)-x][(a-1)-y])
                    {
                        sym = false;
                        System.out.printf("Test #%d: Non-symmetric.\n",i+1);
                        y=a;
                        x=a;
                    }
                }
            }
            if(sym)
            System.out.printf("Test #%d: Symmetric.\n",i+1);
        }
    }
}
