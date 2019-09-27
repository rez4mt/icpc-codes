//package com.AOU.KCPC.T2019.Training2;

import java.io.File;
import java.util.Scanner;

public class ferrari {
    public static void main(String[] args) throws Exception{
        Scanner sc =new Scanner(new File("ferrari.in"));
        //Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int t = sc.nextInt();
            long m = t*746 ;
            System.out.println(m);
        }
    }
}
