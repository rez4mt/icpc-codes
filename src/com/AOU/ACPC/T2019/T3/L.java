package com.AOU.ACPC.T2019.T3;

import java.util.HashMap;
import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String , Integer> first_list = new HashMap<>();
        HashMap<String , Integer> second_list = new HashMap<>();
        StringBuilder final_first_list = new StringBuilder();
        StringBuilder final_second_list = new StringBuilder();
        int T  = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < T ; i++)
        {
            String op = sc.next();
            switch (op)
            {
                case "define":
                    String name = sc.next();
                    if(!first_list.containsKey(name))
                        first_list.put(name , first_list.size());
                    final_first_list.append("define "+first_list.get(name));
                    break;
                case "print":
                    name = sc.next();
                    final_first_list.append("print "+first_list.get(name));
                    break;
                case "read":
                    name = sc.next();
                    final_first_list.append("read "+first_list.get(name));
                    break;
                default:
                    //split op
                    String[] list = op.split("=");
                    String[] plus = list[1].split("\\+");
                    final_first_list.append(first_list.get(list[0])+"="+first_list.get(plus[0])+"+"+first_list.get(plus[1]));
                    break;
            }
        }
        T = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < T ; i++)
        {
            String op = sc.next();
            switch (op)
            {
                case "define":
                    String name = sc.next();
                    if(!second_list.containsKey(name))
                        second_list.put(name , second_list.size());
                    final_second_list.append("define "+second_list.get(name));
                    break;
                case "print":
                    name = sc.next();
                    final_second_list.append("print "+second_list.get(name));
                    break;
                case "read":
                    name = sc.next();
                    final_second_list.append("read "+second_list.get(name));
                    break;
                default:
                    //split op
                    String[] list = op.split("=");
                    String[] plus = list[1].split("\\+");
                    final_second_list.append(second_list.get(list[0])+"="+second_list.get(plus[0])+"+"+second_list.get(plus[1]));
                    break;
            }
        }
        if(final_first_list.toString().equals(final_second_list.toString()))
            System.out.println("YES");
        else System.out.println("NO");

    }
}
