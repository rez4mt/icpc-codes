package com.Judges.CodeForce.CF451;

import java.util.Arrays;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] a = new int[l],b = new int[l];
        for(int i = 0 ; i < l ; i ++)
        {
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        Arrays.sort(b);
        boolean sorted = true;
        for(int i = 0 ; i < l ; i++)
        {
            if(a[i] != b[i])
            {
                sorted = false;
                break;
            }
        }
        if(sorted)
        {
            System.out.println("yes\n1 1");
            return;
        }
        int right=-1,left=-1;
        for(int i = 0 ; i < l ; i ++)
        {
            if(a[i]!=b[i])
                right = i;
        }

        for(int i = l-1;i>=0;i--)
        {
            if(a[i]!=b[i])
                left=i;
        }
        int temp = 0;
        //System.out.println(Arrays.toString(b));

        //System.out.println(Arrays.toString(a));
        for(int i = left,j=right;i<j;i++,j--)
        {
            //System.out.printf("%d %d\n",i,j);
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;

        }
        //System.out.println(Arrays.toString(a));
        for(int i = 0 ; i < l ;i++)
        {
            if(a[i]!=b[i])
            {
                System.out.println("no");
                return;
            }
        }
        System.out.printf("yes\n%d %d\n",left+1,right+1);
    }

}
