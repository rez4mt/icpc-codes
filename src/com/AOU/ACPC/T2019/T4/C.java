package com.AOU.ACPC.T2019.T4;

import java.io.File;
import java.util.*;

public class C {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("coffee.in"));
        int T = sc.nextInt();
        HashMap<String , Integer> sizes = new HashMap<>();
        sizes.put("medium" , 1);
        sizes.put("large", 2);
        sizes.put("small",0);

        while (T-->0)
        {
            HashMap<String , user> pricelist = new HashMap<>();
            HashMap<String , coffee> set = new HashMap<>();
            int O = sc.nextInt();
            int O2 = sc.nextInt();

            while (O-->0)

            {
                String s = sc.next();
                set.put(s,new coffee( s, sc.nextInt(),sc.nextInt() , sc.nextInt()));
            }
            O = O2;
            while (O-->0)
            {
                String name = sc.next();
                if(!pricelist.containsKey(name))
                    pricelist.put(name , new user(name) );
                String size = sc.next();
                String coffeename = sc.next();
                coffee cof = set.get(coffeename);
                user u = pricelist.get(name);
                u.cost += cof.price[sizes.get(size)];
            }
            int cost = 100;
            SortedSet<user> sets = new TreeSet<>(pricelist.values());
            for (user u :
                    sets) {
                int finalc = (u.cost + (cost/sets.size()));
                if((finalc-1) % 5 ==0)
                    finalc--;
                else if((finalc+1) % 5 == 0)
                    finalc++;
                System.out.println(u.name+" "+finalc);
            }

        }
    }
    static class user implements Comparable<user>{
        String name  ;
        static int current = 0 ;
        int id = 0 ;
        int cost;
        @Override
        public int compareTo(user o) {
            return Integer.compare(id , o.id);
        }
        user(String name ){
            this.name = name ;
            id = ++current;
        }
    }
    static class coffee implements Comparable<coffee>{
        static int current_id = 1;
        @Override
        public int compareTo(coffee o) {
            return Integer.compare(id , o.id);
        }

        int id = 0 ;
        String name ;
        int[] price;
        coffee(String name , int... vals)
        {
            this.name = name ;
            price = vals;
            id = current_id++;
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }
    }
}
