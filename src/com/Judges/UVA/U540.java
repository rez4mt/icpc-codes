package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class U540 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = 1;
        while (true)
        {
            int T = Integer.parseInt(br.readLine());
            HashMap<Integer,Integer> p = new HashMap<>();
            LinkedList<LinkedList<Integer>> teams = new LinkedList<>();
            LinkedList<Integer> queue = new LinkedList<>();

            if( T == 0 )
                break;

            System.out.printf("Scenario #%d\n",C++);


            for(int i = 0 ; i < T;i++)
            {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int count = Integer.parseInt(st.nextToken());
                int team_count = Integer.parseInt(st.nextToken());
                for(int j = 1 ; j < count ; j ++)
                    p.put(Integer.parseInt(st.nextToken()),i);
                teams.add(i,new LinkedList<>());
            }
            boolean running = true;
            while (running)
            {
                String s = br.readLine();
                switch (s)
                {

                    case "DEQUEUE":
                        while(queue.size() != 0 && teams.get(queue.get(0)).size() == 0) {
                            queue.removeFirst();
                        }
                        if(queue.size() != 0) {
                            System.out.println(teams.get(queue.get(0)).removeFirst());
                        }
                        break;
                    case "STOP":
                        running = false;
                        break;
                    default:
                        String[] aa = s.split(" ");
                        int team_name = Integer.parseInt(aa[1]);
                        int team_id = p.get(team_name);
                        if(teams.get(team_id).isEmpty())
                        {
                            queue.add(team_id);
                        }
                        teams.get(team_id).add(team_name);
                        break;
                }
            }
            System.out.println();
        }

    }
}
