package com.Judges.uri;

public class P1097 {
    public static void main(String[] args) {
        new P1097();
    }
    public P1097()
    {
        for(int i = 1; i <10; i+=2)
        {
            for(int j = 1 ; j <4; j ++)
            {
                System.out.printf("I=%d J=%d\n",i,i+7-j);
            }
        }
        
    }
}
