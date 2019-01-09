package com.Judges.uri;

import java.util.Scanner;

public class P1118 {
    public P1118()
    {
        int c = 0;
        float a;
        int inp;
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        main :
        while (true)
        {
            sum =0;
            c = 0;
            while (c < 2)
            {
                a = sc.nextFloat();
                if(a>=0 && a<=10)
                {
                    sum+=a;
                    c++;
                    continue;
                }

                System.out.println("nota invalida");
            }
            System.out.printf("media = %.2f\n",sum/2);
            while (true)
            {
                System.out.println("novo calculo (1-sim 2-nao)");
                inp = sc.nextInt();
                if(inp == 1 || inp == 2)
                    if(inp == 1)
                        break ;
                    else break main;;

            }

        }

    }

    public static void main(String[] args) {
        new P1118();
    }
}
