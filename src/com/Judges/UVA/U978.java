package com.Judges.UVA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class U978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0)
        {

            int R = sc.nextInt();
            int NGreen = sc.nextInt();
            int NBlue = sc.nextInt();

            Comparator<Lem> mC = new Comparator<Lem>() {
                @Override
                public int compare(Lem o1, Lem o2) {
                    if(o1.race != o2.race)
                        return Integer.compare(o1.race, o2.race);
                    return Integer.compare(o2.power , o1.power);
                }
            };

            PriorityQueue<Lem> green = new PriorityQueue<>(mC);
            PriorityQueue<Lem> blue = new PriorityQueue<>(mC);
            for(int i = 0 ; i < NGreen ; i ++)
                green.offer(new Lem(sc.nextInt()));
            for(int i = 0 ; i < NBlue ; i++)
                blue.offer(new Lem(sc.nextInt()));
            //
            ArrayList<Lem> greenWaitList = new ArrayList<>();
            ArrayList<Lem> blueWaitList = new ArrayList<>();

            while (!green.isEmpty() && !blue.isEmpty())
            {
                int size = Math.min(R , Math.min(blue.size() , green.size()));
                for(int i = 0 ; i < size ; i++)
                {
                    Lem greenPeek = green.poll(), BluePeek = blue.poll();
                    if(greenPeek.power == BluePeek.power)
                        continue;
                    if(greenPeek.power>BluePeek.power)
                    {
                        greenPeek.power -= BluePeek.power;
                        greenWaitList.add(greenPeek);
                    }else
                    {
                        BluePeek.power -= greenPeek.power;
                        blueWaitList.add(BluePeek);
                    }
                }
                green.addAll(greenWaitList);
                blue.addAll(blueWaitList);

                blueWaitList.clear();
                greenWaitList.clear();

            }
            StringBuilder b = new StringBuilder();
            PriorityQueue<Lem> mp = new PriorityQueue<>(new Comparator<Lem>() {
                @Override
                public int compare(Lem o1, Lem o2) {
                    return o2.power - o1.power;
                }
            });
            if(green.isEmpty() && blue.isEmpty())
            {
                System.out.print("green and blue died");
            }else if(green.isEmpty())
            {
                mp.addAll(blue);
                while (!mp.isEmpty())
                    b.append(mp.poll().power+"\n");
                System.out.println("blue wins");
                b.deleteCharAt(b.length()-1);
            }else if(blue.isEmpty())
            {
                mp.addAll(green);
                while (!mp.isEmpty())
                    b.append(mp.poll().power+"\n");
                System.out.println("green wins");
                b.deleteCharAt(b.length()-1);
            }
            System.out.println(b.toString());
            if(T!=0)
                System.out.println();
        }
    }

    static class Lem{
        int power , race = 0;
        public Lem(int n)
        {
            power = n;

        }
    }

}
