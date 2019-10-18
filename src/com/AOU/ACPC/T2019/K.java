package com.AOU.ACPC.T2019;
import java.util.ArrayList;
import java.util.Scanner;

public class K {

    static int[] printSubsets(int set[])
    {

        int n = set.length;
        int[] final_list = new int[1<<n];
        for (int i = 1; i < (1<<n); i++)
        {
            ArrayList<Integer> subArr = new ArrayList<>();
            for (int j = 0; j <= n; j++) {
                if ((i & (1 << j)) > 0)
                    final_list[i] |= set[j];
            }
        }
        return final_list;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        long r = 0;
        int[] slist = printSubsets(arr);
        for(int i = 0 ; i < slist.length ;i++)
            r+=slist[i];

        System.out.println(r);
    }
}