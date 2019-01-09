package com.ICPC.Sharif.P97;

import java.util.*;

public class P7 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] clone = new int[n];
        System.out.println("here");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
            clone[i] = arr[i];
        }
        System.out.println("here");
        Arrays.sort(clone);
        System.out.println(Arrays.toString(clone));
        int index_min =0,index_max=0;
        for(int i = 0 ; i<n;i++)
        {
            if(arr[i] == clone[n-1])
                index_max = i;
            if(arr[i] == clone[n-2])
                index_min = i;
        }
        System.out.println(Math.abs(index_max-index_min)+1);
    }
}
