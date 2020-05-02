package com.Judges.CodeForce.CF1316;
import java.util.*;

public class B {
    static boolean DEBUG = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {
            int n= sc.nextInt();
            String s = sc.next();
            TreeSet<res> set = new TreeSet<>();

            StringBuilder odds = new StringBuilder(s);
            StringBuilder even = new StringBuilder(s);

            even.append(even.charAt(0));
            even.deleteCharAt(0);

            set.add(new res(even.toString(),2));
            set.add(new res(odds.toString() , 1));
            int mk = 0 ;
            if(n%2==0)
            {
                for(int i = 0 ; i< 2 ; i++)
                {
                    odds.insert(odds.length()-mk , odds.charAt(0));
                    odds.deleteCharAt(0);
                    mk++;
                }
                set.add(new res(odds.toString() , 3));


                for(int k = 4 ; k<= n ;k++)
                {
                    if(k%2==0)
                    {
                        //take last odd , and swape.
                        for(int i = 0 ; i< 2 ; i++)
                        {
                            odds.insert(odds.length()-mk , odds.charAt(0));
                            odds.deleteCharAt(0);
                            mk++;
                        }
                        set.add(new res(odds.toString() , k));
                    }else
                    {
                        //even.. swap two
                        even.append(even.charAt(0));
                        even.deleteCharAt(0);
                        even.append(even.charAt(0));
                        even.deleteCharAt(0);
                        set.add(new res(even.toString() , k));
                    }
                }
            }else
            {
                for(int k = 3 ; k<= n ;k++)
                {
                    if(k%2==1)
                    {

                        //take last odd , and swape.
                        for(int i = 0 ; i< 2 ; i++)
                        {
                            odds.insert(odds.length()-mk , odds.charAt(0));
                            odds.deleteCharAt(0);
                            mk++;
                        }
                        set.add(new res(odds.toString() , k));
                    }else
                    {
                        //even.. swap two
                        even.append(even.charAt(0));
                        even.deleteCharAt(0);
                        even.append(even.charAt(0));
                        even.deleteCharAt(0);
                        set.add(new res(even.toString() , k));
                    }
                }
            }

            if(DEBUG)
            {
                System.out.println(set);

            }else
            {
                System.out.println(set.pollFirst());

            }


        }
    }
    static class res implements Comparable<res>
    {
        int k ;
        String v ;

        @Override
        public int compareTo(res o) {
            /*return Integer.compare(k , o.k);*/
            if(!DEBUG)
            return v.compareTo(o.v);
            else return Integer.compare(k , o.k);
        }
        public res(String s , int k)
        {
            this.v = s;
            this.k = k ;
        }

        @Override
        public boolean equals(Object o) {
            if(o instanceof  String)
            {
                String aa = (String)o;
                return v.equals(aa);
            }
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            res res = (res) o;
            return k == res.k &&
                    Objects.equals(v, res.v);
        }

        @Override
        public int hashCode() {
            return Objects.hash(k, v);
        }

        @Override
        public String toString() {
            if(!DEBUG)
            return v+"\n"+k;
            /*return k+" "+v;*/
            else return k+" "+v;
        }
    }
}