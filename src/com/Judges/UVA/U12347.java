package com.Judges.UVA;


import java.util.*;

public class U12347 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BSTree bsTree = new BSTree();
        while (sc.hasNext())
        {
            bsTree.insert(sc.nextInt());
        }
        bsTree.postOrder(bsTree.root);
    }

    static class Tree{
        Node root;

        static class Node{
            Node left,right;
            int data;
            public Node(int data)
            {
                this.data = data;
                left = right = null;
            }
        }
    }
    static class BSTree extends Tree{
        public void insert(int x)
        {
            root = insert(root,x);
        }
        public Node insert(Node root,int x)
        {
            if(root == null)
                root = new Node(x);
            if(root.data > x)
            {
                root.left = insert(root.left,x);
            }else if(root.data < x)
                root.right = insert(root.right,x);

            return root;
        }
        public void postOrder(Node root)
        {
            if(root == null)
                return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }

}
