package com.Judges.UVA;

import java.util.Arrays;
import java.util.Scanner;

public class U12405 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int C = 1;
        while (T-->0)
        {
            int count = 0;
            int N = sc.nextInt();
            char[] list = sc.next().toCharArray();
            for(int i = 0 ; i < N ; i++)
            {
                if(list[i] == '#')
                    continue;
                if(list[i] == '.'){
                    if(i+1 < N)
                    {
                        if(list[i+1] == '.')
                        {
                            count++;
                            list[i+1] = '|';
                            list[i] = '"';
                        }else if(list[i+1] == '#')
                        {
                            count++;
                            list[i] = '|';
                            list[i+1] = '|';
                        }
                    }else
                    {
                        count++;
                        list[i] = '|';
                    }

                }else if(list[i] == '|')
                {
                    if(i+1 < N)
                    {
                        list[i+1] = '"';
                    }
                }
            }
            System.out.printf("Case %d: %d\n",C++,count);

        }
    }
}
