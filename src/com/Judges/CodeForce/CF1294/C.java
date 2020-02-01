package com.Judges.CodeForce.CF1294;
import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T  = sc.nextInt();

        //make(T);;
        while (T-->0)
        {
            int N = sc.nextInt();
            HashSet<Long> values = new HashSet<>();
            values.add(1l);
            long current_i = 1 ;
            int sqrt = (int)Math.sqrt(N);
            for(int i = 2 ; i <= sqrt && values.size()<3; i++)
            {
                while (N>0 && N%i==0 && values.size()<3)
                {
                    if(!values.contains(current_i))
                    {
                        values.add(current_i);
                        current_i = 1;
                    }else {
                        current_i*=i;
                        N/=i;
                    }
                }
            }
            if(!values.contains(current_i))
                values.add(current_i);
            if(N > 1)
                values.add((long)N);
            values.remove(1l);

            if(values.size()<3)
            {
                System.out.println("NO");
            }else {
                TreeSet<Long> set = new TreeSet<>(values);
                while(set.size()>3)
                {
                    set.add(set.pollLast()*set.pollLast());
                }

                StringBuilder bw = new StringBuilder();
                System.out.println("YES");
                for (long a :
                        set) {
                    bw.append(a+" ");
                }
                bw.deleteCharAt(bw.length()-1);
                System.out.println(bw);
            }
        }
    }
    private static boolean bf(int a)
    {
        for(int i = 2  ; i < a ;i++)
        {
            for(int j = i+1 ; j < a ;j++)
            {

                int ab = i*j;
                int dev = a/ab;
                if(a%ab==0 && dev!=i && dev>j)
                {
                    return true;
                }

            }
        }
        return false;
    }

}