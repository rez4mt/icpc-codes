package com.Judges.uri;

import java.util.HashMap;
import java.util.Scanner;

public class P1283 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int count = s.nextInt();
            HashMap<String, Double> items = new HashMap<>();
            HashMap<String, Integer> list = new HashMap<>();

            for (int j = 0; j < count; j++) {
                items.put(s.next(), s.nextDouble());
            }
            count = s.nextInt();
            for (int j = 0; j < count; j++) {
                list.put(s.next(), s.nextInt());
            }

            double price = 0.0;
            for(String key : list.keySet()) {
                price += items.get(key) * list.get(key);
            }

            System.out.printf("R$ %.2f\n", price);
        }
    }
}