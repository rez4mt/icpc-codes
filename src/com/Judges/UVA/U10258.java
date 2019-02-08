package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class U10258 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.valueOf(bf.readLine());
        bf.readLine();
        List<Users> list;
        HashMap<String,Integer> indexes ;
        boolean first = true;
        while (TC-->0)
        {
            String line ;
            indexes = new HashMap<>();
            list = new ArrayList<>();
            line = bf.readLine();
            if(!first)
            {
                System.out.println();
            }




            first = false;
            while ( line !=null && !line.isEmpty())
            {
                String[] parts = line.split("\\s");
                // 0 1       2    3
                //id problem time OP
                if(!indexes.containsKey(parts[0]))
                {
                    list.add(list.size(),new Users(parts[0]));
                    indexes.put(parts[0],list.size()-1);
                }

                Users u = list.get(indexes.get(parts[0]));
                switch (parts[3])
                {
                    case "I":
                        u.addPenalty(parts[1]);
                        break;
                    case "C":
                        u.setSolved(parts[1],parts[2]);
                        break;
                }
                line = bf.readLine();
            }
            Collections.sort(list);
            for (Users u :
                    list) {
                System.out.println(u.toString());;
            }
        }

    }
    static class Users implements  Comparable<Users>
    {
        String id ;
        long penalty;
        HashMap<String,Integer> unsolvedPenalty;
        HashSet<String> solved;
        HashMap<String,Long> solvedPenalties ;
        @Override
        public int compareTo(Users o) {
            if(solved.size() == o.solved.size())
            {
                if(o.penalty == penalty)
                {
                    return Integer.compare(Integer.valueOf(id),Integer.valueOf(o.id));
                }
                return penalty < o.penalty ? -1 : 1;
            }
            return solved.size()> o.solved.size() ? -1 : 1;
        }

        public Users(String id)
        {
            this.id = id;
            penalty = 0;
            unsolvedPenalty = new HashMap<>();
            solved = new HashSet<>();
            solvedPenalties = new HashMap<>();
        }
        public void setSolved(String q,String time)
        {
            if(solved.contains(q))
                return;
            solved.add(q);
            solvedPenalties.put(q,Long.valueOf(time) + unsolvedPenalty.getOrDefault(q,0));
            penalty += solvedPenalties.get(q);
        }
        public void addPenalty(String q)
        {
            if(unsolvedPenalty.containsKey(q))
                unsolvedPenalty.put(q,unsolvedPenalty.get(q)+20);
            else unsolvedPenalty.put(q,20);
        }
        @Override
        public String toString() {
            return String.format("%s %s %s",id,solved.size(),penalty);
        }
    }
}
