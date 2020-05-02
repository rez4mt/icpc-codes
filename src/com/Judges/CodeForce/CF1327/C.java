package com.Judges.CodeForce.CF1327;


import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < m-1 ; i++)
            sb.append("L");
        for(int i = 0 ; i < n -1 ; i++)
            sb.append("U");
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0; j < m-1 ;j++)
            {
                if(i%2==0)
                    sb.append("R");
                else sb.append("L");
            }
            if(i!=n-1)
                sb.append("D");
        }
        System.out.println(sb.length());
        System.out.println(sb);

    }
}