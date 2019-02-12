package com.Judges.UVA;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class U10336 {
    static boolean[][] checked ;
    static char[][] mat;
    static HashMap<Character,Integer> counts;
    static int[][] moves = new int[][]{{0,-1},{-1,0},{1,0},{0,1}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int k = 0 ; k < T ; k++)
        {
            System.out.printf("World #%d\n",k+1);
            String[] sizes = br.readLine().split(" ");
            int x = Integer.parseInt(sizes[0]);
            int y = Integer.parseInt(sizes[1]);
            mat = new char[x][y];
            checked = new boolean[x][y];
            counts = new HashMap<>();
            for(int i = 0 ; i < x ; i++)
            {
                String line = br.readLine();
                for(int j = 0 ; j < y ; j++)
                {
                    mat[i][j] = line.charAt(j);
                    counts.putIfAbsent(mat[i][j],0);
                }
            }
            for(int i = 0 ; i < x ; i ++)
            {
                for(int j = 0 ; j < y ; j++)
                {
                    if(!checked[i][j])
                    {
                        dfs(i,j);
                        counts.put(mat[i][j],counts.get(mat[i][j])+1);
                    }
                }
            }
            Lang[] l =new Lang[counts.size()];
            int i = 0;
            for (Map.Entry<Character,Integer> e : counts.entrySet())
            {
                l[i++] = new Lang(e.getKey(),e.getValue());
            }
            Arrays.sort(l);
            for(int ii = 0 ; ii<l.length;ii++)
            {
                System.out.printf("%s: %d\n",l[ii].lang,l[ii].count);
            }

        }
    }
    static void dfs(int i , int j)
    {
        checked[i][j] = true;
        for (int[] m : moves)
        {
            if(i+m[0] < 0 || i+m[0] >= checked.length)
                continue;
            if(j+m[1] < 0 || j+m[1] >= checked[0].length)
                continue;
            if(checked[i+m[0]][j+m[1]])
                continue;
            if(mat[i][j] == mat[i+m[0]][j+m[1]])
                dfs(i+m[0],j+m[1]);

        }
    }
    static class Lang implements Comparable<Lang>{
        char lang = ' ';
        int count = 0;

        @Override
        public int compareTo(Lang o) {
            if(count == o.count)
            {
                return   Character.compare(lang,o.lang);
            }
            return - Integer.compare(count,o.count);
        }

        public Lang(char c,int co)
        {
            count = co;
            lang = c;

        }
    }
}
