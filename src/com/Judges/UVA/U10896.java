package com.Judges.UVA;

import java.util.*;

public class U10896 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-->0)
        {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            String t = sc.nextLine();
            int sum = 0 ;
            for(int i = 0 ; i < t.length() ;i++)
                sum+=t.charAt(i);
            while(st.hasMoreTokens())
            {
                String token = st.nextToken();
                if(token.length() == t.length())
                {
                    int sec_sum = 0;
                    for(int i = 0 ; i < t.length() ;i++)
                        sec_sum+=token.charAt(i);
                    int mv =Math.abs( sum - sec_sum)/t.length() ;
                    if((t.charAt(0)+mv)%26 == token.charAt(0))
                    {
                        System.out.println((char)('a'+mv));
                        break;
                    }
                }
            }
        }
    }
}
