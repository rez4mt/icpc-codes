package com.Judges.UVA;

import java.util.Scanner;
import java.util.Stack;

public class U673 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder b = new StringBuilder();
        sc.nextLine();
        while (T-->0)
        {
            String line = sc.nextLine();
            if(check(line))
            {
                b.append("Yes\n");
            }else
            {
                b.append("No\n");
            }
        }
        //b.deleteCharAt(b.length()-1);

        System.out.print(b);

    }
    private static boolean check(String d)
    {
        char[] chars = d.toCharArray();
        Stack<Integer> stack = new Stack<Integer>();
        for(char c : chars)
        {
            switch (c)
            {
                case '(':
                    stack.push(0);
                    break;
                case '[':
                    stack.push(1);
                    break;
                case ')':
                    if(stack.isEmpty())
                        return false;
                    if(stack.pop()!=0)
                        return false;
                    break;
                case ']':

                    if(stack.isEmpty())
                        return false;

                    if(stack.pop()!=1)
                        return false;

                    break;
            }
        }
        return stack.isEmpty();
    }
}
