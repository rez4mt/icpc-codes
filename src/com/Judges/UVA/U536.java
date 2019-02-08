package com.Judges.UVA;


import java.io.IOException;
import java.util.Scanner;

public class U536 {

    public static void main(String[] args) throws IOException {
        //C:\Users\r_mot\Desktop\java-app\URI\URI\src\com\Judges\CodeForce
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            Tree t = new Tree();
            String preOrder = sc.next();
            String inOrder = sc.next();
            t.root = create(inOrder,preOrder);
            System.out.println(t.postOrder(t.root).trim());
        }
    }
    static Node create(String inOrder, String preOrder)
    {
        Node root = null;
        if(inOrder == null || inOrder.isEmpty())
            return null;

        char rData = preOrder.charAt(0);

        root = new Node(rData-'A') ;

        int index = inOrder.indexOf(rData);


        String r = inOrder.substring(index+1);
        String l = inOrder.substring(0,index);

        String l2 = preOrder.substring(1,1+l.length());
        String r2 = preOrder.substring(1+l.length());

        root.right = create(r,r2);
        root.left = create(l,l2);

        return root;
    }


    static class Node {
        int value;
        Node left,right;
        public Node(Integer x)
        {
            value = x;
            left = right = null;


        }

    }
    static class Tree{
        Node root;
        public String postOrder(Node root)
        {
            if(root == null)
                return"";
            StringBuilder b = new StringBuilder();
            b.append(postOrder(root.left));
            b.append(postOrder(root.right));
            b.append((char)(root.value+'A'));
            return b.toString();
        }
    }
}
