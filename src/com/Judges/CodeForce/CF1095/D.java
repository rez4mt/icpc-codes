package com.Judges.CodeForce.CF1095;

import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Node> list = new HashMap<>();
        while (n-->0)
        {
            int id = sc.nextInt();
            int next = sc.nextInt();
            if(list.containsKey(id))
            {
                Node node = list.get(id);
                if(list.containsKey(next))
                {
                    Node child = list.get(next);
                    if(child.left == 0)
                    {
                        node.right = next;
                        child.left = id;
                    }else if(child.right == 0)
                    {
                        node.left = next;
                        child.right = id;
                    }
                }else
                {
                    Node child = new Node(next);
                    if(node.left == 0)
                    {
                        child.right = id;
                        node.left = next;
                    }else if(node.right == 0)
                    {
                        child.left = id;
                        node.right = next;
                    }else continue;
                    list.put(next,child);

                }
            }else
            {
                Node node = new Node(id);
                if(list.containsKey(next))
                {
                    Node child = list.get(next);
                    if(child.right == 0)
                    {
                        child.right = id;
                        node.left = next;
                    }else
                    {
                        child.left = id;
                        node.right = next;
                    }

                }else
                {
                    Node child = new Node(next);
                    node.left = next;
                    child.right = id;
                    list.put(next,child);
                }
                list.put(id,node);
            }
        }
        for (Node node :
                list.values()) {
            if(node.right != 0 )
            {
                Node c = list.get(node.right);
                if(c.left == 0)
                    c.left = node.id;
            }else if(node.left != 0)
            {
                Node c = list.get(node.left);
                if(c.right==0)
                    c.right = node.id;
            }
        }
        int first_key = (int) list.keySet().toArray()[0];
        int current = list.get(first_key).right;

        //System.out.println(list);
        StringBuilder b = new StringBuilder();
        b.append(current);
        b.append(" ");
        while (current!=first_key)
        {
            int temp = list.get(current).right;
            b.append(temp);
            b.append(" ");
            current = temp;
        }
        System.out.println(b);
    }


    private static class Node{
        int right = 0;
        int left = 0;
        int id = 0;

        Node( int id )
        {
            this.id = id;
        }
        @Override
        public String toString() {
            return String.format("{%d %d %d}",id,left,right);
        }
    }


}
