package com.Judges.uri;

import java.util.Scanner;

public class P1048 {
    public P1048()
    {
        Scanner sc = new Scanner(System.in);
        double salary = Double.parseDouble(sc.next());
        double percentage =0;
        if(salary>= 0 && salary<=400)
        {
            percentage = .15;
        }else if(salary>= 400.01 && salary<=800)
        {
            percentage = .12;
        }else if(salary>= 800.01 && salary<=1200)
        {
            percentage = .10;
        }else if(salary>= 1200.01 && salary<=2000)
        {
            percentage = .07;
        }else if(salary>2000)
        {
            percentage = .04;
        }
        System.out.printf(
                "Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n"
                ,salary * (1+percentage),salary*percentage,(int)(percentage*100)
        );
    }

    public static void main(String[] args) {
        new P1048();
    }
}
