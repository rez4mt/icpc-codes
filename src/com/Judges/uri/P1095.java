package com.Judges.uri;

public class P1095 {
    public P1095()
    {
        int j = 60, i = 1;
        while(j>=0)
        {
            System.out.printf("I=%d J=%d\n",i,j);
            i+=3;
            j-=5;

        }
    }

    public static void main(String[] args) {
        new P1095();
    }
}
