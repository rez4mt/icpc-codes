package com.Judges.UVA;

import java.util.*;

public class U10258 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        sc.nextLine();
        Map<String,User> map;
        while (T-->0)
        {
            map = new HashMap<>();
            String d ;
            while (!(d = sc.nextLine()).equals(""))
            {

                String[] parts = d.split("\\s");
                if(parts[3].equals("C"))
                {
                    if(!map.containsKey(parts[0]))
                        map.put(parts[0],new User(parts[0]));

                    User u = map.get(parts[0]);

                    if(u.add(parts[1]))
                        u.incTime(parts[2]);
                }else if(parts[3].equals("I"))
                {
                    if(!map.containsKey(parts[0]))
                        map.put(parts[0],new User(parts[0]));

                    User u = map.get(parts[0]);

                    u.addIncorrect(parts[1]);
                }else
                {
                    if(!map.containsKey(parts[0]))
                        map.put(parts[0],new User(parts[0]));
                }
            }
            ArrayList<User> list = new ArrayList<>(map.values());
            Collections.sort(list);
            for (User u :
                    list) {
                System.out.printf("%s %d %d\n",u.id,u.solved.size(),u.timing);
            }
            System.out.println();

        }
    }
    static class User implements Comparable<User>{
        @Override
        public int compareTo(User o) {
            if(o.solved.size() == solved.size())
            {
                if(o.timing == timing)
                    return Integer.compare(id,o.id);

                return timing - o.timing;
            }
            else return o.solved.size() - solved.size();
        }

        ArrayList<String> solved;
        Map<String,Integer> incorrect;
        int timing = 0;
        int id = 0;
        public User(String id)
        {
            this.id = Integer.valueOf(id);
            solved = new ArrayList<String>();
            incorrect = new HashMap<>();
        }
        public boolean add(String question_id)
        {
            if(!solved.contains(question_id))
            {
                if(incorrect.containsKey(question_id))
                {
                    timing += incorrect.get(question_id);
                }
                solved.add(question_id);
                return true;
            }
            return false;
        }
        private void addIncorrect(String id)
        {
            if(incorrect.containsKey(id))
                incorrect.put(id,incorrect.get(id)+20);
            else incorrect.put(id,20);
        }
        public void incTime(String time)
        {
            timing += Integer.valueOf(time);
        }
        public void incTime(int time)
        {
            timing += time;
        }
    }
}
