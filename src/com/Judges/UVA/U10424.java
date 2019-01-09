package com.Judges.UVA;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class U10424 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[2];
        int[] sum ;
        String[] ss;
        while (sc.hasNext())
        {
            names[0] = getStr(sc.nextLine()).toLowerCase();
            names[1] = getStr(sc.nextLine()).toLowerCase();
            sum = new int[2];
            ss = new String[2];
            for(int i = 0 ; i < 2 ; i ++)
            {
                for(int j = 0 ; j < names[i].length() ; j ++)
                {
                    sum[i] += names[i].charAt(j)-96;
                }
                ss[i] = String.valueOf(sum[i]);
                while (ss[i].length()!=1)
                {
                    sum[i] = 0;
                    for(int k = 0 ; k < ss[i].length();k++)
                    {
                        sum[i] += Integer.parseInt(String.valueOf(ss[i].charAt(k)));
                    }
                    ss[i] = String.valueOf(sum[i]);
                }
            }
            double v = ((double) sum[0]/(double) sum[1])*100;
            if(v!=100 && v>100)
                v = ((double) sum[1]/(double) sum[0])*100;
            System.out.printf("%.2f %%\n",v);

        }

    }

    private static String getStr(String a)
    {
        StringBuilder b = new StringBuilder();
        Pattern p = Pattern.compile("[a-zA-Z]+");
        Matcher m = p.matcher(a);
        while (m.find())
        {
            b.append(m.group(0));
        }
        return b.toString();
    }
}
