package com.Judges.UVA;

import java.util.Scanner;

public class U272 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean quoted = false;
        String t ;
        StringBuilder b = new StringBuilder();
        while (sc.hasNext())
        {
            t = sc.nextLine();
            for(int i = 0 ; i < t.length() ; i ++)
            {
                if(t.substring(i,i+1).equals("\""))
                {
                    if(quoted)
                        b.append("''");
                    else
                        b.append("``");

                    quoted = !quoted;
                    continue;
                }

                b.append(t.substring(i,i+1));
            }
            b.append("\n");
        }
        System.out.print(b.toString());
    }
}
