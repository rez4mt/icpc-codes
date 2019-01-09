package com.Judges.UVA;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.Scanner;

public class U191 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] lstart = new int[2];
        int[] lend = new int[2];
        int[] lt = new int[2],rb = new int[2];
        for(int i = 0 ; i < t ; i++)
        {
            lstart[0] = sc.nextInt();
            lstart[1] = sc.nextInt();
            lend[0] = sc.nextInt();
            lend[1] = sc.nextInt();
            lt[0] = sc.nextInt();
            lt[1] = sc.nextInt();
            rb[0] = sc.nextInt();
            rb[1] = sc.nextInt();
            Line2D line = new Line2D.Double();
            line.setLine(lstart[0],lstart[1],lend[0],lend[1]);
            Rectangle2D rectangle2d = new Rectangle();
            rectangle2d.setFrameFromDiagonal(lt[0],lt[1],rb[0],rb[1]);
            if(rectangle2d.intersectsLine(line))
                System.out.println("T");
            else System.out.println("F");
        }
    }
}
