package com.Judges.UVA;

import java.util.Arrays;
import java.util.Scanner;

public class U10800 {
    private static int min_y = 0,max_y = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int xlen,ylen,current_y;
        String d ;
        String[][] graph ;
        for(int i = 0 ; i<n;i++)
        {
            d = sc.next();
            calculate(d);
            xlen = d.length()+1;
            ylen = max_y-min_y+1;
            current_y = 1;
            graph = new String[ylen][xlen];
            clear(graph);
            //use max y as start point;
            current_y = max_y;
            boolean was_r = false;
            System.out.printf("max %d, min %d,x %d \n",max_y,min_y,current_y);
            graph[current_y][0]= "-";

            for(int x = 0 ; x < d.length();x++)
            {
                switch (d.substring(x,x+1))
                {
                    case "R":
                        was_r = true;
                        graph[current_y][x] = "/";
                        current_y--;
                        break;
                    case "F":
                        graph[was_r?++current_y:current_y++][x] = "\\";
                        break;
                    case "C":
                        graph[current_y][x] = "_";
                        break;
                }


            }

            print(graph);


        }
    }
    static void clear(String[][] graph)
    {
        for(int i = 0 ; i< graph.length;i++)
        {
            for(int j = 0 ; j < graph[0].length;j++)
            {
                graph[i][j] = " ";
            }
        }
    }
    static void calculate(String data)
    {

        int sum = 0;
        for(int i = 0 ; i < data.length();i++)
        {
            switch (data.substring(i,i+1))
            {
                case "F":
                    sum--;
                    break;
                case "R":
                    sum++;
                    break;
            }
            min_y = Math.min(min_y,sum);
            max_y = Math.max(max_y,sum);
        }
    }
    static void print(String[][] graph)
    {
        System.out.println("=================================");
        for(int i = 0 ; i < graph.length;i++)
        {
            StringBuilder b = new StringBuilder();
            System.out.print("|");
            for(int j = 0 ; j < graph[0].length;j++)
            {
                b.append(graph[i][j].isEmpty()?" ":graph[i][j]);
            }
            System.out.println(b.toString());

        }
        System.out.print("+");
        for(int i = 0 ; i < graph[0].length;i++)
        System.out.print("-");
        System.out.println();
    }
}
