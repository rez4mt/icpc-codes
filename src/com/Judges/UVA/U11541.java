package com.Judges.UVA;

import java.util.Scanner;

public class U11541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =sc.nextInt();
        String word,word_count,line,w;
        String sent;
        sc.nextLine();
        for(int i = 0 ; i < n ; i++)
        {
            line = sc.nextLine();
            word_count = "0";
            word = "";
            sent = "";
            for(int j = 0 ; j < line.length();j++)
            {
                w = line.substring(j,j+1).toLowerCase();
                if(w.compareTo("a")>=0 && w.compareTo("z")<=0 )
                {
                    if(word.length() == 1)
                    {
                        for(int k = 0 ; k < Integer.parseInt(word_count);k++)
                        {
                            sent += word;
                        }
                    }
                    word = line.substring(j,j+1);
                    word_count = "0";
                    continue;
                }
                word_count += w;
            }
            for(int k = 0 ; k < Integer.parseInt(word_count);k++)
            {
                sent += word;
            }
            System.out.printf("Case %d: %s\n",i+1,sent);
        }
    }
}
