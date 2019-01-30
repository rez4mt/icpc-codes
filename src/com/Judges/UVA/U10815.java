package com.Judges.UVA;

import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class U10815 {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        String in;
        StringBuilder bf = new StringBuilder();
        while (sc.hasNextLine())
        {
            bf.append(sc.nextLine());
            bf.append("\n");
        }

        PriorityQueue<String> queue=new PriorityQueue<>();
        Matcher matcher = Pattern.compile("[A-Za-z]+", Pattern.MULTILINE).matcher(bf.toString());
        while (matcher.find())
        {
            in = matcher.group(0).toLowerCase();
            if(!words.contains(in))
            {
                words.add(in);
                queue.offer(in);
            }
        }
        while (!queue.isEmpty()) System.out.println(queue.poll());

    }
}
