package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class nlogk {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
            list.add(sc.nextInt());
        int[] index = new int[list.size()+1];
        Arrays.fill(index,Integer.MAX_VALUE);
        index[0] = Integer.MIN_VALUE;
        int current_index = 1;
        for(int i = 0 ; i < list.size();i++)
        {
            if(list.get(i) > index[current_index-1])
            {
                index[current_index++] = list.get(i);
            }else if(list.get(i) < index[current_index-1]){
                index[current_index-1] = list.get(i);
            }else{
                int ind = Arrays.binarySearch(index,list.get(i));
                if(ind<0)
                    ind *= -1;
                index[ind] = list.get(i);
            }
        }
        System.out.println(current_index-1);
    }
}
