package com.Judges.UVA;

import java.util.Arrays;
import java.util.Scanner;

public class U10474 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = 1;
        while (sc.hasNext())
        {
            int a ,b;
            a = sc.nextInt();
            b = sc.nextInt();
            if(a == 0 && b == 0)
                break;
            System.out.printf("CASE# %d:\n",tc++);
            int[] arr = new int[a];
            int[] q = new int[b];
            for(int i = 0 ; i < a ; i++)
            {
                arr[i] = sc.nextInt();
            }
            for(int i = 0 ; i < b ; i++)
            {
                q[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            for (int qu :
                    q) {
                int index = Arrays.binarySearch(arr, qu);
                if(index >=0)
                {
                    System.out.printf("%d found at %d\n",qu,index+1);
                }else
                {
                    System.out.printf("%d not found\n",qu);
                }
            }
        }
    }
}
