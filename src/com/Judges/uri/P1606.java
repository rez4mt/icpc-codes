package com.Judges.uri;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class P1606 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext())
        {
            StringBuilder b = new StringBuilder();
            HashSet<Integer> vals = new HashSet<>();
            int n = sc.nextInt();
            int k = sc.nextInt();
            for(int i = 0 ; i < n ; i++)
            {
                int v = sc.nextInt();
                if(!vals.contains(v))
                {
                    b.append(v+" ");
                    vals.add(v);
                }
            }
            System.out.println(b.deleteCharAt(b.length()-1));

        }
    }
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int n =sc.nextInt(), k = sc.nextInt();
            int[] mat = new int[n];
            for(int i = 0 ; i < n ; i++)
                mat[i] = sc.nextInt();
            int seg = n-k;
            boolean mirror = false;
            int pos = 0;
            int[] finalMat = new int[k];
            for(int i = 0; i < n-seg ; i++)
            {
                if(mat[i+1] == mat[i])
                {
                    pos = i;
                    mirror = true;
                    break;
                }else if(mat[i+seg] == mat[i])
                {
                    pos = i;
                    break;
                }

                finalMat[i] = mat[i];
            }
            if(mirror)
            {
                for (int i = pos; i < pos+seg -1; i++) {
                    finalMat[i] = mat[i];
                }
                for(int i = pos+seg+1;i<mat.length;i++)
                {
                    finalMat[i-seg] = mat[i];
                }


            }else
            {
                for(int i = pos;i<pos+seg;i++)
                {
                    finalMat[i] = mat[i];
                }
                for(int i = pos+seg+1;i<mat.length;i++)
                {
                    finalMat[i-seg] = mat[i];
                }
            }

            print(finalMat);
        }
    }
*/

    static void print(int[] m)
    {
        StringBuilder b = new StringBuilder();
        for(int i = 0 ; i< m.length;i++)
            b.append(m[i]+" ");
        b.deleteCharAt(b.length()-1);
        System.out.println(b);
    }
}
