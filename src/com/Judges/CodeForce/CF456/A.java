package com.Judges.CodeForce.CF456;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Laptops[] list = new Laptops[T];
        for(int i = 0; i < T ; i ++)
            list[i] = new Laptops(sc.nextInt(),sc.nextInt());
        Arrays.sort(list);
        for(int i = 0 ; i < T-1 ; i++)
        {
            if(list[i].price < list[i+1].price)
            {
                System.out.println("Happy Alex");
                return;
            }
        }
        System.out.println("Poor Alex");
    }

    static class Laptops implements Comparable<Laptops>
    {
        int price,quality;
        @Override
        public int compareTo(Laptops o) {
            return Integer.compare(o.quality,quality);
        }
        public Laptops(int price,int quality)
        {
            this.price = price;
            this.quality = quality;

        }

        @Override
        public String toString() {
            return String.format("{%d %d}",quality,price);
        }
    }
}
