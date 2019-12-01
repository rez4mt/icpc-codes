    package com.Judges.CodeForce.CF1249;

    import java.util.*;

    public class A {
        public static void main1(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            int c = 1;
            while (T-->0)
            {

                int N = sc.nextInt();
                HashSet<Integer> set = new HashSet<>();
                boolean zero = true;
                for(int i = 0 ; i < N ; i++)
                {

                    int aa = sc.nextInt();
                    if(set.contains(aa-1) || set.contains(aa+1))
                        zero = false;
                    set.add(aa);
                }
                if(c==72)
                {
                    System.out.println("73 :" + set.toString());
                }
                if(zero)
                    System.out.println(1);
                else System.out.println(2);
                c++;
            }

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();

            while (T-->0)
            {
                int N = sc.nextInt();
                int mx = 0 ;
                int[][] teams = new int[101][101];
                int[] vals = new int[N];
                for(int i = 0 ; i < N ; i++)
                    vals[i] = sc.nextInt();
                for(int i = 0 ; i < N ;i++)
                {
                    for(int j = 0 ; j <= mx ;j++)
                    {
                        boolean flag = true;
                        int last_k = 0;
                        for(int k = 0 ; k < 101 ; k++)
                        {
                            last_k = k;
                            if(teams[j][k] == 0)
                            {
                                break;
                            }
                            if(Math.abs(vals[i] - teams[j][k]) <= 1)
                            {
                                flag = false;
                                break;
                            }


                        }
                        if(flag)
                        {
                            teams[j][last_k] = vals[i];
                            break;
                        }
                        if(j == mx)
                            mx++;

                    }
                }
                if(N == 0)
                    System.out.println(0);
                else
                    System.out.println(mx+1);
            }
        }
    }
