package com.Judges.CodeForce.Contents.R529D3;

import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long fist_num = a;
        long b = sc.nextInt();
        StringBuilder builder = new StringBuilder();
        if(b>a)
        {
            System.out.println("NO");
            return;
        }
        if(a/b == 1)
        {
            System.out.println("YES");
            while(a-->0)
            {
                builder.append("1 ");
            }
            System.out.println(builder);
            return;
        }
        if(a%b==0 && Long.highestOneBit(a/b) == a/b)
        {
            int t =(int) (a/b);
            System.out.println("YES");
            while (b-->0)
            {
                builder.append(t);
                builder.append(" ");
            }
            System.out.println(builder);
            return;

        }

        ArrayList<Long> list = new ArrayList<Long>();

        long current = Long.highestOneBit(a);
        list.add(0,current);
        a -= current;

        while ((current = Long.highestOneBit(a))!=a)
        {
            list.add(list.size(),current);
            a -= current;
        }
        //check if sum is not a something is wrong;
        long sum =0;
        if(current!=0)
            list.add(list.size(),a);
        if(list.size()>b)
        {
            System.out.println("NO");
            return;
        }
        for (long m :
                list) {
            sum+=m;
        }
        if(sum!=fist_num)
        {
            System.out.println("NO");
            return;
        }
        long size = list.size();
        while (size < b)
        {
            Collections.sort(list);
            long temp = list.get(list.size()-1);
            if(temp==1)
            {
                System.out.println("NO");
                return;
            }
            list.remove(list.size()-1);
            list.add(temp/2);
            list.add(temp/2);
            size++;
        }
        Collections.sort(list);

        System.out.println("YES");
        for (long M
                :list){
            builder.append(M+" ");
        }
        System.out.println(builder);

    }
}
