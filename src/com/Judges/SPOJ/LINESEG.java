package com.Judges.SPOJ;

import java.awt.geom.Line2D;

public class LINESEG {
    public static void main(String[] args) {
        Line2D a = new Line2D.Double(0,0,0,10);
        Line2D b = new Line2D.Double(0,0,0,0);
        System.out.println(a.intersectsLine(b));


    }
}
