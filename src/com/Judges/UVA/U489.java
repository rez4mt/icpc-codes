package com.Judges.UVA;

import java.util.Scanner;

public class U489 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int a = sc.nextInt();
            if(a == -1)
                break;
            String main = sc.next();
            String guess = sc.next();
            int wrong = 0;
            System.out.printf("Round %d\n",a);
            for(int i = 0 ; i < guess.length() && !main.isEmpty() ; i++)
            {
                String c = Character.toString(guess.charAt(i));
                if(main.contains(c))
                {
                    main = main.replace(c,"") ;
                }else
                {
                    wrong++;
                    if(wrong == 7)
                        break;
                }
            }
            if(wrong == 7)
            {
                System.out.println("You lose.");
            }else if(wrong < 7)
            {
                if(main.isEmpty())
                {
                    System.out.println("You win.");
                }else
                {
                    System.out.println("You chickened out.");
                }
            }
        }
    }
}
