//package com.AOU.KCPC.T2019.Training2;

import java.io.File;
import java.lang.reflect.Array;
import java.util.*;

public class distinguished {
    static HashMap<Character,Character> reversable;
    public static void main(String[] args) throws Exception{
        //Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<Integer>();
        int c = 0;
        for (int i = 1; i <= 100000; i++) {
            if ( x(i) ) {
                arr.add(i);
            }
        }
        Scanner sc = new Scanner(new File("distinguished.in"));
        reversable = new HashMap<>();
        reversable.put('6','9');
        reversable.put('9','6');
        reversable.put('8','8');
        reversable.put('0','0');
        int T = sc.nextInt();
        while (T-->0)
        {
            int sum = 0;
            int start = sc.nextInt();
            int end = sc.nextInt();
            for(int num : arr)
            {
                if(num<start)
                    continue;
                if(num>end)
                    break;
                if(reversable(num))
                {
                    //System.out.println(num);
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }

    private static boolean x(int i) {
        String s = i + "";
        if (s.contains("2") ||
                s.contains("1") ||
        s.contains("3") ||
                s.contains("4") ||
                s.contains("5") ||
                s.contains("7")
        ) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean reversable(int N)
    {

        char[] s = (N+"").toCharArray();

        for(int i = 0 ; i < s.length ; i++)
        {
            if(!reversable.containsKey(s[i]))
                return false;
            if((reversable.get(s[i])!= s[s.length - 1 - i]))
            {
                return false;
            }
        }

        return true;
    }
}
