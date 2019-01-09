package com.Judges.uri;

public class P1098 {

    public P1098()
    {
        for(float i = 0,k=1 ; i <= 2.1; i += 0.2,k++)
        {
            for(int j = 1;j<4;j++)
            {
                if(k % 5 == 1)
                {
                    System.out.printf("I=%.0f J=%.0f\n",i,i+j);
                }else
                    System.out.printf("I=%.1f J=%.1f\n",i,i+j);
            }
        }
    }
    public static void main(String[] args) {
        new P1098();
    }
}
