package com.Judges.UVA;

import java.util.Scanner;
public class U391 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean star = false;
        while (sc.hasNext())
        {

            String line = sc.next();
            for(int i = 0 ; i < line.length(); i++)
            {
                if(line.charAt(i) == '\\' && i + 1 < line.length()) {
                    i++;

                    switch (line.charAt(i)) {
                        case 's':

                            i++;
                            if(star)
                            {
                                System.out.println(line.charAt(i));
                                continue;
                            }
                            while (i < line.length() && (line.charAt(i) == '0' || line.charAt(i) == '.' || (Character.isDigit(line.charAt(i)))))
                                i++;
                            i--;
                            break;
                        case '*':
                            star = !star;
                            break;
                        case '\\':
                            if (star)
                                System.out.print("\\\\");
                            break;
                        case 'i':
                            if (star)
                                System.out.print("\\i");
                            break;
                        case 'b':
                            if (star)
                                System.out.print("\\b");
                            break;

                    }
                }else if(Character.isSpaceChar(line.charAt(i))){
                    System.out.print(" ");
                } else System.out.print(line.charAt(i));
            }
        }
    }
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            String line  = sc.nextLine();
            if(line.length() == 1)
            {
                System.out.println(line);
                continue;
            }

            StringBuilder b = new StringBuilder();
            boolean star = false;
            for(int pos = 0 ; pos < line.length() ;)
            {
                String part = line.substring(pos,pos+1);
                if(!part.equals("\\"))
                {
                    b.append(part);
                    pos++;
                    continue;
                }

                pos++;
                part = line.substring(pos,pos+1);
                switch (part)
                {
                    case "\\":
                        b.append("\\");
                        pos++;
                        break;
                    case "i":
                    case "b":
                        pos++;
                        break;
                    case "s":
                        pos++;
                        if(pos>=line.length())
                            continue;
                        while (line.substring(pos,pos+1).equals("0") || line.substring(pos,pos+1).equals(".") || (line.substring(pos,pos+1).compareTo("1")>=0 && line.substring(pos,pos+1).compareTo("9")<=0))
                            pos++;
                        break;
                    case "*":
                        star = true;
                        pos++;
                        for(int i = pos;i<line.length()-1;i++)
                        {
                            if(line.substring(i,i+1).equals("\\") && line.substring(i+1,i+2).equals("*"))
                            {
                                pos +=2;
                                break;
                            }
                            b.append(line.substring(i,i+1));
                            pos++;
                        }
                        break;
                }
            }
            System.out.println(b.toString());

        }
    }*/

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a ,t;

        StringBuilder builder;
        boolean star = false;
        while(sc.hasNext())
        {
            star = false;
            a = sc.nextLine();
            if(a.length() == 1)
            {
                System.out.println(a);
                continue;
            }
            builder = new StringBuilder();
            for(int i = 0 ; i < a.length();i++)
            {
                t = a.substring(i,i+1);
                if(t.equals("\\"))
                {

                    switch (a.substring(i+1,i+2))
                    {
                        case "\\":
                            builder.append("\\");
                            i++;
                            continue;
                        case "i":
                        case "b":
                            i++;
                            continue;
                        case "s":
                            i+=2;
                            while (a.substring(i,i+1).equals("0") || (a.substring(i,i+1).compareTo("1")>=0 && a.substring(i,i+1).compareTo("9")<=0))
                                i++;
                            if(a.substring(i,i+1).equals("."))
                            {
                                i++;
                                while (a.substring(i,i+1).equals("0") || (a.substring(i,i+1).compareTo("1")>=0 && a.substring(i,i+1).compareTo("9")<=0))
                                    i++;
                            }
                            i--;
                            continue;
                        case "*":
                            i+=2;
                            star = true;

                            for(int j = i;j < a.length();j++)
                            {
                                if(a.substring(j,j+1).equals("\\") && a.substring(j+1,j+2).equals("*"))
                                {
                                    star = false;
                                    i = j+1;
                                    break;
                                }
                                builder.append(a.substring(j,j+1));

                            }
                            continue;
                    }
                }
                builder.append(t);
            }
            System.out.println(builder.toString());
        }

    }
*/
}
