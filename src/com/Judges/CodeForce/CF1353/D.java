package com.Judges.CodeForce. CF1353;
import java.util.*;
public class D {
    static int current = 1;
    static int[] ans ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        ans = new int[100005];
        while (T-->0)
        {
            int n = sc.nextInt();
            current = 1;
            for(int i = 0 ; i <=n ; i++)
                ans[i] = 0;
            setAns(1, n , false);
            setAns(1, n , true);
            for(int i = 1 ;i <= n ; i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }

    static void setAns(int l , int r,boolean deeper )
    {
        if(l>r)
            return ;
        else if(l==r)
        {
            if(ans[r]==0)
            ans[r] = current++;
            return;
        }
        int mid = 0;
        if((r-l+1)%2==1)
            mid = (l+r)/2;
        else
            mid = (l+r-1)/2;

        if(!deeper)
        {
            if(ans[mid]!=0)
                return;
            ans[mid] = current++;
        }else {
            if(Math.abs(r-(mid+1)) > Math.abs(l-(mid-1)))
            {
                setAns(mid+1,r , false);
                setAns(l,mid-1 , false);
                if(Math.abs(r-(mid+1)) - Math.abs(l-(mid-1)) == 1)
                {
                    setAns(l,mid-1 , true);
                    setAns(mid+1,r , true);
                }

            }else
            {
                setAns(l,mid-1 , false);
                setAns(mid+1,r , false);
                if(Math.abs(r-(mid+1)) - Math.abs(l-(mid-1)) >= 1)
                {
                    setAns(mid+1,r , true);
                    setAns(l,mid-1 , true);
                }else
                {
                    setAns(l,mid-1 , true);
                    setAns(mid+1,r , true);
                }


            }
        }

    }

}
