package com.ICPC.GPC.P15;

import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        HashMap<String,Country> countries = new HashMap<>();
        while (T-->0)
        {
            String cName=  sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int w = sc.nextInt();
            int h = sc.nextInt();
            long p = sc.nextInt();
            if(!countries.containsKey(cName))
                countries.put(cName,new Country(cName));
            Country c = countries.get(cName);
            c.addBlock(x,y,w,h,p);
        }

        int x,y,R;
        x = sc.nextInt();
        y = sc.nextInt();
        R = sc.nextInt();
        int mx = x - R;
        int yx = y - R;
        if(mx <0) mx = 0;
        if(yx <0) yx = 0;
        Rectangle2D impact = new Rectangle2D.Double(mx,yx,2*R,2*R);
        HashMap<String,Died> died = new HashMap<>();
        for (Country c : countries.values())
        {
            for (Block b :
                    c.blocks){
                if(b.rect.intersects(impact))
                {
                    //add it
                    if(!died.containsKey(c.name))
                        died.put(c.name,new Died(c.name));
                    Died d = died.get(c.name);
                    d.block_count++;
                    //get intersection area add it d.p;
                    double minX = Math.max(b.rect.getMinX(),impact.getMinX());
                    double maxX = Math.min(b.rect.getMaxX(),impact.getMaxX());
                    double minY = Math.max(b.rect.getMinY(),impact.getMinY());
                    double maxY = Math.min(b.rect.getMaxY(),impact.getMaxY());
                    double area = Math.abs(minX-maxX) * Math.abs(minY-maxY);
                    double addArea = b.rect.getWidth()*b.rect.getHeight();


                    double ratio =1- (addArea/area);
                    if(ratio<= 1E-9)
                    {
                        d.p += b.p;
                        continue;
                    }
                    d.p += b.p * ratio;

                }
            }
        }
        TreeSet<Died> set = new TreeSet<>(died.values());
        for (Died d :
                set) {
            System.out.println(d.toString());
            if(d.p == countries.get(d.name).p)
                System.out.println(d.name+" is wiped out");
        }
    }
    static class Died implements Comparable<Died>{
        int block_count = 0;
        double p = 0;
        String name;

        @Override
        public String toString() {
            return name+" "+block_count+" "+String.format("%.2f",p);
        }

        @Override
        public int compareTo(Died o) {
            return name.compareTo(o.name);
        }
        public Died(String n)
        {
            name = n;
        }

    }
    static class Block{
        Rectangle2D rect;
        long p;
        public Block(int x, int y , int w , int h , long p)
        {
            this.p += p;
           rect = new Rectangle2D.Double(x,y,w,h);
        }

    }

    static class Country
    {
        String name;
        ArrayList<Block> blocks;
        long p = 0;
        public Country(String name){
            this.name = name;
            blocks = new ArrayList<>();

        }

        public void addBlock(int x, int y , int w , int h , long p)
        {
            blocks.add(new Block(x,y,w,h,p));
            this.p = p;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}
