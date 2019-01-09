package com.Judges.UVA;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class U11988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<StringBuilder> list;
        while (sc.hasNext())
        {
            list = new LinkedList<>();
            StringBuilder b = new StringBuilder();
            char[] data = sc.nextLine().toCharArray();
            boolean home = false;
            for (char c :
                    data) {
                if(c=='[')
                {
                    if(home)
                        list.addFirst(b);
                    else list.addLast(b);
                    b = new StringBuilder();
                    home = true;
                }else if (c == ']')
                {
                    if(home)
                    {
                        list.addFirst(b);
                    }else
                    {
                        list.addLast(b);
                    }
                    home = false;
                    b = new StringBuilder();
                }else b.append(c);

            }
            if(home)
            {
                list.addFirst(b);
            }else
            {
                list.addLast(b);
            }
            StringBuilder last = new StringBuilder();
            for (StringBuilder bu :
                    list) {
                last.append(bu);
            }
            System.out.println(last);
        }
    }
}
