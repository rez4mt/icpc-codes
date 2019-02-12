package com.Judges.UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Scanner;

public class U112 {
    static int pos = 0;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder b;
        int count;
        int a;
        while (sc.hasNext())
        {

            a = sc.nextInt();
            boolean init = false;
            count = 0;
            pos = 0;
            b = new StringBuilder();
            b.delete(0,b.length());
            while (!init || count!=0)
            {
                if(!sc.hasNext())
                    break;
                init = true;
                String line = sc.nextLine();
                if(line.isEmpty())
                {
                    init = count!=0;
                    continue;
                }
                count += (line.length()-line.replaceAll("\\(","").length())- (line.length()-line.replaceAll("\\)","").length()) ;
                b.append(line.replaceAll(" ",""));
            }
            Tree t = new Tree();
            t.root = create(b.toString());
            System.out.println(t.find(a,t.root,0)?"yes":"no");
        }
    }

    static Node create(String data)
    {
        if(data.charAt(pos) == '(')
        {
            pos++;
            return create(data);
        }
        if(data.charAt(pos) == ')')
        {
            pos++;
            return null;
        }
        int num = getNum(data);
        Node n = new Node(num);
        n.left = create(data);
        n.right = create(data);
        pos++;
        return n;

    }
    public static int getNum(String data)
    {
        int n;
        boolean neg = false;
        int startPos = pos;
        if(data.charAt(pos) == '-')
        {
            pos++;
        }
        while (Character.isDigit(data.charAt(pos)))
            pos++;

        n = Integer.valueOf(data.substring(startPos,pos));
        return neg ? -1* n : n;
    }
    static class Node{
        Node left,right;
        int data;
        public Node(int n)
        {
            data = n;
        }
    }
    static class Tree{
        Node root;
        public void clear()
        {
            root = null;
        }
        boolean find(int goal,Node n,int current)
        {
            if(n == null)
                return false;
            if(n.right == null && n.left == null)
                return goal == current+n.data;
            return find(goal,n.left,current + n.data)||find(goal,n.right,current+n.data);

        }
        void inOrder(Node n)
        {
            if(n == null)
                return;
            inOrder(n.left);
            System.out.print(n.data +" ");
            inOrder(n.right);
        }
    }
}
