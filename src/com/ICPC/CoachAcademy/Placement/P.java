package com.ICPC.CoachAcademy.Placement;

import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] inv = new int[3];
        for(int i = 0 ; i < 3 ; i++)
            inv[i] = sc.nextInt();
        int[] price = new int[3];
        for(int i = 0 ; i < 3 ; i++)
            price[i] = sc.nextInt();
        long m = sc.nextLong();
        int[] cost = new int[3];
        for(int i = 0 ; i < s.length(); i++)
        {
            if(s.charAt(i) == 'B')
             cost[0]++;
            else if(s.charAt(i) == 'S')
                cost[1]++;
            else if(s.charAt(i) == 'C')
                cost[2]++;
        }
        long ans = 0 ;
        int min = Integer.MAX_VALUE ;
        for(int i = 0 ; i < 3 ; i++)
        {
            if(cost[i] == 0)
                continue;

            min = Math.min(inv[i]/cost[i],min);
        }
        ans = min;
        for(int i = 0 ; i < 3 ; i++)
            inv[i] -= cost[i]*min;
        int max = 0 ;
        for(int i = 0 ; i < 3; i++)
        {
            if(cost[i] == 0)
                continue;
            max = Math.max(max , (int)Math.ceil(1d*inv[i]/cost[i]));
        }
        for(int i = 0 ; i < max ; i++)
        {
            //buy and make until ur money is zero
            long currentp = 0 ;
            for(int j = 0 ; j < 3; j++)
            {
                currentp+= (inv[j]>=cost[j]?0:cost[j]-inv[j])*1L*price[j];
            }
            if(currentp>m)
                break;
            m -= currentp;
            ans++;
            for(int j = 0 ; j < 3; j++)
            {
                inv[j]-= cost[j];
                if(inv[j]<0)
                    inv[j] = 0 ;
            }
        }
        long x=  0 ;
        for(int i = 0 ; i < 3; i++)
        {
            x += cost[i]*1l*price[i];

        }
        ans+= m / x;
        System.out.println(ans);

    }

}
