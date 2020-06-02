package com.Judges.CodeForce. CF1352;
import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-->0)
        {
            ArrayList<Integer> nums = new ArrayList<>();
            String s = sc.next();
            for(int i =  s.length()-1 ; i>=0 ; i--)
            {
                if(s.charAt(i)!='0')
                {
                    nums.add(
                            (int)((s.charAt(i)-'0') *Math.pow(10 , s.length()-1-i))
                    );
                }
            }
            System.out.println(nums.size());
            for (int n : nums) {
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
