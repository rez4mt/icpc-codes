package com.Judges.uri;

public class P1156 {
    public static void main(String[] args) {
        new P1156();
    }
    public P1156() {
        //System.out.println("6.00"); :))))))))))))))
        double s = 0;
        int f = 1;
        for (double i = 1.0; i <= 39.0; i += 2.0)
        {
            s += i/f;
            f *= 2;
        }
        System.out.printf("%.2f\n",s);
    }
}
