package com.Judges.uri;

import java.util.Scanner;

public class P1828 {
    public static void main(String[] args) {
        new P1828();
    }


    public P1828()
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        String shel,raj;
        int w ;
        for(int i = 0 ; i<l ; i++)
        {
            shel = sc.next();
            raj = sc.next();
            w = 0;
            if(!shel.equals(raj))
            switch (shel)
            {
                case "pedra":
                    switch (raj)
                    {
                        case "lagarto":
                        case "tesoura":
                            w = 1;
                            break;
                            default:
                                w = 2;
                                break;
                    }
                    break;
                case "papel":
                    switch (raj)
                    {
                        case "pedra":
                        case "Spock":
                            w = 1;
                            break;
                        default:
                            w = 2;
                            break;
                    }
                    break;
                case "tesoura":
                    switch (raj)
                    {
                        case "papel":
                        case "lagarto":
                            w = 1;
                            break;
                        default:
                            w = 2;
                            break;
                    }
                    break;

                case "lagarto":
                    switch (raj)
                    {
                        case "Spock":
                        case "papel":
                            w = 1;
                            break;
                        default:
                            w = 2;
                    }
                    break;

                case "Spock":
                    switch (raj)
                    {
                        case "pedra":
                        case "tesoura":
                            w = 1;
                            break;
                        default:
                            w = 2;
                    }
            }

            if(w == 0)
                System.out.printf("Caso #%d: De novo!\n",i+1);
            else if(w == 1)
                System.out.printf("Caso #%d: Bazinga!\n",i+1);
            else if(w == 2)
                System.out.printf("Caso #%d: Raj trapaceou!\n",i+1);
        }
    }

}
