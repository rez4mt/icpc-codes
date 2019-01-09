package com.Judges.UVA;

import java.util.Arrays;
import java.util.Scanner;

public class U11854 {
    public static void main(String[] args) {
        int[] ang;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt())
        {
            ang = new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt()};
            if(ang[0] == 0 && ang[1]==0 && ang[2]==0)
                break;
            Arrays.sort(ang);

            if((ang[0]*ang[0])+(ang[1]*ang[1]) == ang[2]*ang[2])
                System.out.println("right");
            else
                System.out.println("wrong");

        }
    }
}
