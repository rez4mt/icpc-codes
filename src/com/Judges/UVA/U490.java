package com.Judges.UVA;

import java.util.Scanner;

public class U490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] sentences = new char[100][];
        int nums = 0;
        int maxLength = -1;
        while (sc.hasNext())
        {
            sentences[nums++] = sc.nextLine().toCharArray();
            maxLength = Math.max(sentences[nums-1].length,maxLength);
        }
        StringBuilder b = new StringBuilder();
        for(int i = 0 ; i < maxLength;i++)
        {
            for(int j = 0 ; j <nums;j++)
            {
                if(sentences[nums-1-j].length > i)
                {
                    b.append(sentences[nums-1-j][i]);
                }else
                    b.append(' ');
            }
            b.append("\n");
        }
        System.out.print(b.toString());
    }
}
