package com.Judges.uri;

public class P1155 {
    public P1155()
    {
        double s = 0;
        for(int i = 1 ; i <=100;i++)
        {
            s += 1.0/i;
        }
        System.out.printf("%.2f\n",s);
    }

    public static void main(String[] args) {
        new P1155();
    }
}
