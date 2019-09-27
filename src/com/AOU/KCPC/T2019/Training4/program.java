package com.AOU.KCPC.T2019.Training4;

import java.io.File;
import java.util.Scanner;

public class program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("fractions.in"));
        //Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T-->0)
        {
            String s = sc.nextLine();
            if(s.isEmpty())
            {
                System.out.println();
                continue;
            }

            StringBuilder b = new StringBuilder();
            int cm_location = -1;

            if(s.length() == 1)
            {
                System.out.println(s);
                continue;
            }

            for(int i = 1 ; i < s.length() ; i++)
            {
                if(s.charAt(i) == '/' && s.charAt(i-1)=='/')
                {
                    cm_location = i;
                    break;
                }

            }
            if(cm_location == -1)
            {
                System.out.println(s.replace("->","."));
            }else{
                String news = s.substring(0,cm_location);
                b.append(news.replace("->","."));
                b.append(s.substring(cm_location,s.length()));
                System.out.println(b);
            }
            /*if(!may_cnt)
                b.append(s.charAt(0));
            for(int i = 1 ; i < s.length();i++)
            {
                if(cm)
                {
                    b.append(s.charAt(i));
                }else
                {
                    if(may_cnt)
                    {

                        if(s.charAt(i) == '>')
                        {

                            may_cnt = false;
                            b.append('.');
                        }
                        else if(s.charAt(i) == '-') {
                            b.append('-');
                            may_cm = false;
                        }else if(s.charAt(i) == '/')
                        {
                            may_cm = true;
                            may_cnt = false;
                            b.append('-');
                            b.append('/');
                        }else{
                            may_cnt = false;
                            b.append("-");

                            b.append(s.charAt(i));
                        }

                        continue;
                    }else if(may_cm)
                    {
                        if(s.charAt(i) == '/')
                            cm = true;
                        b.append(s.charAt(i));
                        continue;
                    }
                    if(s.charAt(i) == '-')
                    {
                        may_cnt = true;

                        continue;
                    }else if(s.charAt(i) == '/')
                    {
                        may_cm = true;
                    }
                    b.append(s.charAt(i));
                }
            }
            if(!cm)
            {
                if(may_cnt)
                    b.append("-");
            }*/
        }
    }
}
