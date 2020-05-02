package com.Judges.CodeForce.CF1324;



import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0  ; i< N ;i++)
            a[i] = sc.nextInt();
        for(int j = 0 ; j < N ; j++)
            a[j] -= sc.nextInt();
        Arrays.sort(a);
        long res = 0 ;
        int idx = Arrays.binarySearch(a,1,N,-a[0]);
        if(idx<0)
            idx = -idx-1;
        for(int j = idx ; j < N ; j++)
            if(a[j]==-a[0])
            {
                idx++;
            }
        res += N-idx;
        for(int i = 1 ; idx < N && i <N  ; i++)
        {
            while (idx<=i)
                idx++;
            if(idx==N)
                break;
            while( -a[i]>a[idx])
                idx++;
            res += N-idx;
        }
        System.out.println(res);

    }
}
