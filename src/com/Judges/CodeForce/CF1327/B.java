package com.Judges.CodeForce.CF1327;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n = sc.nextInt();
            boolean[] visited = new boolean[n];
            TreeSet<Integer>[] list = new TreeSet[n];
            TreeSet<Integer> notchosen = new TreeSet<>();

            TreeSet<Integer> remQ = new TreeSet<>();
            for(int i = 0 ; i < n ; i++)
            {
                notchosen.add(i);
                list[i] = new TreeSet<>();
            }
            for(int i = 0 ; i < n ;i++)
            {
                int k = sc.nextInt();
                while (k-->0)
                    list[i].add(sc.nextInt()-1);
            }
            for(int i = 0 ; i < n ; i++)
            {
                boolean flag = false;
                //if not chosen..
                for (Integer king :
                        list[i]) {
                    if(!visited[king])
                    {
                        notchosen.remove(king);
                        flag = true;
                        visited[king] = true;
                        break;
                    }
                }
                if(!flag)
                    remQ.add(i);
            }
            if(notchosen.size() == 0)
                System.out.println("OPTIMAL");
            else
            {
                StringBuilder sb = new StringBuilder();
                System.out.println("IMPROVE");
                for (int q :
                        remQ) {
                    sb.append((q+1) + " "+(notchosen.pollFirst()+1));
                    sb.append("\n");
                    break;
                }
                System.out.print(sb);
            }

        }
    }
}