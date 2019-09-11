package com.Judges.UVA;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class U10611 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[N];
        for(int i = 0 ; i < N ; i++)
            list[i] = sc.nextInt();
        int Q = sc.nextInt();
        PrintWriter pw = new PrintWriter(System.out);
        for(int i = 0 ; i < Q ; i++)
        {
            int height = sc.nextInt();
            int idx = Arrays.binarySearch(list,height);
            //System.out.println(idx);
            if(idx>=0)
            {
                if(idx>0)
                {
                    int cidx = idx;
                    while (cidx>0 && list[cidx]==height)
                        cidx--;
                    if(list[cidx] == height)
                        pw.print("X");
                    else pw.print(list[cidx]);
                }
                while (idx<N && list[idx] == height)
                    idx++;
                if(idx == N || list[idx] == height)
                    pw.print(" X");
                else{
                    pw.print(" "+list[idx]);
                }
                pw.println();
            }else
            {
                idx = -idx;
                idx -= 2;
                int cidx = idx;
                if(list[cidx] < height)
                {
                    pw.print(list[cidx]);
                    if(cidx == N-1)
                        pw.print(" X");
                    else{
                        while (cidx<N && list[cidx]<height)
                            cidx++;
                        if(cidx == N || list[cidx] <height)
                            pw.print(" X");
                        else
                            pw.print(" "+list[cidx]);
                    }
                    pw.println();
                }else if (list[cidx] > height){

                    while (cidx>=0 && list[cidx]>height)
                        cidx--;
                    if(cidx<0 || list[cidx]>height)
                        pw.print("X ");
                    else pw.print(list[cidx]);
                    pw.print(" "+list[cidx]);
                    pw.println();
                }


            }
        }
        pw.flush();
    }
    /*public static  int bs(int[] list , int r , int l , int val)
    {
        int mid = r + (l-r)/2;
        if(r == l)
            return -mid;
        if(list[mid] == val)
            return mid;
        if(val < list[mid])
            return bs(list , r , l-1 , val);
        else return bs(list , r+1 , l , val);
    }*/
}
