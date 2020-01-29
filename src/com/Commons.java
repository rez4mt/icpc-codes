package com;

import java.util.Random;

public class Commons {
    public static void print(Object[][] map)
    {
        for(int i = 0 ; i < map.length ;i++)
        {
            for(int j = 0 ; j < map[i].length;j++)
                System.out.printf("%3s ",map[i][j]);
            System.out.println();
        }
    }
    public static void print(int[][] map)
    {
        for(int i = 0 ; i < map.length ;i++)
        {
            for(int j = 0 ; j < map[i].length;j++)
                System.out.printf("%3s ",map[i][j]);
            System.out.println();
        }
    }
    public static void print(long[][] map)
    {
        for(int i = 0 ; i < map.length ;i++)
        {
            for(int j = 0 ; j < map[i].length;j++)
                System.out.printf("%3s ",map[i][j]);
            System.out.println();
        }
    }

    public static int randInt(int min, int max) {

        // NOTE: This will (intentionally) not run as written so that folks
        // copy-pasting have to think about how to initialize their
        // Random instance.  Initialization of the Random instance is outside
        // the main scope of the question, but some decent options are to have
        // a field that is initialized once and then re-used as needed or to
        // use ThreadLocalRandom (if using at least Java 1.7).
        //
        // In particular, do NOT do 'Random rand = new Random()' here or you
        // will get not very good / not very random results.
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
}
