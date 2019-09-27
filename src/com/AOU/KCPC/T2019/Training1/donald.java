package com.AOU.KCPC.T2019.Training1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class donald {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("donald.in"));
        int T = sc.nextInt();
        while (T-->0)
        {
            int N = sc.nextInt();
            Integer[] arr = new Integer[N];
            for(int i = 0 ; i < N ; i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr,new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2) {
                    boolean AODD = o1%2 == 1;
                    boolean BODD = o2%2 == 1;
                    if(AODD && BODD)
                    {
                        return Integer.compare(o1,o2);
                    }else if(AODD)
                    {
                        return -1;
                    }else if(BODD)
                        return 1 ;
                    else return -Integer.compare(o2,o1);

                }
            });
            StringBuilder b = new StringBuilder();
            for(int i = 0 ; i < N ; i++)
            {
                b.append(arr[i]+" ");

            }
            b.deleteCharAt(b.length()-1);
            System.out.println(b.toString());
        }
    }
}
