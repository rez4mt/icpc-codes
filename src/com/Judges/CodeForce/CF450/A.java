package com.Judges.CodeForce.CF450;

import java.util.PriorityQueue;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while (N-->0)
            pq.offer(sc.nextInt());
        StringBuilder b = new StringBuilder();
        while (!pq.isEmpty())
            b.append(pq.poll()+" ");
        b.deleteCharAt(b.length()-1);
        System.out.println(b.toString());
    }
}
