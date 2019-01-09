package com.Judges.uri;

import java.util.Scanner;

public class P1272 {
    public static void main(String[] args) {
        new P1272();
    }
    public P1272()
    {
        String s= "",fs,main = "" ;
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        boolean read = true;
        for(int i = 0 ; i < t;i++)
        {
            read = true;
            main = "";
            fs = sc.nextLine();
            for(int j = 0; j < fs.length() ; j ++)
            {
                s = fs.charAt(j)+"";
                if(!s.equals(" ") && read)
                {
                    read = false;
                    main +=s;
                }else if(s.equals(" "))
                    read = true;

            }
            System.out.printf("%s\n",main);
        }
    }
}
