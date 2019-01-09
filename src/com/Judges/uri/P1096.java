package com.Judges.uri;

public class P1096 {
    public P1096()
    {
        for(int i = 1 ; i < 10;i+=2)
        {
            for(int j = 7 ; j >4 ; j--)
            {
                System.out.printf("I=%d J=%d\n",i,j);
            }
        }
    }

    public static void main(String[] args) {
        new P1096();
    }
}
