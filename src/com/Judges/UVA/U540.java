package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class U540 {
    public static void main(String[] args) throws IOException {
        FR sc = new FR();
        PrintWriter pw = new PrintWriter(System.out);
        int c =0;
        while (true)
        {
            int team_count = sc.nextInt();
            if(team_count == 0)
                break;
            if(c++!=0)
                pw.println();
            pw.printf("Scenario #%d\n",c);

            HashMap<String,Integer> teams = new HashMap<>();
            HashMap<Integer,ArrayDeque<String>> teams_q_id = new HashMap<>();
            ArrayDeque<Integer> team_q = new ArrayDeque<>();
            for(int i = 0 ; i < team_count ;i++)
            {
                int players_count = sc.nextInt();
                for(int j = 0 ; j < players_count ; j++)
                    teams.put(sc.next(),i);
            }
            boolean stopped = false;
            while (!stopped)
            {
                String op = sc.next();
                switch (op.charAt(0))
                {
                    case 'E':
                        //check if q is available
                        String player_id = sc.next();
                        int team_id = teams.get(player_id);
                        if(!teams_q_id.containsKey(team_id) || !team_q.contains(team_id))
                        {
                            teams_q_id.put(team_id,new ArrayDeque<>());
                            team_q.add(team_id);
                        }
                        teams_q_id.get(team_id).add(player_id);
                        break;
                    case 'D':
                        String player = teams_q_id.get(team_q.peek()).remove();
                        pw.append(player);
                        pw.append('\n');
                        if(teams_q_id.get(team_q.peek()).isEmpty())
                            team_q.remove();

                        break;
                    case 'S':
                        stopped = true;
                        break;
                }
            }
        }
        pw.append("\n");
        pw.flush();
        pw.close();
    }

    static class FR{
        BufferedReader br;
        StringTokenizer st;
        public FR()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException
        {
            if(st == null || !st.hasMoreTokens())
            {
                st = new StringTokenizer(br.readLine());
                return next();
            }

            return st.nextToken();
        }
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}
