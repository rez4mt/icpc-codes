package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class U445 {
    static int pos = 0;
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true)
            {
                String line = br.readLine();
                pos = 0;
                StringBuilder b = new StringBuilder();
                if(line == null)
                    break;
                BigInteger number = BigInteger.ZERO;
                for(int i = 0 ; i < line.length() ; i++)
                {
                    char c = line.charAt(i);
                    if(c=='b')
                    {
                        for(BigInteger j = BigInteger.ZERO; j.compareTo(number) < 0 ; j = j.add(BigInteger.ONE))
                            b.append(' ');
                    }else if(c == '!')
                    {
                        b.append("\r\n");
                    }else
                    {
                        if(Character.isDigit(c))
                        {
                            number = number.multiply(BigInteger.TEN).add(BigInteger.valueOf(Character.digit(c,10)));
                        }else
                        {
                            for(BigInteger j = BigInteger.ZERO; j.compareTo(number) < 0 ; j = j.add(BigInteger.ONE))
                                b.append(c);
                            number = BigInteger.ZERO;
                        }
                    }
                }
                /*while (pos<line.length())
                {
                    while (!isEnd(line))
                    {

                        BigInteger num = num(line);
                        char c = getChar(line);
                        if(c == 'b')
                        {
                            for(BigInteger i = BigInteger.ZERO; i.compareTo(num) < 0 ; i = i.add(BigInteger.ONE))
                                b.append(' ');
                        }else
                        {
                            for(BigInteger i = BigInteger.ZERO; i.compareTo(num) < 0 ; i = i.add(BigInteger.ONE))
                                b.append(c);
                        }
                    }
                    b.append("\r\n");
                }*/
                out.print(b.toString());
                if(line.isEmpty() || line.charAt(line.length()-1) == '!' )
                    out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        out.flush();
        out.close();
    }

}
