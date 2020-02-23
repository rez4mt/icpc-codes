package com.ICPC.CoachAcademy.Placement;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class G {
    static long[] list = new long[500];
    static int count = 0 ;
    public static void main(String[] args) {
        generate(0,0,0);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //find it
        Arrays.sort(list , 0 , count+1);
        int idx = Arrays.binarySearch(list ,0,count+1, n);
        if(idx< 0)
            idx = (-idx)-1;
        System.out.println(list[idx]);

    }

    static void generate(int fours , long sevens , long num)
    {
        if(num>10e10)
            return;
        if(num!=0 && fours == sevens)
            list[count++] = num;
        generate(fours+1  , sevens , (num*10 )+ 4);
        generate(fours , sevens +1 , (num*10)+7);
    }
}
