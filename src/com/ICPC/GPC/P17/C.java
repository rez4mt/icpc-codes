package com.ICPC.GPC.P17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C {
    static ArrayList<Integer> indexes;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int TT = 1;
        while (T-->0)
        {
            System.out.printf("Table %d\n",TT++);
            int C,R,K;
            C = sc.nextInt();
            R = sc.nextInt();
            K = sc.nextInt();
            sc.nextLine();
            Info[] list = new Info[R];
            for(int i = 0 ; i < R ; i++)
                list[i] = new Info(i,C,sc.nextLine());

            for(int i = 0 ; i < K ; i++)
            {
                //sorting order
                System.out.printf("Instruction %d\n",i+1);
                indexes = new ArrayList<>();
                int in ;
                while ((in = sc.nextInt())!=0)
                    indexes.add(in);
                Arrays.sort(list);
                for(int j = 0 ; j < R;j++)
                    System.out.println(list[j].toString());

            }
        }
    }
    static class Info implements Comparable<Info>
    {
        int id;
        String data ;
        Object[] cols;
        @Override
        public int compareTo(Info o) {
            for(int i = 0 ; i < indexes.size();i++)
            {
                int index_id = indexes.get(i);
                int mul = index_id<0?-1:1;
                index_id = Math.abs(index_id)-1;
                int compareVal ;
                if(cols[index_id] instanceof Double)
                {
                    compareVal = Double.compare((Double) cols[index_id],(Double)o.cols[index_id]);

                }else
                {
                    compareVal = ((String)cols[index_id]).compareTo((String)o.cols[index_id]);
                }
                if(compareVal!=0)
                    return mul*compareVal;
            }
            return Integer.compare(id,o.id);
        }

        public Info(int id,int C,String data)
        {
            this.data = data;
            this.id = id;
            cols = new Object[C];
            StringTokenizer st = new StringTokenizer(data);
            for(int i = 0 ; i < C ; i++)
                set(i,st.nextToken());

        }
        private void set(int index,String data)
        {
            if(isDouble(data))
            {
                cols[index] = Double.parseDouble(data);
            }else
            {
                cols[index] = data;
            }
        }
        private boolean isDouble(String d)
        {
            for(int i = 0 ; i < d.length();i++)
            {
                char c = d.charAt(i);
                if(Character.isAlphabetic(c))
                    return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return data;
        }
    }
}
